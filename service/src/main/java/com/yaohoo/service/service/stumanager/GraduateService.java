package com.yaohoo.service.service.stumanager;

import com.yaohoo.service.dao.read.IStuGraduateDAO;
import com.yaohoo.service.dao.write.IWriteStuGraduateDAO;
import com.yaohoo.service.domain.model.dos.StuGraduateDO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by yaoqiang on 2016/12/17.
 */
@Service
public class GraduateService {

    @Resource
    private IStuGraduateDAO stuGraduateDAO;
    @Resource
    private IWriteStuGraduateDAO writeStuGraduateDAO;

    public List<StuGraduateDO> getStudentGraduates(int sId) {
        return stuGraduateDAO.getStudenGraduateBySId(sId);
    }

    public void addStudenGraduate(int sId, String company, int companyType){
        writeStuGraduateDAO.addStudenGraduate(sId, company, companyType);
    }

}
