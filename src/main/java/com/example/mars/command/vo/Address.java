package com.example.mars.command.vo;

import jakarta.persistence.Embeddable;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Embeddable
@NoArgsConstructor(access = AccessLevel.PROTECTED) // JPA를 위한 기본 생성자
@AllArgsConstructor
public class Address {

    private String postalCode;   // 우편번호
    private String city;         // 시/도
    private String district;     // 시/군/구
    private String town;         // 읍/면/동
    private String detail;       // 상세주소
}
