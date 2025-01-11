package com.example.mars.api.member.dto;

import com.example.mars.shared.enums.RaceType;

public record RaceRequest(String name, RaceType type) {
}
