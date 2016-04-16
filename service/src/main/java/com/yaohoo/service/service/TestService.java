package com.yaohoo.service.service;

import com.yaohoo.service.dao.TestDAO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by yaoqiang on 16/4/16.
 */
@Service
public class TestService {

    @Resource
    private TestDAO testDAO;

    public String test(int id) {
        return testDAO.get(id);
    }

}
