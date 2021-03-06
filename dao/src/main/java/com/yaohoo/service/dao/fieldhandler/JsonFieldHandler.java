package com.yaohoo.service.dao.fieldhandler;

import com.alibaba.fastjson.JSON;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.type.JdbcType;
import org.apache.ibatis.type.TypeHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public abstract class JsonFieldHandler<T> implements TypeHandler<T>, IJsonField<T> {
    private static Logger logger = LoggerFactory.getLogger(JsonFieldHandler.class);

    @Override
    public void setParameter(PreparedStatement ps, int i, T parameter, JdbcType jdbcType) throws SQLException {
        try {
            if (parameter != null) {
                ps.setString(i, JSON.toJSONString(parameter));
                return;
            }
        } catch (Exception e) {
            logger.error("setParameter", e);
        }
        ps.setString(i, "");
    }

    @Override
    public T getResult(ResultSet rs, String columnName) throws SQLException {
        String str = rs.getString(columnName);
        return getJsonObject(str);
    }

    @Override
    public T getResult(ResultSet rs, int columnIndex) throws SQLException {
        String str = rs.getString(columnIndex);
        return getJsonObject(str);
    }

    @Override
    public T getResult(CallableStatement cs, int columnIndex) throws SQLException {
        String str = cs.getString(columnIndex);
        return getJsonObject(str);
    }

    @Override
    public T getJsonObject(String str) {
        if (StringUtils.isEmpty(str)) {
            return null;
        }
        try {
            return (T) JSON.parseObject(str, getCls());
        } catch (Exception e) {
            logger.error("getJsonObject {} ", str, e);
            return null;
        }
    }

    public abstract Class getCls();

    public static void main(String[] args) {
        String json = "[{\"code\":0,\"remark\":\"备注\"},{\"code\":1,\"remark\":\"备注\"},{\"code\":2,\"remark\":\"备注\"}]";
        JSON.parseObject(json , List.class);
    }
}
