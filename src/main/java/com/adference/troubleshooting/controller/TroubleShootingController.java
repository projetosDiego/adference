package com.adference.troubleshooting.controller;

import com.adference.troubleshooting.dto.TroubleShootingHistoryDTO;
import com.adference.troubleshooting.dto.TroubleShootingRequestDTO;
import com.adference.troubleshooting.dto.TroubleShootingResponseDTO;
import com.adference.troubleshooting.service.TroubleShootingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("troubleshooting")
public class TroubleShootingController {

    private final TroubleShootingService troubleShootingService;

    @Autowired
    public TroubleShootingController(TroubleShootingService troubleShootingService) {
        this.troubleShootingService = troubleShootingService;
    }

    @GetMapping
    public ResponseEntity<TroubleShootingResponseDTO> getFirstQuestion() {
        return new ResponseEntity<>(troubleShootingService.getFirstQuestion(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<TroubleShootingResponseDTO> addAnswer(@RequestBody final TroubleShootingRequestDTO answer) {
        return new ResponseEntity<>(troubleShootingService.addTroubleshootingAnswer(answer), HttpStatus.OK);
    }

    @GetMapping(value = "/{userId}")
    public ResponseEntity<List<TroubleShootingHistoryDTO>> getTroubleshootingHistoryByUser(@PathVariable final Long userId) {
        return new ResponseEntity<>(troubleShootingService.getTroubleshootingHistoryByUser(userId), HttpStatus.OK);
    }
}