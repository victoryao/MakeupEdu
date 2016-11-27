package main.java.com.yaohoo.service.biz.student;


import com.alibaba.fastjson.JSON;
import com.yaohoo.service.domain.model.StudentModel;
import com.yaohoo.service.domain.model.StudentRegisterModel;
import com.yaohoo.service.service.student.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * Created by yaoqiang on 2016/11/27.
 */
@Service
public class StudentBiz {

    @Resource
    private StudentService studentService;
    /**
     * 学生咨询登记表
     */
    @Transactional
    public void addStudentregister(String json) {
        StudentRegisterModel registerModel = JSON.parseObject(json, StudentRegisterModel.class);
        StudentModel studentModel = registerModel.getStudent();
        registerModel.getStuInfo();
        registerModel.getQuery();
    }

}
