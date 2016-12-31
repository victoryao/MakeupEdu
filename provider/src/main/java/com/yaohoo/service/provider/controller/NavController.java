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

    @RequestMapping("/student/stuInfoHome")
    public String toStuInfoHomePage() {
        return "/student/stu_info_home";
    }

    @RequestMapping("/student/stuRegister")
    public String toStuRegisterPage() {
        return "/student/stu_register";
    }

    @RequestMapping("/client/main")
    public String toMainPage() {
        return "/client/main";
    }

    @RequestMapping("/student/manager/home")
    public String toStudentManagerMainPage() {
        return "/stumanager/manager_home";
    }

    @RequestMapping("/student/manager/dorm/home")
    public String toStudentManagerSetDormPage() {
        return "/stumanager/dorm_home";
    }

    @RequestMapping("/student/stat/home")
    public String toStatPage() {
        return "/stat/stat_home";
    }

    @RequestMapping("/student/stat/income")
    public String toIncomeStatPage() {
        return "/stat/income_stat";
    }

    @RequestMapping("/student/stat/student")
    public String toStuStatPage() {
        return "/stat/student_stat";
    }


}
