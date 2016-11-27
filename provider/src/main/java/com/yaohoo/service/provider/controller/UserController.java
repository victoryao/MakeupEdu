package com.yaohoo.service.provider.controller;

import com.google.common.collect.ImmutableMap;
import com.yaohoo.service.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

/**
 * Created by yaoqiang on 2016/11/27.
 */
@RestController
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "/login.do", method = RequestMethod.POST)
    public Map<String, Object> login(@RequestParam String userName, @RequestParam String password) {
        Map<String, Object> data = ImmutableMap.<String, Object>builder().put("login", userService.isUserExist(userName, password)).build();
        return ImmutableMap.<String, Object>builder().put("data", data).build();
    }


}
