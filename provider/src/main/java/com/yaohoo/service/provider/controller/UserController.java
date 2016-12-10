package com.yaohoo.service.provider.controller;

import com.google.common.collect.ImmutableMap;
import com.yaohoo.service.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.Map;

/**
 * Created by yaoqiang on 2016/11/27.
 */
@Controller
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "/user/login.do", method = RequestMethod.POST)
    public String login(@RequestParam String userName, @RequestParam String password) {
        if(userService.isUserExist(userName, password)){
            return "/client/main";
        }
        return "/client/login";
    }


}
