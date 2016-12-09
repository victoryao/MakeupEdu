package com.yaohoo.service.provider.controller.classes;

import com.google.common.collect.ImmutableMap;
import com.yaohoo.service.biz.classes.ClassBiz;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

/**
 * Created by yaoqiang on 2016/12/4.
 */
@RestController
public class ClassController {

    @Resource
    private ClassBiz classBiz;

    @RequestMapping(value = "/class/list.do", method = RequestMethod.GET)
    public Map<String, Object> getTeacherClassList() {
        return ImmutableMap.<String, Object>builder().put("data", classBiz.getTeacherClasses()).build();
    }
}
