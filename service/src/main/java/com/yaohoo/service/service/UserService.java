package com.yaohoo.service.service;

import com.yaohoo.service.dao.UserDAO;
import com.yaohoo.service.domain.model.dos.UserDO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by yaoqiang on 2016/11/27.
 */
@Service
public class UserService {

    @Resource
    private UserDAO userDAO;

    public UserDO getUserByUserNamePassword(String username, String password) {
        return userDAO.getUserByUserNamePassword(username, password);
    }


}
