package com.example.mars.api.member;

import com.example.mars.api.member.dto.MemberRequest;
import com.example.mars.command.application.MemberCommandService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/member")
@RequiredArgsConstructor
public class MemberCommand {

    private final MemberCommandService service;

    @PostMapping
    public ResponseEntity<String> save(@RequestBody MemberRequest request) {
        service.save(request.name(), request.age());

        return ResponseEntity.ok("success");
    }

    @PutMapping("/{uid}")
    public ResponseEntity<String> update(@PathVariable String uid, @RequestBody MemberRequest request) {
        service.update(uid, request.name(), request.age());

        return ResponseEntity.ok("success");
    }
}
