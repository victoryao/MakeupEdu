package com.yaohoo.service.service.student;

import com.yaohoo.service.dao.write.IWriteStuInfoDAO;
import com.yaohoo.service.domain.model.StudentInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by yaoqiang on 2016/11/27.
 */
@Service
public class StudentInfoService {

    @Resource
    private IWriteStuInfoDAO writeStuInfoDAO;

    public boolean addStudentInfo(StudentInfo studentInfo) {
        return writeStuInfoDAO.addStudentInfo(studentInfo);
    }
}