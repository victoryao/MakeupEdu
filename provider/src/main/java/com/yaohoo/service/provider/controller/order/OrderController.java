package com.yaohoo.service.provider.controller.order;

import com.yaohoo.service.biz.order.OrderBiz;
import com.yaohoo.service.biz.student.StudentBiz;
import com.yaohoo.service.common.util.Constant;
import com.yaohoo.service.common.util.PageView;
import com.yaohoo.service.common.util.QueryResult;
import com.yaohoo.service.domain.model.StudentModel;
import com.yaohoo.service.domain.model.dos.OrderDO;
import com.yaohoo.service.domain.model.dos.StudentClassDO;
import com.yaohoo.service.domain.model.enums.StuStatusEnum;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by yaoqiang on 2016/12/23.
 */
@Controller
public class OrderController {

    @Resource
    private OrderBiz orderBiz;
    @Resource
    private StudentBiz studentBiz;

    @RequestMapping(value = "/order/add.do", method = RequestMethod.POST)
    public Object addOrder(
            @RequestParam float amount,
            @RequestParam float discount,
            @RequestParam float finalAmount,
            @RequestParam int sId,
            @RequestParam String name,
            ModelMap modelMap) {
        orderBiz.addOrder(new OrderDO.Builder().amount(amount).discount(discount).finalAmount(finalAmount).sId(sId).name(name).build());
        return "student/stu_to_follow";
    }

    @RequestMapping(value = "/order/list.do", method = RequestMethod.GET)
    public Object getOrderList(
            @RequestParam int sId,
            ModelMap modelMap) {
        List<OrderDO> orderDOList = orderBiz.getOrderListBySId(sId, StuStatusEnum.NO.getValue());
        System.out.println(orderDOList.size());
        StudentModel student = studentBiz.getStudentById(sId);
        modelMap.addAttribute("student", student);
        modelMap.addAttribute("orderDOs", orderDOList);
        return "consume/consume_list";
    }

    @RequestMapping(value = " /order/pay.do", method = RequestMethod.GET)
    public Object ToOrderPay(
            @RequestParam int sId,
            ModelMap modelMap) {
        List<OrderDO> orderDOList = orderBiz.getOrderListBySId(sId, StuStatusEnum.NO.getValue());
        System.out.println(orderDOList.size());
        StudentModel student = studentBiz.getStudentById(sId);
        modelMap.addAttribute("student", student);
        modelMap.addAttribute("orderDOs", orderDOList);
        return "order/order_detail";
    }



}
