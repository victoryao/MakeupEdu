package com.yaohoo.service.provider.controller.student;

import com.google.common.collect.ImmutableMap;
import com.yaohoo.service.biz.student.StudentBiz;
import com.yaohoo.service.common.enums.StudentStatusEnum;
import com.yaohoo.service.common.util.APIUtils;
import com.yaohoo.service.common.util.Constant;
import com.yaohoo.service.common.util.PageView;
import com.yaohoo.service.common.util.QueryResult;
import com.yaohoo.service.domain.model.StudentModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by yaoqiang on 2016/11/27.
 */
@Controller
public class StudentController {

    @Resource
    private StudentBiz studentBiz;

    @RequestMapping(value = "/register.do", method = RequestMethod.POST)
    public Map<String, Object> addStudentregister(@RequestParam String json) {
        studentBiz.addStudentregister(json);
        return ImmutableMap.<String, Object>builder().put("data", "success").build();
    }

    @RequestMapping(value = "/register.do", method = RequestMethod.PUT)
    public Map<String, Object> modifyStudentregister(@RequestParam String json) {
        studentBiz.updateStudentregister(json);
        return ImmutableMap.<String, Object>builder().put("data", "success").build();
    }

    @RequestMapping(value = "/register/{id}.do", method = RequestMethod.GET)
    public Map<String, Object> getStudentregister(@PathVariable int id) {
        return ImmutableMap.<String, Object>builder().put("data", studentBiz.getStudentRegisterModelById(id)).build();
    }

    @RequestMapping(value = "/willdate/{id}.do", method = RequestMethod.POST)
    public Map<String, Object> updateStudentWillDate(@PathVariable int id, @RequestParam long willDate) {
        return ImmutableMap.<String, Object>builder().put("data", studentBiz.updateStudentWillDate(id, new Date(willDate))).build();
    }

    @RequestMapping(value = "/willdate/list.do", method = RequestMethod.GET)
    public Object getTodayWillStudentPaging(
            @RequestParam(required = false, defaultValue = "1") int page,
            @RequestParam(required = false, defaultValue = "10") int limit,
            ModelMap modelMap) {
        if (limit > 100) {
            limit = Constant.pageSize;
        }
        PageView<StudentModel> pageView = new PageView<>(limit, page);
        QueryResult<StudentModel> qr = studentBiz.getTodayWillStudentPaging(pageView.getFirstResult(), pageView.getMaxresult());
        pageView.setQueryResult(qr);
        modelMap.addAttribute("pageView", pageView);
        return "/student/stu_to_follow";
    }

    @RequestMapping(value = "/student/list.do", method = RequestMethod.GET)
    public Object getStudentQueryPaging(
            @RequestParam(required = false, defaultValue = "0") int id,
            @RequestParam(required = false) String name,
            @RequestParam(required = false, defaultValue = "0") long phone,
            @RequestParam(required = false, defaultValue = "1") int page,
            @RequestParam(required = false, defaultValue = "10") int limit,
            ModelMap modelMap) {
        if (limit > 100) {
            limit = Constant.pageSize;
        }
        PageView<StudentModel> pageView = new PageView<>(limit, page);
        QueryResult<StudentModel> qr = studentBiz.getStudentQueryPaging(id, name, phone, StudentStatusEnum.WILL.getValue(), pageView.getFirstResult(), pageView.getMaxresult());
        pageView.setQueryResult(qr);
        modelMap.addAttribute("pageView", pageView);
        return "/student/stu_follow_query";
    }
}
