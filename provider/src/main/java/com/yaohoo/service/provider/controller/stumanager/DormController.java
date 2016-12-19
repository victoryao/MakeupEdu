package com.yaohoo.service.provider.controller.stumanager;

import com.yaohoo.service.biz.student.StudentBiz;
import com.yaohoo.service.biz.stumanager.DormBiz;
import com.yaohoo.service.common.util.Constant;
import com.yaohoo.service.common.util.PageView;
import com.yaohoo.service.common.util.QueryResult;
import com.yaohoo.service.domain.model.StudentModel;
import com.yaohoo.service.domain.model.dos.DormDO;
import com.yaohoo.service.domain.model.enums.StudentStatusEnum;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by yaoqiang on 2016/12/16.
 */
@Controller
public class DormController {

    @Resource
    private DormBiz studentManagerBiz;
    @Resource
    private StudentBiz studentBiz;

    @RequestMapping(value = "/student/manager/dorm/add.do", method = RequestMethod.GET)
    public Object updateStudentDorm(
            @RequestParam(required = false, defaultValue = "0") int sId,
            @RequestParam(required = false, defaultValue = "0") int dId,
            ModelMap modelMap) {
        studentManagerBiz.addStudentDorm(sId, dId);
        genDormList(modelMap);
        return "stumanager/dorm_home";
    }

    @RequestMapping(value = "/student/manager/dorm/exchange.do", method = RequestMethod.GET)
    public Object exchangeStudentDorm(
            @RequestParam(required = false, defaultValue = "0") int sId,
            @RequestParam(required = false, defaultValue = "0") int dId,
            ModelMap modelMap) {
        studentManagerBiz.exchangeStudentDorm(sId, dId);
        genDormList(modelMap);
        return "stumanager/dorm_home";
    }

    private void genDormList(ModelMap modelMap) {
        PageView<StudentModel> pageView = new PageView<>(10, 1);
        QueryResult<StudentModel> qr = studentManagerBiz.getStudentDormQueryPaging(0, null, 0, StudentStatusEnum.SIGNED.getValue(), pageView.getFirstResult(), pageView.getMaxresult());
        pageView.setQueryResult(qr);
        modelMap.addAttribute("pageView", pageView);
    }

    @RequestMapping(value = "/student/manager/dorm/list.do", method = RequestMethod.GET)
    public Object getStudentQueryPaging(
            @RequestParam(required = false, defaultValue = "0") int totalCount,
            @RequestParam(required = false, defaultValue = "0") int sId,
            @RequestParam(required = false, defaultValue = "add") String type,
            ModelMap modelMap) {
        if (sId != 0) {
            StudentModel student = studentBiz.getStudentById(sId);
            modelMap.addAttribute("student", student);
        }
        List<DormDO> list = studentManagerBiz.getDormsByTotalCount(totalCount);
        modelMap.addAttribute("dormList", list);
        if ("exchange".equals(type)) {
            return "stumanager/dorm_exchange";
        } else if ("cancel".equals(type)) {
            return "stumanager/dorm_cancel";
        } else {
            return "stumanager/dorm_add";
        }

    }

    @RequestMapping(value = "/student/manager/dorm/home.do", method = RequestMethod.GET)
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
        if (StringUtils.isEmpty(name)) {
            name = null;
        }
        PageView<StudentModel> pageView = new PageView<>(limit, page);
        QueryResult<StudentModel> qr = studentManagerBiz.getStudentDormQueryPaging(id, name, phone, StudentStatusEnum.SIGNED.getValue(), pageView.getFirstResult(), pageView.getMaxresult());
        pageView.setQueryResult(qr);
        modelMap.addAttribute("pageView", pageView);
        return "stumanager/dorm_home";
    }


}
