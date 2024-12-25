package com.example.mars.command.application;

import com.example.mars.command.domain.Member;
import com.example.mars.command.domain.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberCommandService {

    private final MemberRepository repository;

    public void save(String name, Integer age) {
        Member member = new Member(name, age);
        repository.save(member);
    }

    public void updateAge(String name, Integer age) {

    }
}
