package com.example.mars.command.application;

import com.example.mars.command.domain.Article;
import com.example.mars.command.domain.ArticleCommandRepository;
import com.example.mars.command.dto.ArticleDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ArticleCommandService {

    private final ArticleCommandRepository repository;

    public void write(ArticleDto dto) {
        Article article = new Article(dto.subject(), dto.content());

        repository.save(article);
    }
}
