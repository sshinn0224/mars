package com.example.mars.api.member;

import com.example.mars.api.member.dto.PostRequest;
import com.example.mars.command.application.PostCommandService;
import com.example.mars.command.dto.PostDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/post")
public class PostCommand {

    private final PostCommandService service;

    @PostMapping
    public ResponseEntity<?> writePost(@RequestBody PostRequest req) {
        PostDto dto = new PostDto(req.subject(), req.contents());
        service.save(dto);

        return ResponseEntity.ok("success");
    }
}
