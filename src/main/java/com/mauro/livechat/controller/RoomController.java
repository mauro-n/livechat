package com.mauro.livechat.controller;

import com.mauro.livechat.domain.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Controller
public class RoomController {
    @GetMapping("/rooms/{id}")
    public String room(Model model, @PathVariable int id) {
        return "room";
    }

    @MessageMapping("/messages")
    @SendTo("/topic/messages")
    public List<Message> messages(Message message) {
        System.out.println("message: " + message);
        List<Message> messages = new ArrayList<>();
        messages.add(message);
        return messages;
    }
}
