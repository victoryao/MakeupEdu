package com.yaohoo.service.service.classes;

import com.yaohoo.service.dao.read.ITeacherClassDAO;
import com.yaohoo.service.domain.model.dos.TeacherClassDO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by yaoqiang on 2016/12/4.
 */
@Service
public class ClassService {

    @Resource
    private ITeacherClassDAO teacherClassDAO;

    public List<TeacherClassDO> getTeacherClasses(){
        return teacherClassDAO.getAllClasses();
    }

}
