package com.yaohoo.service.dao.provider;

import com.alibaba.fastjson.JSON;
import com.yaohoo.service.domain.model.RemarkModel;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by yaoqiang on 2016/11/27.
 */
public class RemarkHandler implements TypeHandler<RemarkModel> {


    public void setParameter(PreparedStatement ps, int i, RemarkModel remarkModel, JdbcType jdbcType) throws SQLException {
        if (remarkModel != null) {
            ps.setString(i, JSON.toJSONString(remarkModel));
            return;
        }
        ps.setString(i, "");
    }

    public RemarkModel getResult(ResultSet rs, String columnName) throws SQLException {
        String str = rs.getString(columnName);
        return getJsonObject(str);
    }

    public RemarkModel getResult(ResultSet rs, int columnIndex) throws SQLException {
        String str = rs.getString(columnIndex);
        return getJsonObject(str);
    }

    public RemarkModel getResult(CallableStatement cs, int columnIndex) throws SQLException {
        String str = cs.getString(columnIndex);
        return getJsonObject(str);
    }

    private RemarkModel getJsonObject(String str) {
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        try {
            return JSON.parseObject(str, RemarkModel.class);
        } catch (Exception e) {
            return null;
        }
    }
}
