package com.yaohoo.service.service.student;

import com.yaohoo.service.dao.read.IStuClassDAO;
import com.yaohoo.service.dao.write.IWriteStudentClassDAO;
import com.yaohoo.service.domain.model.StudentModel;
import com.yaohoo.service.domain.model.dos.StudentClassDO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by yaoqiang on 2016/12/9.
 */
@Service
public class ClassService {

    @Resource
    private IWriteStudentClassDAO writeStudentClassDAO;
    @Resource
    private IStuClassDAO teacherClassDAO;

    public boolean addWriteStudentClassRelation(StudentClassDO sm) {
        return writeStudentClassDAO.addStudentClassRelation(sm);
    }

    public boolean updateWriteStudentClassRelation(StudentClassDO sm) {
        return writeStudentClassDAO.updateStudentClassRelation(sm);
    }

    public StudentClassDO getClasseRelationBySId(int sId) {
        return teacherClassDAO.getClasseRelationBySId(sId);
    }

    public List<StudentModel> getStudentClassQueryPaging(int sId, String sName, long sPhone, int status, int offset, int limit) {
        return teacherClassDAO.getStudentClassQueryPaging(sId, sName, sPhone, status, offset, limit);
    }

    public int getStudentClassQueryCount(int sId, String sName, long sPhone, int status) {
        return teacherClassDAO.getStudentClassQueryCount(sId, sName, sPhone, status);
    }


}
