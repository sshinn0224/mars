package com.example.mars.api.member;

import com.example.mars.api.member.dto.MemberRequest;
import com.example.mars.command.application.MemberCommandService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class MemberCommand {

    private final MemberCommandService service;

    @PostMapping("/member")
    public ResponseEntity<String> save(@RequestBody MemberRequest request) {
        service.save(request.name(), request.age());

        return ResponseEntity.ok("success");
    }
}
