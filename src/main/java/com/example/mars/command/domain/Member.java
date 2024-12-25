package com.example.mars.command.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@NoArgsConstructor
@Getter
@Document(collection = "member")
public class Member {
    @Id
    private String id;
    private String name;
    private Integer age;

    public Member(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
