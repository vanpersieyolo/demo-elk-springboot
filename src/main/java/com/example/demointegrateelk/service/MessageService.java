package com.example.demointegrateelk.service;

import com.example.demointegrateelk.dto.MessageRequestDTO;
import com.example.demointegrateelk.entity.MessagesEntity;

import java.util.List;

public interface MessageService {
    MessagesEntity create(MessageRequestDTO messageRequestDTO);
    List<MessagesEntity> getListMessages();
    MessagesEntity getById(Long id);

}
