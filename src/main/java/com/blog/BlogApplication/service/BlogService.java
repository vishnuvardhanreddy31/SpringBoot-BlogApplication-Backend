package com.blog.BlogApplication.service;

import com.blog.BlogApplication.model.BlogApp;
import com.blog.BlogApplication.repo.BlogRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlogService {
    @Autowired
    private BlogRepo repo;

    // Method to get all the blogs
    public List<BlogApp> getBlogs() {
        return repo.findAll();
    }

    // Method to get a blog by id
    public Optional<BlogApp> getBlog(Long id) {
        return Optional.ofNullable(repo.findById(id).orElse(null));
    }

    // Method to add a blog
    public String addBlog(BlogApp blog) {
        repo.save(blog);
        return "Blog Added Successfully";
    }

    // Method to delete a blog
    public String deleteBlog(Long id) {
        repo.deleteById(id);
        return "Blog Deleted Successfully";
    }

    // Method to update a blog
    public String updateBlog(BlogApp blog) {
        repo.save(blog);
        return "Blog Updated Successfully";
    }

    // Method to search a blog by keyword
    public List<BlogApp> searchBlog(String keyword) {
        return repo.findByTitleContainingOrContentContaining(keyword,keyword);
    }






}
