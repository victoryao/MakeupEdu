package com.yaohoo.service.service.student;

import com.yaohoo.service.dao.read.IStuQueryDAO;
import com.yaohoo.service.dao.write.IWriteStuQueryHisDAO;
import com.yaohoo.service.domain.model.StuQueryModel;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by yaoqiang on 2016/11/27.
 */
@Service
public class StuQueryHisService {

    @Resource
    private IWriteStuQueryHisDAO writeStuQueryHisDAO;
    @Resource
    private IStuQueryDAO stuQueryDAO;

    public boolean addStuQueryHis(StuQueryModel stuQueryModel) {
        return writeStuQueryHisDAO.addStuQueryHis(stuQueryModel);
    }

    public List<StuQueryModel> getStuQueryHisList(int stuId) {
        return stuQueryDAO.getStuQueryHisList(stuId);
    }
}
