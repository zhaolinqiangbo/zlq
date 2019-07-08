package com.zlq.hs.controller;


import com.zlq.hs.dao.IUserDao;
import com.zlq.hs.emtity.User;
import com.zlq.hs.service.IUserService;
import com.zlq.hs.service.imp.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
    @Autowired
    private UserServiceImp userServiceImp;

    @ResponseBody
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    private User loginController(User user){
//        System.out.println("login"+userServiceImp);
//        User user1=userServiceImp.getUserInfo();
        System.out.println("login"+user.toString());

        return user;
    }
}
