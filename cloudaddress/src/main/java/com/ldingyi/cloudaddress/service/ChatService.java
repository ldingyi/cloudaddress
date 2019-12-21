package com.ldingyi.cloudaddress.service;

import com.ldingyi.cloudaddress.entity.Chat;

import java.util.List;

public interface ChatService {
    boolean send(Chat chat);
    List<Chat> chatList (String send,String receiver);
    List<Chat> chats (String phone);
}
