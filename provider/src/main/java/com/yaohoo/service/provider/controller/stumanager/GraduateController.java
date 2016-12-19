package com.yaohoo.service.provider.controller.stumanager;

import com.google.common.collect.ImmutableMap;
import com.yaohoo.service.biz.stumanager.GraduateBiz;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

/**
 * Created by yaoqiang on 2016/12/17.
 */
@RestController
public class GraduateController {

    @Resource
    private GraduateBiz graduateBiz;

    @RequestMapping(value = "/stu/graduate.do", method = RequestMethod.POST)
    public Map addStuGraduate(@RequestParam(required = false, defaultValue = "0") int sId,
                              @RequestParam(required = false) String company,
                              @RequestParam(required = false, defaultValue = "0") int companyType) {
        graduateBiz.addStudenGraduate(sId, company, companyType);
        return ImmutableMap.builder().put("data", "success").build();
    }

    @RequestMapping(value = "/stu/graduate.do", method = RequestMethod.GET)
    public Map getStuGraduate(@RequestParam(required = false, defaultValue = "0") int sId) {
        return ImmutableMap.builder().put("data", graduateBiz.getStudentGraduates(sId)).build();
    }

}
