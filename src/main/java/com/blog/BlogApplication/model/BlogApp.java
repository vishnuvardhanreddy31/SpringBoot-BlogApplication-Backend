package com.blog.BlogApplication.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class BlogApp {
    @Id
    private Long id;
    private String title;
    private String content;
    private String author;
    private String date;
}
