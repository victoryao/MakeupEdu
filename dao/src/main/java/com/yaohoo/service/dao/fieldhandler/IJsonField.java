package com.yaohoo.service.dao.fieldhandler;

/**
 * Created by jessonchan on 14-12-18.
 */
public interface IJsonField<T> {
    public T getJsonObject(String str);
}
