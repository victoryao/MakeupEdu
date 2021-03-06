package com.yaohoo.service.service.student;

import com.yaohoo.service.dao.read.IStuInfoDAO;
import com.yaohoo.service.dao.write.IWriteStuInfoDAO;
import com.yaohoo.service.domain.model.StudentInfoModel;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by yaoqiang on 2016/11/27.
 */
@Service
public class StudentInfoService {

    @Resource
    private IWriteStuInfoDAO writeStuInfoDAO;
    @Resource
    private IStuInfoDAO stuInfoDAO;

    public boolean addStudentInfo(StudentInfoModel studentInfo) {
        return writeStuInfoDAO.addStudentInfo(studentInfo);
    }

    public StudentInfoModel getStudentInfoByStuId(int stuId) {
        return stuInfoDAO.getStudentInfoById(stuId);
    }

    public boolean updateStudentInfo(StudentInfoModel studentInfo) {
        return writeStuInfoDAO.updateStudentInfo(studentInfo);
    }

}
