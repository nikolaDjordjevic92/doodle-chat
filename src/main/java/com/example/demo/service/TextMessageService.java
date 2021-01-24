package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.domain.TextMessage;

public interface TextMessageService {

	public TextMessage saveMessage(TextMessage textMessage);
	public List<TextMessage> findMessages(Optional<Long> id);
}
