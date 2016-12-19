package com.yaohoo.service.biz.stumanager;

import com.yaohoo.service.domain.model.dos.StuGraduateDO;
import com.yaohoo.service.service.stumanager.GraduateService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by yaoqiang on 2016/12/17.
 */
@Service
public class GraduateBiz {
    @Resource
    private GraduateService graduateService;

    public void addStudenGraduate(int sId, String company, int companyType) {
        graduateService.addStudenGraduate(sId, company, companyType);
    }

    public List<StuGraduateDO> getStudentGraduates(int sId) {
        return graduateService.getStudentGraduates(sId);
    }
}
