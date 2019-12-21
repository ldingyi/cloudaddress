package com.ldingyi.cloudaddress.controller;

import com.ldingyi.cloudaddress.entity.User;
import com.ldingyi.cloudaddress.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

@Controller
@CrossOrigin
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/regist")
    @ResponseBody
    public boolean regist(User user){
        return userService.regist(user);
    }

    @RequestMapping("/login")
    @ResponseBody
    public User login(User user, HttpServletResponse response){
        user=userService.login(user);
        if (user!=null){
            return user;
        }else {
            try {
                response.getWriter().print(false);
            }catch (Exception e){

            }
            return null;
        }
    }

}
