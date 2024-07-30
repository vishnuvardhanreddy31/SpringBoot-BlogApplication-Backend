package com.blog.BlogApplication.repo;

import com.blog.BlogApplication.model.BlogApp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BlogRepo extends JpaRepository<BlogApp, Long> {

    List<BlogApp> findByTitleContainingOrContentContaining(String keyword1, String keyword2);
}
