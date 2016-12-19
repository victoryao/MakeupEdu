package com.yaohoo.service.biz.stumanager;

import com.yaohoo.service.common.util.QueryResult;
import com.yaohoo.service.domain.model.StudentModel;
import com.yaohoo.service.domain.model.dos.StudentClassDO;
import com.yaohoo.service.domain.model.enums.StuStatusEnum;
import com.yaohoo.service.service.student.ClassService;
import com.yaohoo.service.service.student.StudentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by yaoqiang on 2016/12/17.
 */
@Service
public class ClassBiz {

    @Resource
    private StudentService studentService;
    @Resource
    private ClassService classService;

    public QueryResult<StudentModel> getStudentClassQueryPaging(int id, String name, long phone, int status, int offset, int limit) {
        List<StudentModel> list = classService.getStudentClassQueryPaging(id, name, phone, status, offset, limit);
        for (StudentModel st : list) {
            StudentClassDO studentClassDO = classService.getClasseRelationBySId(st.getId());
            if (studentClassDO == null) {
                st.setClassStatus(StuStatusEnum.NO.getValue());
            } else {
                st.setClassStatus(StuStatusEnum.YES.getValue());
                st.setClassName(studentClassDO.getClassName());
            }
        }
        QueryResult<StudentModel> qr = new QueryResult<>();
        int totalRecord = studentService.getStudentQueryCount(id, name, phone, status);
        qr.setResultlist(list);
        qr.setTotalrecord(totalRecord);
        return qr;
    }

}
