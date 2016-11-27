package com.yaohoo.service.service.student;

import com.yaohoo.service.dao.write.IWriteStuQueryHisDAO;
import com.yaohoo.service.domain.model.StuQueryModel;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by yaoqiang on 2016/11/27.
 */
@Service
public class StuQueryHisService {

    @Resource
    private IWriteStuQueryHisDAO writeStuQueryHisDAO;

    public boolean addStuQueryHis(StuQueryModel stuQueryModel) {
        return writeStuQueryHisDAO.addStuQueryHis(stuQueryModel);
    }
}
