package com.ldingyi.cloudaddress.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.ldingyi.cloudaddress.entity.Chat;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ChatMapper extends BaseMapper<Chat> {
    List<Chat> chatList (@Param("send") String send, @Param("receiver") String receiver);
    List<Chat> chats(@Param("phone") String phone);

}
