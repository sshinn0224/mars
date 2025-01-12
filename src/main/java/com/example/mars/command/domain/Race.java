package com.example.mars.command.domain;

import com.example.mars.command.vo.Address;
import com.example.mars.shared.enums.RaceType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter
@NoArgsConstructor
public class Race {

    @Id
    @GeneratedValue
    @Column(columnDefinition = "BINARY(16)")
    private UUID id;;

    private String name;

    @Enumerated(EnumType.STRING)
    private RaceType type;

    private Address address;

    private LocalDateTime receiptDate;

    private LocalDateTime startDate;
    private LocalDateTime endDate;

    public Race(String name, RaceType type) {
        this.name = name;
        this.type = type;
    }
}
