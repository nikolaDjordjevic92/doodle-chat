package com.example.demo.configuration;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.TextMessage;
import com.example.demo.service.TextMessageService;

@RestController
public class UserMessagesController {

	@Autowired
	private TextMessageService textMessageService;
	
	@GetMapping(value = {"/messages/{id}", "/messages"})
	public List<TextMessage> getMessages(@PathVariable(name = "id") Optional<Long> id) {
		return textMessageService.findMessages(id);
	}
}
