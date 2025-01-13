package com.example.mars.command.application;

import com.example.mars.command.domain.Race;
import com.example.mars.command.dto.RaceDto;
import com.example.mars.command.repository.RaceCommandJpaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RaceCommandService {

    private final RaceCommandJpaRepository repository;

    public void save(RaceDto dto) {
        Race race = new Race(dto.name(), dto.type());

        repository.save(race);
    }
}
