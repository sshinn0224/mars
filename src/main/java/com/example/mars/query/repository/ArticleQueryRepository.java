package com.example.mars.query.repository;

import com.example.mars.command.domain.Article;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ArticleQueryRepository extends MongoRepository<Article, String> {


    @Query(value = "{ '_id': ?0 }", fields = "{ 'subject': 1, 'content': 1, 'author': 1 }")
    ArticleView findOneArticle(String id);
}
