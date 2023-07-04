package com.example.demointegrateelk.controller;

import com.example.demointegrateelk.dto.MessageRequestDTO;
import com.example.demointegrateelk.service.MessageService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping(path = "/v1/message")
public class MessageController {
    private final MessageService messageService;

    @PostMapping
    public ResponseEntity<?> createNewMessage(@Valid @RequestBody MessageRequestDTO requestDTO) {
        return new ResponseEntity<>(messageService.create(requestDTO), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<?> getListMessages() {
        return ResponseEntity.ok(messageService.getListMessages());
    }

    @GetMapping(path = "/id")
    public ResponseEntity<?> getById(@RequestParam(value = "id") Long id) {
        return ResponseEntity.ok(messageService.getById(id));
    }
}
