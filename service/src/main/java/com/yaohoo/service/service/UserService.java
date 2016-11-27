package com.yaohoo.service.service;

import com.yaohoo.service.dao.UserDAO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by yaoqiang on 2016/11/27.
 */
@Service
public class UserService {

    @Resource
    private UserDAO userDAO;

    public boolean isUserExist(String username, String password) {
        return userDAO.getUserByUserNamePassword(username, password) != null;
    }


}
