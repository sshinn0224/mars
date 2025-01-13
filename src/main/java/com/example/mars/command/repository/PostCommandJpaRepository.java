package com.example.mars.command.repository;

import com.example.mars.command.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface PostCommandJpaRepository extends JpaRepository<Post, UUID> {
}
