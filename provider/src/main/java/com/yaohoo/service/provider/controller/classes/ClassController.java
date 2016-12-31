package com.yaohoo.service.provider.controller.classes;

import com.yaohoo.service.biz.classes.ClassBiz;
import com.yaohoo.service.biz.student.StudentBiz;
import com.yaohoo.service.common.util.PageView;
import com.yaohoo.service.common.util.QueryResult;
import com.yaohoo.service.domain.model.StudentModel;
import com.yaohoo.service.domain.model.dos.StudentClassDO;
import com.yaohoo.service.domain.model.dos.TeacherClassDO;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

/**
 * Created by yaoqiang on 2016/12/25.
 */
@Controller
public class ClassController {

    @Resource
    private ClassBiz classBiz;
    @Resource
    private StudentBiz studentBiz;

    @RequestMapping(value = "/teacher/class/list.do", method = RequestMethod.GET)
    public Object getStuClassesQueryPaging(
            @RequestParam int sId,
            @RequestParam(required = false, defaultValue = "0") int tId,
            @RequestParam(required = false, defaultValue = "0") int classTimeType,
            @RequestParam(required = false, defaultValue = "0") int classType,
            @RequestParam(required = false, defaultValue = "1") int page,
            @RequestParam(required = false, defaultValue = "10") int limit,
            ModelMap modelMap) {
        PageView<TeacherClassDO> pageView = new PageView<>(limit, page);
        QueryResult<TeacherClassDO> qr = classBiz.getTeacherClassesQuery(tId, classTimeType, classType, pageView.getFirstResult(), pageView.getMaxresult());
        pageView.setQueryResult(qr);
        StudentModel student = studentBiz.getStudentById(sId);
        modelMap.addAttribute("student", student);
        modelMap.addAttribute("pageView", pageView);
        return "classes/class_selected";
    }

    @RequestMapping(value = "/student/class/list.do", method = RequestMethod.GET)
    public Object getStuClassesQueryPaging(
            @RequestParam int sId,
            @RequestParam(required = false, defaultValue = "1") int page,
            @RequestParam(required = false, defaultValue = "10") int limit,
            ModelMap modelMap) {
        PageView<StudentClassDO> pageView = new PageView<>(limit, page);
        QueryResult<StudentClassDO> qr = classBiz.getStudentClassesQuery(sId, null, 0, 0, pageView.getFirstResult(), pageView.getMaxresult());
        pageView.setQueryResult(qr);
        StudentModel student = studentBiz.getStudentById(sId);
        modelMap.addAttribute("student", student);
        modelMap.addAttribute("pageView", pageView);
        return "classes/learn_history_list";
    }


}
