package com.example.mars.command.application;

import com.example.mars.command.domain.Post;
import com.example.mars.command.dto.PostDto;
import com.example.mars.command.repository.PostCommandJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PostCommandService {

    private final PostCommandJpaRepository repository;

    public void save(PostDto dto) {
        Post post = new Post(dto.subject(), dto.contents());

        repository.save(post);
    }
}
