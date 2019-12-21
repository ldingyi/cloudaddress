package com.ldingyi.cloudaddress.service;

import com.ldingyi.cloudaddress.entity.User;
import org.springframework.stereotype.Service;


public interface UserService {
    boolean regist(User user);
    User login(User user);
}
