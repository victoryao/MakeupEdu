package com.yaohoo.service.biz.classes;

import com.yaohoo.service.domain.model.dos.TeacherClassDO;
import com.yaohoo.service.service.classes.ClassService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by yaoqiang on 2016/12/4.
 */
@Service
public class ClassBiz {

    @Resource
    private ClassService classService;

    public List<TeacherClassDO> getTeacherClasses(){
        return classService.getTeacherClasses();
    }
}
