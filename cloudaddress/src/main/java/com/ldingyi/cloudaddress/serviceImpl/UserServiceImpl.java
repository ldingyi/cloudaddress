package com.ldingyi.cloudaddress.serviceImpl;

import com.ldingyi.cloudaddress.entity.User;
import com.ldingyi.cloudaddress.mapper.UserMapper;
import com.ldingyi.cloudaddress.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public boolean regist(User user) {

        if (userMapper.findUserByPhone(user)==null){
            try {
                userMapper.insert(user);
                return true;
            }catch (Exception e){
                return false;
            }
        }else {
            return false;
        }

    }

    @Override
    public User login(User user) {
        User u = userMapper.findUserByPhoneAndPassword(user);
        if (u!=null){
            return u;
        }else {
            return null;
        }
    }
}
