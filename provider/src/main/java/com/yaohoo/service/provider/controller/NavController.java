package com.yaohoo.service.provider.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by yaoqiang on 2016/12/10.
 */
@Controller
public class NavController {

    @RequestMapping("/client/login")
    public String toClientLoginPage() {
        return "/client/login";
    }

}
