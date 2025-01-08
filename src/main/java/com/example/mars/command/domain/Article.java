package com.example.mars.command.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@Document(collection = "article")
public class Article {
    @Id
    private String id;
    private String subject;
    private String content;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Article(String subject, String content) {
        this.subject = subject;
        this.content = content;
        this.createdAt = LocalDateTime.now();
    }

    public void modify(String subject, String content) {
        this.subject = subject;
        this.content = content;
        this.updatedAt = LocalDateTime.now();
    }
}
