package com.ldingyi.cloudaddress.serviceImpl;

import com.ldingyi.cloudaddress.entity.Address;
import com.ldingyi.cloudaddress.entity.Chat;
import com.ldingyi.cloudaddress.mapper.AddressMapper;
import com.ldingyi.cloudaddress.mapper.ChatMapper;
import com.ldingyi.cloudaddress.service.AddressService;
import com.ldingyi.cloudaddress.service.ChatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("chatService")
@Transactional
public class ChatServiceImpl implements ChatService {
    @Autowired
    ChatMapper chatMapper;

    @Autowired
    AddressMapper addressMapper;
    @Override
    public boolean send(Chat chat) {
        try {
            chatMapper.insert(chat);
            return true;
        }catch (Exception e){
           e.printStackTrace();
           return false;
        }


    }

    @Override
    public List<Chat> chatList(String send, String receiver) {

        return chatMapper.chatList(send,receiver);
    }

    @Override
    public List<Chat> chats(String phone) {
        List<Chat> chats = chatMapper.chats(phone);
        for(int i =0;i<=chats.size();i++){
            if (addressMapper.findNameByPhone(phone)!=null){
               /* chats.get(i).set*/
            }
        }
        return chatMapper.chats(phone);
    }


}
