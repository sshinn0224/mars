package com.example.mars.api.member;

import com.example.mars.query.application.ArticleQueryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api")
@RequiredArgsConstructor
@RestController
public class ArticleQuery {

    private final ArticleQueryService service;

    @GetMapping("/article/{id}")
    public ResponseEntity<?> get(@PathVariable String id) {
         return ResponseEntity.ok(service.fetchOneArticle(id));
    }
}
