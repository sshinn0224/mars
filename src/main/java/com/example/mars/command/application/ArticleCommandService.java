package com.example.mars.command.application;

import com.example.mars.command.domain.Article;
import com.example.mars.command.domain.ArticleCommandRepository;
import com.example.mars.command.domain.Member;
import com.example.mars.command.dto.ArticleDto;
import com.example.mars.query.repository.MemberQueryRepository;
import com.example.mars.query.repository.MemberView;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ArticleCommandService {

    private final MemberQueryRepository memberQueryRepository;
    private final ArticleCommandRepository repository;

    public void write(ArticleDto dto) {
        Member member = memberQueryRepository.findById(dto.memberId())
                .orElseThrow(() -> new IllegalArgumentException("맴버를 찾을 수 없습니다."));
        Article article = new Article(dto.subject(), dto.content(), member);

        repository.save(article);
    }
}
