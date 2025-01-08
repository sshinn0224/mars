package com.example.mars.command.domain;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ArticleCommandRepository extends MongoRepository<Article, String> {
}
