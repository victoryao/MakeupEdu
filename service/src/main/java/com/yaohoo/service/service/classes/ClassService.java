package com.yaohoo.service.service.classes;

import com.yaohoo.service.dao.read.ClassDAO;
import com.yaohoo.service.dao.read.IStuClassDAO;
import com.yaohoo.service.dao.write.IWriteStudentClassDAO;
import com.yaohoo.service.domain.model.StudentModel;
import com.yaohoo.service.domain.model.dos.ClassDO;
import com.yaohoo.service.domain.model.dos.StudentClassDO;
import com.yaohoo.service.domain.model.dos.TeacherClassDO;
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
    @Resource
    private ClassDAO classDAO;

    public List<TeacherClassDO> getTeacherClassesQuery(int tId, int classTimeType, int classType, int offset, int limit) {
        return teacherClassDAO.getTeacherClassesQuery(tId, classTimeType, classType, offset, limit);
    }

    public int getTeacherClassesQueryCount(int tId, int classTimeType, int classType) {
        return teacherClassDAO.getTeacherClassesQueryCount(tId, classTimeType, classType);
    }

    public TeacherClassDO getTeacherClassesById(int tcId) {
        return teacherClassDAO.getTeacherClassesById(tcId);
    }

    public boolean addWriteStudentClassRelation(StudentClassDO sm) {
        return writeStudentClassDAO.addStudentClassRelation(sm);
    }

    public boolean updateWriteStudentClassRelation(StudentClassDO sm) {
        return writeStudentClassDAO.updateStudentClassRelation(sm);
    }

    public StudentClassDO getClasseRelationBySId(int sId) {
        return teacherClassDAO.getClasseRelationBySId(sId);
    }

    public StudentClassDO getClasseRelationBySIdTcId(int sId, int tcId) {
        return teacherClassDAO.getClasseRelationBySIdTcId(sId, tcId);
    }

    public List<StudentClassDO> getStudentClassQueryPaging(int sId, String sName, long sPhone, int status, int offset, int limit) {
        return teacherClassDAO.getStudentClassQueryPaging(sId, sName, sPhone, status, offset, limit);
    }

    public int getStudentClassQueryCount(int sId, String sName, long sPhone, int status) {
        return teacherClassDAO.getStudentClassQueryCount(sId, sName, sPhone, status);
    }

    public ClassDO getClassById(int id) {
        return classDAO.getClassById(id);
    }
}
