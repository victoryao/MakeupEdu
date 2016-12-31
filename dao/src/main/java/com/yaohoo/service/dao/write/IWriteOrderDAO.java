package com.yaohoo.service.dao.write;

import com.yaohoo.service.domain.model.dos.OrderDO;
import org.apache.ibatis.annotations.Insert;

/**
 * Created by yaoqiang on 2016/12/23.
 */
public interface IWriteOrderDAO {

    @Insert("insert into `order` (s_id, name, amount, discount, final_amount, type, created) values (#{sId}, #{name}, #{amount}, #{discount}, #{finalAmount}, #{type}, now())")
    void addOrder(OrderDO orderDO);

}
