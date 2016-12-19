package com.yaohoo.service.service.order;

import com.yaohoo.service.dao.read.IOrderDAO;
import com.yaohoo.service.domain.model.dos.OrderDO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by yaoqiang on 2016/12/18.
 */
@Service
public class OrderService {

    @Resource
    private IOrderDAO orderDAO;

    public List<OrderDO> getOrderListBySId(int sId, int status){
        return orderDAO.getOrderListBySId(sId, status);
    }
}
