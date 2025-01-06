package com.example.mars.api.member;

import com.example.mars.query.application.MemberQueryService;
import com.example.mars.query.repository.MemberView;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class MemberQuery {

    private final MemberQueryService service;

    @GetMapping("/member/{uid}")
    public ResponseEntity<MemberView> findMember(@PathVariable String uid) {
        MemberView view = service.findById(uid);

        return ResponseEntity.ok(view);
    }
}
