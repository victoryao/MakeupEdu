package com.yaohoo.service.biz.stumanager;

import com.yaohoo.service.common.util.QueryResult;
import com.yaohoo.service.domain.model.StudentModel;
import com.yaohoo.service.domain.model.dos.DormDO;
import com.yaohoo.service.domain.model.enums.StuStatusEnum;
import com.yaohoo.service.service.student.StudentService;
import com.yaohoo.service.service.stumanager.StudentDormService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by yaoqiang on 2016/12/14.
 */
@Service
public class DormBiz {

    @Resource
    private StudentDormService studentDormService;
    @Resource
    private StudentService studentService;

    public QueryResult<StudentModel> getStudentDormQueryPaging(int id, String name, long phone, int status, int offset, int limit) {
        List<StudentModel> list = studentService.getStudentQueryPaging(id, name, phone, status, offset, limit);
        for (StudentModel st : list) {
            Integer dormId = studentDormService.getStudentDormRelations(st.getId());
            if (dormId == null) {
                st.setDormStatus(StuStatusEnum.NO.getValue());
            } else {
                st.setDormStatus(StuStatusEnum.YES.getValue());
                DormDO dormDO = studentDormService.getDormById(dormId);
                st.setDormId(dormDO.getdId());
            }
        }
        QueryResult<StudentModel> qr = new QueryResult<>();
        int totalRecord = studentService.getStudentQueryCount(id, name, phone, status);
        qr.setResultlist(list);
        qr.setTotalrecord(totalRecord);
        return qr;
    }

    public List<DormDO> getDormsByTotalCount(int totalCount) {
        return studentDormService.getDormsByTotalCount(totalCount);
    }

    @Transactional
    public void addStudentDorm(int sId, int dId) {
        studentDormService.incrDormHeadCount(dId);
        studentDormService.addStudentDorm(sId, dId);
    }

    @Transactional
    public void exchangeStudentDorm(int sId, int dId) {
        Integer olddId = studentDormService.getDormIdByStudentId(sId);
        if(olddId == null){
            return;
        }
        studentDormService.decrDormHeadCount(olddId);
        studentDormService.incrDormHeadCount(dId);
        studentDormService.updateStudentDorm(sId, dId);
    }

}
