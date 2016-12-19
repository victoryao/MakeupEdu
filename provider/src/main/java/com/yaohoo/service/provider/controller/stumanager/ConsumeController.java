package com.yaohoo.service.provider.controller.stumanager;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by yaoqiang on 2016/12/18.
 */
@Controller
public class ConsumeController {

    @RequestMapping(value = "/student/manager/consume/list.do", method = RequestMethod.GET)
    public Object updateStudentDorm(
            @RequestParam(required = false, defaultValue = "0") int sId,
            @RequestParam(required = false, defaultValue = "0") int dId,
            ModelMap modelMap) {

        return "consume/consume_list";
    }

}
