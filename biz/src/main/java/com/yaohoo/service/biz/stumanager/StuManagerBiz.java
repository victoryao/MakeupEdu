package com.yaohoo.service.biz.stumanager;

import com.yaohoo.service.common.util.QueryResult;
import com.yaohoo.service.domain.model.StudentModel;
import com.yaohoo.service.domain.model.dos.OrderDO;
import com.yaohoo.service.domain.model.dos.StuGraduateDO;
import com.yaohoo.service.domain.model.dos.StudentDormDO;
import com.yaohoo.service.domain.model.enums.StuStatusEnum;
import com.yaohoo.service.service.order.OrderService;
import com.yaohoo.service.service.student.StudentService;
import com.yaohoo.service.service.stumanager.GraduateService;
import com.yaohoo.service.service.stumanager.StudentDormService;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by yaoqiang on 2016/12/17.
 */
@Service
public class StuManagerBiz {

    @Resource
    private StudentDormService studentDormService;
    @Resource
    private StudentService studentService;
    @Resource
    private GraduateService graduateService;
    @Resource
    private OrderService orderService;


    public QueryResult<StudentModel> getStudentManagerQueryPaging(int id, String name, long phone, int status, String type, int offset, int limit) {
        List<StudentModel> list = studentService.getStudentQueryPaging(id, name, phone, status, offset, limit);
        for (StudentModel st : list) {
            String pro = hasManagerProperty(st.getId(), type);
            if (StringUtils.isEmpty(pro)) {
                st.setProStatus(StuStatusEnum.NO.getValue());
            } else {
                st.setProStatus(StuStatusEnum.YES.getValue());
                st.setProperty(pro);
            }
        }
        QueryResult<StudentModel> qr = new QueryResult<>();
        int totalRecord = studentService.getStudentQueryCount(id, name, phone, status);
        qr.setResultlist(list);
        qr.setTotalrecord(totalRecord);
        return qr;
    }

    private String hasManagerProperty(int sId, String type) {
        if ("dorm".equals(type)) {
            StudentDormDO studentDormDO = studentDormService.getStudentDormRelations(sId);
            if (studentDormDO == null) {
                return null;
            }
            return studentDormService.getDormById(studentDormDO.getdId()).getdId();
        } else if ("graduate".equals(type)) {
            List<StuGraduateDO> stuGraduateDO = graduateService.getStudentGraduates(sId);
            if (CollectionUtils.isEmpty(stuGraduateDO)) {
                return null;
            }
            return stuGraduateDO.get(0).getCompany();
        } else if ("order".equals(type)) {
            List<OrderDO> orderDOList = orderService.getOrderListBySId(sId, StuStatusEnum.NO.getValue());
            if (CollectionUtils.isEmpty(orderDOList)) {
                return null;
            }
            return orderDOList.get(0).getName();
        }
        return StringUtils.EMPTY;
    }
}
