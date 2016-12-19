package com.yaohoo.service.provider.controller.stumanager;

import com.yaohoo.service.biz.stumanager.StuManagerBiz;
import com.yaohoo.service.common.util.Constant;
import com.yaohoo.service.common.util.PageView;
import com.yaohoo.service.common.util.QueryResult;
import com.yaohoo.service.domain.model.StudentModel;
import com.yaohoo.service.domain.model.enums.StudentStatusEnum;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

/**
 * Created by yaoqiang on 2016/12/14.
 */
@Controller
public class StuManagerController {

    @Resource
    private StuManagerBiz stuManagerBiz;

    @RequestMapping(value = "/student/manager/home/list.do", method = RequestMethod.GET)
    public Object getStudentQueryPaging(
            @RequestParam(required = false, defaultValue = "0") int id,
            @RequestParam(required = false) String name,
            @RequestParam(required = false) String type,
            @RequestParam(required = false, defaultValue = "0") long phone,
            @RequestParam(required = false, defaultValue = "1") int page,
            @RequestParam(required = false, defaultValue = "10") int limit,
            ModelMap modelMap) {
        if (limit > 100) {
            limit = Constant.pageSize;
        }
        if (StringUtils.isEmpty(name)) {
            name = null;
        }
        PageView<StudentModel> pageView = new PageView<>(limit, page);
        QueryResult<StudentModel> qr = stuManagerBiz.getStudentManagerQueryPaging(id, name, phone, StudentStatusEnum.SIGNED.getValue(), type, pageView.getFirstResult(), pageView.getMaxresult());
        pageView.setQueryResult(qr);
        modelMap.addAttribute("pageView", pageView);
        return navToPage(type);
    }

    private String navToPage(String type) {
        if ("graduate".equals(type)) {
            return "graduate/graduate_home";
        }
        if ("consume".equals(type)) {
            return "consume/consume_home";
        }
        if ("order".equals(type)){
            return "order/order_home";
        }
        return "graduate/graduate_home";
    }


}
