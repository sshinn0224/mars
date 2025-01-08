package com.example.mars.query.application;

import com.example.mars.query.repository.ArticleQueryRepository;
import com.example.mars.query.repository.ArticleView;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ArticleQueryService {

    private final ArticleQueryRepository repository;

    public ArticleView fetchOneArticle(String id) {
        return repository.findOneArticle(id);
    }
}
