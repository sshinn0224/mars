package com.example.mars.command.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "t_post")
@NoArgsConstructor
@Getter
@EntityListeners(AuditingEntityListener.class)
public class Post {

    @Id
    @GeneratedValue
    @Column(columnDefinition = "BINARY(16)")
    private UUID id;

    private String subject;

    private String contents;

    @CreatedDate  // 생성 시간 자동 설정
    @Column(updatable = false, nullable = false)
    private LocalDateTime createdAt;

    @LastModifiedDate  // 수정 시간 자동 설정
    @Column(nullable = false)
    private LocalDateTime updatedAt;

    public Post(String subject, String contents) {
        this.subject = subject;
        this.contents = contents;
    }
}
