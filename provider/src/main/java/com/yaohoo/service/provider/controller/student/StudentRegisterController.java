package com.yaohoo.service.provider.controller.student;

import com.google.common.collect.ImmutableMap;
import com.yaohoo.service.biz.student.StudentBiz;
import org.springframework.web.bind.annotation.*;

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
        studentBiz.addStudentregister(json);
        return ImmutableMap.<String, Object>builder().put("data", "success").build();
    }

    @RequestMapping(value = "/register/{id}.do", method = RequestMethod.GET)
    public Map<String, Object> getStudentregister(@PathVariable int id) {
        return ImmutableMap.<String, Object>builder().put("data", studentBiz.getStudentRegisterModelById(id)).build();
    }

}
