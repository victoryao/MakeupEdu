package com.yaohoo.service.biz.stumanager;

import com.yaohoo.service.biz.order.OrderBiz;
import com.yaohoo.service.common.util.QueryResult;
import com.yaohoo.service.domain.model.StudentModel;
import com.yaohoo.service.domain.model.dos.DormDO;
import com.yaohoo.service.domain.model.dos.OrderDO;
import com.yaohoo.service.domain.model.dos.StudentDormDO;
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
    @Resource
    private OrderBiz orderBiz;

    public QueryResult<StudentModel> getStudentDormQueryPaging(int id, String name, long phone, int status, int offset, int limit) {
        List<StudentModel> list = studentService.getStudentQueryPaging(id, name, phone, status, offset, limit);
        for (StudentModel st : list) {
            StudentDormDO studentDormDO = studentDormService.getStudentDormRelations(st.getId());
            if (studentDormDO == null) {
                st.setDormStatus(StuStatusEnum.NO.getValue());
            } else {
                st.setDormStatus(StuStatusEnum.YES.getValue());
                DormDO dormDO = studentDormService.getDormById(studentDormDO.getdId());
                st.setDormId(dormDO.getdId());
            }
        }
        QueryResult<StudentModel> qr = new QueryResult<>();
        int totalRecord = studentService.getStudentQueryCount(id, name, phone, status);
        qr.setResultlist(list);
        qr.setTotalrecord(totalRecord);
        return qr;
    }

    public DormDO getDormById(int id) {
        return studentDormService.getDormById(id);
    }

    public StudentDormDO getStudentDormRelations(int sId) {
        return studentDormService.getStudentDormRelations(sId);
    }

    public List<DormDO> getDormsByTotalCount(int totalCount) {
        return studentDormService.getDormsByTotalCount(totalCount);
    }

    @Transactional
    public void addStudentDorm(int sId, int dId) {
        DormDO dormDO = studentDormService.getDormById(dId);
        if (dormDO.getHeadCount() >= dormDO.getTotalCount()) {
            return;
        }
        studentDormService.addStudentDorm(sId, dId);
        studentDormService.incrDormHeadCount(dId);
    }

    @Transactional
    public void exchangeStudentDorm(int sId, int dId) {
        Integer olddId = studentDormService.getDormIdByStudentId(sId);
        if (olddId == null) {
            return;
        }
        studentDormService.decrDormHeadCount(olddId);
        studentDormService.incrDormHeadCount(dId);
        studentDormService.updateStudentDorm(sId, dId);
    }

    @Transactional
    public void cancelDorm(int sId, String name, int dId, int stuDormId, float amount, float discount, float finalAmount) {
        studentDormService.decrDormHeadCount(dId);
        studentDormService.cancelStudentDorm(stuDormId);
        orderBiz.addOrder(new OrderDO.Builder().amount(amount).discount(discount).finalAmount(finalAmount).sId(sId).name(name).build());
    }

}
