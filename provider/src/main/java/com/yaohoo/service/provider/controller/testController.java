package com.yaohoo.service.provider.controller;

import com.google.common.collect.ImmutableMap;
import com.yaohoo.service.service.TestService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

/**
 * Created by yaoqiang on 16/4/14.
 */
@RestController
public class testController {

    @Resource
    private TestService testService;

    @RequestMapping(value = "/test.do", method = RequestMethod.GET)
    public String test() {
        return "ok";
    }

    @RequestMapping(value = "/{id}/test1.do", method = RequestMethod.GET)
    public Map test1(@PathVariable int id) {
        System.out.printf(testService.test(id));
        return ImmutableMap.builder().put("name", testService.test(id)).build();
    }

    @RequestMapping(value = "/{id}/test2.do", method = RequestMethod.GET)
    public String test2(@PathVariable int id) {
        System.out.printf(testService.test(id));
        return  testService.test(id);
    }

}
