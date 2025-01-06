package com.example.mars.api.member;

import com.example.mars.api.member.dto.MemberAddressRequest;
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

    @PutMapping("/{id}")
    public ResponseEntity<String> modify(@PathVariable String id, @RequestBody MemberRequest request) {
        service.modify(id, request.name(), request.age());

        return ResponseEntity.ok("success");
    }

    @PutMapping("/{id}/address")
    public ResponseEntity<String> updatePassword(@PathVariable String id, @RequestBody MemberAddressRequest request) {
        service.updateAddress(id, request.address());

        return ResponseEntity.ok("success");
    }
}
