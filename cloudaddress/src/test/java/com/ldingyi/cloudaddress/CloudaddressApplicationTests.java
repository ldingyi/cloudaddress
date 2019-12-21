package com.ldingyi.cloudaddress;

import com.ldingyi.cloudaddress.configure.WebsocketConfigure;
import com.ldingyi.cloudaddress.entity.Chat;
import com.ldingyi.cloudaddress.entity.User;
import com.ldingyi.cloudaddress.mapper.AddressMapper;
import com.ldingyi.cloudaddress.mapper.ChatMapper;
import com.ldingyi.cloudaddress.mapper.UserMapper;
import com.ldingyi.cloudaddress.service.AddressService;
import com.ldingyi.cloudaddress.socket.SocketService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
class CloudaddressApplicationTests {

    @Test
    void contextLoads() {

    }

}
