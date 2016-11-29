package com.yaohoo.service.dao.fieldhandler;

import com.yaohoo.service.domain.model.RemarkModel;

import java.util.List;

/**
 * Created by yaoqiang on 2016/11/28.
 */
public class RemarkListFieldHandler extends JsonFieldHandler<List<RemarkModel>> {

    @Override
    public Class getCls() {
        return List.class;
    }

}
