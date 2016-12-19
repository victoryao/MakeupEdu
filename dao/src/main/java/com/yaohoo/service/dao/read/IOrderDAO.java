package com.yaohoo.service.dao.read;

import com.yaohoo.service.domain.model.dos.OrderDO;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by yaoqiang on 2016/12/18.
 */
public interface IOrderDAO {

    @Select("select id, s_id as sId, name, amount, discount, final_amount as finalAmount, pay_type as payType, type, status from `order` where s_id  = #{sId} and status = #{status} order by created asc")
    List<OrderDO> getOrderListBySId(@Param("sId") int sId,@Param("status") int status);

}
