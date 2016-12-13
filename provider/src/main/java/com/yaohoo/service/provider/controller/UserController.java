package com.yaohoo.service.provider.controller;

import com.yaohoo.service.common.util.Constant;
import com.yaohoo.service.domain.model.dos.UserDO;
import com.yaohoo.service.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * Created by yaoqiang on 2016/11/27.
 */
@Controller
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping(value = "/user/login.do", method = RequestMethod.POST)
    public String login(@RequestParam String userName, @RequestParam String password, HttpSession httpSession) {
        UserDO userDO = userService.getUserByUserNamePassword(userName, password);
        if (userDO == null) {
            return "/client/login";
        }
        httpSession.setAttribute(Constant.sessionCheckKey, userDO);
        return "/client/main";
    }


}
