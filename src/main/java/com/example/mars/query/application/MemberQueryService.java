package com.example.mars.query.application;

import com.example.mars.command.domain.Member;
import com.example.mars.query.repository.MemberQueryRepository;
import com.example.mars.query.repository.MemberView;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberQueryService {

    private final MemberQueryRepository repository;

    public MemberView findById(String uid) {
        Member member = repository.findById(uid)
                .orElseThrow(() -> new IllegalArgumentException("찾을 수 없습니다."));

        return new MemberView(member.getName(), member.getAge());
    }
}