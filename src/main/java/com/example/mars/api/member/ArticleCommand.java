package com.example.mars.api.member;

import com.example.mars.api.member.dto.ArticleRequest;
import com.example.mars.command.application.ArticleCommandService;
import com.example.mars.command.dto.ArticleDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/article")
@RequiredArgsConstructor
public class ArticleCommand {

    private final ArticleCommandService service;


    @PostMapping
    public ResponseEntity<String> write(@RequestBody ArticleRequest request) {
        ArticleDto dto = new ArticleDto(request.memberId(), request.subject(), request.content());

        service.write(dto);

        return ResponseEntity.ok("success");
    }
}
