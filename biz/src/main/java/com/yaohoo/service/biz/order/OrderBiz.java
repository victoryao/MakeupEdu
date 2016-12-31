package com.yaohoo.service.biz.order;

import com.yaohoo.service.domain.model.dos.OrderDO;
import com.yaohoo.service.domain.model.enums.StuStatusEnum;
import com.yaohoo.service.service.order.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by yaoqiang on 2016/12/23.
 */
@Service
public class OrderBiz {

    @Resource
    private OrderService orderService;

    public void addOrder(OrderDO orderDO) {
        orderService.addOrder(orderDO);
    }

    public List<OrderDO> getOrderListBySId(int sId, int status) {
        return orderService.getOrderListBySId(sId, status);
    }


}
