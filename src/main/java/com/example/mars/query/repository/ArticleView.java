package com.example.mars.query.repository;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ArticleView {
    private String id;
    private String subject;
    private String content;
}
