package com.yaohoo.service.provider.controller.classes;

import com.alibaba.fastjson.JSON;
import com.google.common.collect.ImmutableMap;
import com.yaohoo.service.biz.student.StudentClassBiz;
import com.yaohoo.service.domain.model.dos.StudentClassDO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

/**
 * Created by yaoqiang on 2016/12/25.
 */
@RestController
public class ClassRestController {

    @Resource
    private StudentClassBiz studentClassBiz;

    @RequestMapping(value = "/student/class/add.do", method = RequestMethod.POST)
    public Map StudentClassRelation(@RequestParam String json) {
        StudentClassDO sc = JSON.parseObject(json, StudentClassDO.class);
        StudentClassDO classDO = studentClassBiz.getClasseRelationBySIdTcId(sc.getsId(), sc.getTcId());
        if (classDO != null) {
            return ImmutableMap.builder().put("data", "不能重复选课！").build();
        }
        studentClassBiz.addWriteStudentClassRelation(sc);
        return ImmutableMap.builder().put("data", "操作成功！").build();
    }


}
