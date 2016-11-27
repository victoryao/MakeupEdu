package com.yaohoo.service.provider.controller.student;

import com.google.common.collect.ImmutableMap;
import com.yaohoo.service.biz.student.StudentBiz;
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
public class StudentRegisterController {

    @Resource
    private StudentBiz studentBiz;

    @RequestMapping(value = "/register.do", method = RequestMethod.POST)
    public Map<String, Object> addStudentregister(@RequestParam String json) {
        System.out.println(json);
        studentBiz.addStudentregister(json);
        return ImmutableMap.<String, Object>builder().put("data", "success").build();
    }
}
