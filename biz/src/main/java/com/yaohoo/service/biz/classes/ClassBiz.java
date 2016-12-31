package com.yaohoo.service.biz.classes;

import com.yaohoo.service.common.util.QueryResult;
import com.yaohoo.service.domain.model.dos.ClassDO;
import com.yaohoo.service.domain.model.dos.StudentClassDO;
import com.yaohoo.service.domain.model.dos.TeacherClassDO;
import com.yaohoo.service.domain.model.enums.ClassEnum;
import com.yaohoo.service.service.classes.ClassService;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by yaoqiang on 2016/12/17.
 */
@Service
public class ClassBiz {

    @Resource
    private ClassService classService;

    public QueryResult<TeacherClassDO> getTeacherClassesQuery(int tId, int classTimeType, int classType, int offset, int limit) {
        QueryResult<TeacherClassDO> qr = new QueryResult<>();
        List<TeacherClassDO> list = classService.getTeacherClassesQuery(tId, classTimeType, classType, offset, limit);
        if (CollectionUtils.isNotEmpty(list)) {
            for (TeacherClassDO teacherClassDO : list) {
                teacherClassDO.setClassTypeName(ClassEnum.valueof(teacherClassDO.getClassType()).getName());
                ClassDO classDO = classService.getClassById(teacherClassDO.getcId());
                teacherClassDO.setClassName(classDO.getName());
                teacherClassDO.setClassIntro(classDO.getIntro());
            }
        }
        int totalRecord = classService.getTeacherClassesQueryCount(tId, classTimeType, classType);
        qr.setResultlist(list);
        qr.setTotalrecord(totalRecord);
        return qr;
    }

    public QueryResult<StudentClassDO> getStudentClassesQuery(int sId, String sName, long sPhone, int status, int offset, int limit) {
        QueryResult<StudentClassDO> qr = new QueryResult<>();
        List<StudentClassDO> list = classService.getStudentClassQueryPaging(status, sName, sPhone, status, offset, limit);
        if (CollectionUtils.isNotEmpty(list)) {
            for (StudentClassDO studentClassDO : list) {
                TeacherClassDO teacherClassDO = classService.getTeacherClassesById(studentClassDO.getTcId());
                studentClassDO.setClassTypeName(ClassEnum.valueof(teacherClassDO.getClassType()).getName());
                ClassDO classDO = classService.getClassById(teacherClassDO.getcId());
                studentClassDO.setClassName(classDO.getName());
            }
        }
        int totalRecord = classService.getStudentClassQueryCount(sId, sName, sPhone, status);
        qr.setResultlist(list);
        qr.setTotalrecord(totalRecord);
        return qr;
    }


}
