package com.ldingyi.cloudaddress.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.ldingyi.cloudaddress.entity.Chat;
import com.ldingyi.cloudaddress.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@CrossOrigin
@RequestMapping("/chat")

public class ChatController {

    @Autowired
    ChatService chatService;

    @RequestMapping("/send")
    @ResponseBody
    public void chat(String chatJSON){
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            Chat chat = objectMapper.readValue(chatJSON,Chat.class);
            chatService.send(chat);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }


    }

    @RequestMapping("/listChat")
    @ResponseBody
    public List<Chat> list(String send,String receiver){
        return chatService.chatList(send,receiver);
    }
    @RequestMapping("/chats")
    @ResponseBody
    public List<Chat> list(String phone){
        return chatService.chats(phone);
    }

}
