package com.yaohoo.service.service;

import com.yaohoo.service.dao.TestDAO;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by yaoqiang on 16/4/16.
 */
@Service
public class TestService {

    @Resource
    private TestDAO testDAO;

    @Cacheable(value = "default", key = "'test'+#id")
    public String test(int id) {
        System.out.println("try...");
        return testDAO.get(id);
    }

}
