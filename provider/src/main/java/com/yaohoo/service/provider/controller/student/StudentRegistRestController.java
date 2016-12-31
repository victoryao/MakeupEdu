package com.yaohoo.service.provider.controller.student;

import com.google.common.collect.ImmutableMap;
import com.yaohoo.service.biz.student.StudentBiz;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;
import java.util.Map;

/**
 * Created by yaoqiang on 2016/12/20.
 */
@RestController
public class StudentRegistRestController {

    @Resource
    private StudentBiz studentBiz;

    @RequestMapping(value = "/register.do", method = RequestMethod.POST)
    public Map<String, Object> addStudentregister(@RequestParam String json) {
        try {
            return ImmutableMap.<String, Object>builder().put("data", studentBiz.addStudentregister(json)).build();
        } catch (Exception e) {
            return ImmutableMap.<String, Object>builder().put("data", "error").build();
        }
    }

    @RequestMapping(value = "/register.do", method = RequestMethod.PUT)
    public Map<String, Object> modifyStudentregister(@RequestParam String json) {
        return ImmutableMap.<String, Object>builder().put("data", studentBiz.updateStudentregister(json)).build();
    }

    @RequestMapping(value = "/register/{id}.do", method = RequestMethod.GET)
    public Map<String, Object> getStudentregister(@PathVariable int id) {
        return ImmutableMap.<String, Object>builder().put("data", studentBiz.getStudentRegisterModelById(id)).build();
    }

    @RequestMapping(value = "/willdate/{id}.do", method = RequestMethod.POST)
    public Map<String, Object> updateStudentWillDate(@PathVariable int id, @RequestParam long willDate) {
        return ImmutableMap.<String, Object>builder().put("data", studentBiz.updateStudentWillDate(id, new Date(willDate))).build();
    }
}
