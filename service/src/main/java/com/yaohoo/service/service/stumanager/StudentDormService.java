package com.yaohoo.service.service.stumanager;

import com.yaohoo.service.dao.read.IStudentDormDAO;
import com.yaohoo.service.dao.write.IWriteDormDAO;
import com.yaohoo.service.dao.write.IWriteStudentDormDAO;
import com.yaohoo.service.domain.model.dos.DormDO;
import com.yaohoo.service.domain.model.dos.StudentDormDO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by yaoqiang on 2016/12/14.
 */
@Service
public class StudentDormService {

    @Resource
    private IStudentDormDAO studentDormDAO;
    @Resource
    private IWriteDormDAO dormDAO;
    @Resource
    private IWriteStudentDormDAO writeStudentDormDAO;

    public StudentDormDO getStudentDormRelations(int sId) {
        return studentDormDAO.getStudentDormRelationIdBySId(sId);
    }

    public DormDO getDormById(int id) {
        return studentDormDAO.getDormById(id);
    }

    public List<DormDO> getDormsByTotalCount(int totalCount) {
        return studentDormDAO.getDormsByTotalCount(totalCount);
    }

    public StudentDormDO addStudentDorm(int sId, int dId) {
        StudentDormDO sd = new StudentDormDO(sId, dId);
        writeStudentDormDAO.addStudentDormRelation(sd);
        return sd;
    }

    public boolean incrDormHeadCount(Integer id) {
        return dormDAO.incrDormHeadCount(id);
    }

    public boolean decrDormHeadCount(Integer id) {
        return dormDAO.decrDormHeadCount(id);
    }

    public Integer getDormIdByStudentId(int sId) {
        return studentDormDAO.getDormIdByStudentId(sId);
    }

    public void updateStudentDorm(int sId, int dId) {
        dormDAO.updateStudentDorm(sId, dId);
    }

    public void cancelStudentDorm(int id) {
        dormDAO.cancelStudentDorm(id);
    }
}


