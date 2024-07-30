package com.blog.BlogApplication.controller;

import com.blog.BlogApplication.model.BlogApp;
import com.blog.BlogApplication.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class HomeController {

  @Autowired
  private BlogService service;
  @GetMapping("/")
  public String home() {
    return "Hurray!  Your Application is Working .Try Hitting Different Endpoints to get the desired results.";
  }

  @GetMapping("/blogs")
  public List<BlogApp> getBlogs() {
    return service.getBlogs();
  }

  @GetMapping("/blog/{id}")
  public Optional<BlogApp> getBlog(@PathVariable Long id) {
        return service.getBlog(id);
    }

  @PostMapping("/addBlog")
  public String addBlog(@RequestBody BlogApp blog) {
    String s = service.addBlog(blog);
    return "Blog Added Successfully";
  }

  @DeleteMapping("/deleteBlog/{id}")
  public String deleteBlog(@PathVariable Long id) {
        return service.deleteBlog(id);
  }

  @PutMapping("/updateBlog")
  public String updateBlog(@RequestBody BlogApp blog) {
        return service.updateBlog(blog);
    }

  @GetMapping("/search/{keyword}")
    public List<BlogApp> searchBlog(@PathVariable String keyword) {
            return service.searchBlog(keyword);
        }


}
