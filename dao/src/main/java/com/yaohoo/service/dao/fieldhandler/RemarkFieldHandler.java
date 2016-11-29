package com.yaohoo.service.dao.fieldhandler;

import com.yaohoo.service.domain.model.RemarkModel;

/**
 * Created by yaoqiang on 2016/11/28.
 */
public class RemarkFieldHandler extends JsonFieldHandler<RemarkModel> {

    @Override
    public Class getCls() {
        return RemarkModel.class;
    }

}
