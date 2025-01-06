package com.example.mars.command.application;

import com.example.mars.command.domain.Member;
import com.example.mars.command.domain.MemberCommandRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberCommandService {

    private final MemberCommandRepository repository;

    public void save(String name, Integer age) {
        Member member = new Member(name, age);
        repository.save(member);
    }

    public void modify(String id, String name, Integer age) {
        Member member = repository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("찾을 수 없습니다."));

        member.modify(name, age);
        repository.save(member);
    }

    public void updateAddress(String id, String address) {
        Member member = repository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("찾을 수 없습니다."));

        member.updateAddress(address);
        repository.save(member);
    }
}
