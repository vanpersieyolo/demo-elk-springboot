package com.example.demointegrateelk.service;

import com.example.demointegrateelk.dto.MessageRequestDTO;
import com.example.demointegrateelk.entity.MessagesEntity;
import com.example.demointegrateelk.repository.MessagesRepository;
import com.example.demointegrateelk.utils.CustomException;
import com.example.demointegrateelk.utils.MessageError;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class MessagesServiceImpl implements MessageService {
    @Autowired
    private MessagesRepository messagesRepository;

    @Override
    public MessagesEntity create(MessageRequestDTO messageRequestDTO) {
        log.info("MessageRequestDTO :: {}", messageRequestDTO);

        MessagesEntity messagesEntity = MessagesEntity.builder()
                .message(messageRequestDTO.getMessage())
                .build();
        log.info("MessagesEntity :: {}", messagesEntity);
        log.info("SAVE SUCCESSFULLY");
        return messagesRepository.save(messagesEntity);
    }

    @Override
    public List<MessagesEntity> getListMessages() {
        log.info("GET ALL LIST MESSAGES");
        return messagesRepository.findAll();
    }

    @Override
    public MessagesEntity getById(Long id) {
        log.info("ID :: {}", id);
        return messagesRepository.findById(id).orElseThrow(
                () -> new CustomException(MessageError.NOT_FOUND.getCode(), MessageError.NOT_FOUND.msg()));
    }
}
