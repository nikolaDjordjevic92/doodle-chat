package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.TextMessage;
import com.example.demo.repository.TextMessageRepository;

@Service
public class TextMessageServiceImpl implements TextMessageService{

	@Autowired
	private TextMessageRepository textMessageRepository;
	
	@Override
	public TextMessage saveMessage(TextMessage textMessage) {
		return textMessageRepository.save(textMessage);
	}

	@Override
	public List<TextMessage> findMessages(Optional<Long> id) {
		if(!id.isPresent()) {
			
			return textMessageRepository.findTop10ByOrderByIdDesc();
		} 
		
		return textMessageRepository.findTop10ByIdLessThanOrderByIdDesc(id.get());
	}

	
}
