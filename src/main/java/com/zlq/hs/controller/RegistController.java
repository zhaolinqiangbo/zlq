package com.zlq.hs.controller;

import com.zlq.hs.emtity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 注册
 */
@Controller
public class RegistController {

    @ResponseBody
    @RequestMapping(value = "/regist",method = RequestMethod.POST)
    private User register(User user){

        return null;
    }
}
