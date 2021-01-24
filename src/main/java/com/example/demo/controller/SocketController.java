package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import com.example.demo.domain.TextMessage;
import com.example.demo.service.TextMessageService;

@Controller
public class SocketController {

	@Autowired
	private TextMessageService textMessageService;
	
	@MessageMapping("/user-all")
    @SendTo("/topic/user")
    public TextMessage send(@Payload TextMessage message) {
		System.out.println(message);
		textMessageService.saveMessage(message);
        return message;
    }
}
