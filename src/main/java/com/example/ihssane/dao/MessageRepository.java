package com.example.ihssane.DAO;

import com.example.ihssane.model.Message;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MessageRepository extends JpaRepository<Message, Long> {

    List<Message> findByFromUserIdOrToUserId(Long fromUserId, Long toUserId);
}
