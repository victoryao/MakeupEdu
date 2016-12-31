package com.yaohoo.service.domain.model.dos;

import java.util.Date;

/**
 * Created by yaoqiang on 2016/12/18.
 */
public class OrderDO {

    private int id;
    private int sId;
    private String name;
    private float amount;
    private float discount;
    private float finalAmount;
    private int payType;
    private int type;
    private int status;
    private Date created;

    public OrderDO(){}

    public static class Builder {
        private int sId;
        private String name;
        private float amount;
        private float discount;
        private float finalAmount;
        private int payType;
        private int type;
        private int status;
        private Date created;

        public Builder() {
        }

        public Builder sId(int val) {
            sId = val;
            return this;
        }

        public Builder name(String val) {
            name = val;
            return this;
        }

        public Builder amount(float val) {
            amount = val;
            return this;
        }

        public Builder discount(float val) {
            discount = val;
            return this;
        }

        public Builder finalAmount(float val) {
            finalAmount = val;
            return this;
        }

        public Builder type(int val) {
            type = val;
            return this;
        }

        public Builder status(int val) {
            status = val;
            return this;
        }

        public OrderDO build() {
            return new OrderDO(this);
        }
    }

    private OrderDO(Builder builder) {
        sId = builder.sId;
        name = builder.name;
        amount = builder.amount;
        discount = builder.discount;
        finalAmount = builder.finalAmount;
        type = builder.type;
        status = builder.status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public float getFinalAmount() {
        return finalAmount;
    }

    public void setFinalAmount(float finalAmount) {
        this.finalAmount = finalAmount;
    }

    public int getPayType() {
        return payType;
    }

    public void setPayType(int payType) {
        this.payType = payType;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}
