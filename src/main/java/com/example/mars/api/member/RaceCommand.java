package com.example.mars.api.member;

import com.example.mars.api.member.dto.RaceRequest;
import com.example.mars.command.application.RaceCommandService;
import com.example.mars.command.dto.RaceDto;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/race")
public class RaceCommand {

    private final RaceCommandService service;

    @PostMapping
    public ResponseEntity<?> saveRace(@RequestBody RaceRequest request) {
        RaceDto dto = new RaceDto(request.name() , request.type());
        service.save(dto);

        return ResponseEntity.ok().build();
    }
}
