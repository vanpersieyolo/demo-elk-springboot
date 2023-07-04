package com.example.demointegrateelk.repository;

import com.example.demointegrateelk.entity.MessagesEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessagesRepository extends JpaRepository<MessagesEntity, Long> {
}
