package com.yaohoo.service.common.util;

import com.google.common.base.Objects;
import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * Created by yaoqiang on 2016/12/9.
 */
public final class Money implements Serializable, Comparable<Money> {

    private static final long serialVersionUID = 8902774465289570464L;

    public static final int DEF_SCALE = 2;

    public static final Money ZERO = Money.create();

    private BigDecimal money;

    private Money() {
        money = BigDecimal.ZERO;
    }

    private Money(float money) {
        this.money = new BigDecimal(Float.toString(money));
    }

    private Money(float money,int scale) {this.money = new BigDecimal(Float.toString(money)).setScale(scale,BigDecimal.ROUND_HALF_UP); }

    private Money(String money) {
        this.money = new BigDecimal(money);
    }

    private Money(String money,int scale) {this.money = new BigDecimal(money).setScale(scale,BigDecimal.ROUND_HALF_UP); }

    private Money(int money) {
        this.money = new BigDecimal(Integer.toString(money));
    }

    private Money(int money,int scale) {this.money = new BigDecimal(Integer.toString(money)).setScale(scale,BigDecimal.ROUND_HALF_UP); }

    private Money(double money) {
        this.money = new BigDecimal(Double.toString(money));
    }

    private Money(double money,int scale) {this.money = new BigDecimal(Double.toString(money)).setScale(scale,BigDecimal.ROUND_HALF_UP); }

    private Money(long money) {
        this.money = new BigDecimal(Long.toString(money));
    }

    private Money(long money,int scale) {this.money = new BigDecimal(Long.toString(money)).setScale(scale,BigDecimal.ROUND_HALF_UP); }

    private Money(BigDecimal money) {
        this.money = money;
    }

    private Money(BigDecimal money,int scale) {
        this.money = money.setScale(scale,BigDecimal.ROUND_HALF_UP);
    }

    public static Money create() {
        return new Money();
    }

    public static Money create(String amount) {
        if (StringUtils.isBlank(amount)) {
            return Money.ZERO;
        }
        return new Money(amount);
    }

    public static Money create(String amount,int scale) {
        if (StringUtils.isBlank(amount)) {
            return Money.ZERO;
        }
        return new Money(amount,scale);
    }

    public static Money create(float amount) {
        return new Money(amount);
    }

    public static Money create(float amount,int scale) {
        return new Money(amount,scale);
    }

    public static Money create(double amount) {
        return new Money(amount);
    }

    public static Money create(double amount,int scale) {
        return new Money(amount,scale);
    }

    public static Money create(int amount) {
        return new Money(amount);
    }

    public static Money create(int amount,int scale) {
        return new Money(amount,scale);
    }

    public static Money create(BigDecimal money) {
        return new Money(money);
    }

    public static Money create(BigDecimal amount,int scale) {
        return new Money(amount,scale);
    }

    public static Money create(Money money) {
        return new Money(money.getMoney());
    }

    public static Money create(Money money,int scale) {
        return new Money(money.getMoney(),scale);
    }

    public static Money create(long money) {
        return new Money(money);
    }

    public static Money create(long money,int scale) {
        return new Money(money,scale);
    }

    /**
     * 是否正数(大于零)
     *
     * @return
     */
    public boolean positive() {
        return money.compareTo(BigDecimal.ZERO) > 0;
    }

    /**
     * 是否负数(小于零)
     *
     * @return
     */
    public boolean negative() {
        return money.compareTo(BigDecimal.ZERO) < 0;
    }

    /**
     * 是否等于0
     *
     * @return
     */
    public boolean zero() {
        return money.compareTo(BigDecimal.ZERO) == 0;
    }

    public Money plus(BigDecimal money) {
        BigDecimal amount = this.money.add(money);
        return Money.create(amount);
    }

    public Money plus(Money money) {
        BigDecimal amount = this.money.add(money.getMoney());
        return Money.create(amount);
    }

    public Money subtract(BigDecimal money) {
        BigDecimal amount = this.money.subtract(money);
        return Money.create(amount);
    }

    public Money subtract(Money money) {
        BigDecimal amount = this.money.subtract(money.getMoney());
        return Money.create(amount);
    }

    public Money divide(Money money) {
        BigDecimal b2 = money.getMoney();
        BigDecimal amount = this.money.divide(b2, DEF_SCALE, BigDecimal.ROUND_HALF_UP);
        return Money.create(amount);
    }

    public Money divide(BigDecimal amount) {
        BigDecimal amountResult = this.money.divide(amount, DEF_SCALE, BigDecimal.ROUND_HALF_UP);
        return Money.create(amountResult);
    }

    public Money divide(Money money, int scale, RoundingMode ROUND_MODE) {
        BigDecimal b2 = money.getMoney();
        BigDecimal amount = this.money.divide(b2, scale, ROUND_MODE);
        return Money.create(amount);
    }

    public Money divide(BigDecimal amount, int scale, RoundingMode ROUND_MODE) {
        BigDecimal amountResult = this.money.divide(amount, scale, ROUND_MODE);
        return Money.create(amountResult);
    }

    public Money multi(BigDecimal amount) {
        BigDecimal amountResult = this.money.multiply(amount).setScale(DEF_SCALE, BigDecimal.ROUND_HALF_UP);
        return Money.create(amountResult);
    }

    public Money multi(Money money) {
        BigDecimal amount = this.money.multiply(money.getMoney()).setScale(DEF_SCALE, BigDecimal.ROUND_HALF_UP);
        return Money.create(amount);
    }

    public Money multi(BigDecimal amount, int scale, RoundingMode ROUND_MODE) {
        BigDecimal amountResult = this.money.multiply(amount).setScale(scale, ROUND_MODE);
        return Money.create(amountResult);
    }

    public Money multi(Money money, int scale, RoundingMode ROUND_MODE) {
        BigDecimal amount = this.money.multiply(money.getMoney()).setScale(scale, ROUND_MODE);
        return Money.create(amount);
    }

    public static Money toYuan(long amountFen) {
        return Money.create(new BigDecimal(String.valueOf(amountFen)).divide(new BigDecimal("100")).setScale(DEF_SCALE));
    }

    /**
     * 转化为分
     *
     * @return
     */
    public long toFen() {
        return this.getMoney().multiply(Money.create(100).getMoney()).setScale(DEF_SCALE, BigDecimal.ROUND_HALF_UP).longValue();
    }

    /**
     * 返回拷贝
     */
    public BigDecimal getMoney() {
        return new BigDecimal(money.toPlainString());
    }

    /**
     * 仅序列化用.不可用于其它目的.防止金额改变
     */
    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    /**
     * 转换为 float ,单位元
     *
     * @return
     */
    public float toFloatValue() {
        return money == null ? 0.00f : money.floatValue();
    }

    public String toStringValue() {
        return this.money == null ? "" : this.money.toString();
    }

    public boolean same(Money money) {
        return compareTo(money) == 0;
    }

    public boolean lessThan(Money o) {
        return compareTo(o) < 0;
    }

    public boolean moreThan(Money o) {
        return compareTo(o) > 0;
    }

    public boolean notLessThan(Money o) {
        return !lessThan(o);
    }

    public boolean notMoreThan(Money o) {
        return !moreThan(o);
    }

    public int compareTo(Money o) {
        return this.money.compareTo(o.getMoney());
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || !(o instanceof Money)) {
            return false;
        }
        Money that = (Money) o;
        return this.getMoney().compareTo(that.getMoney()) == 0;

    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.getMoney());
    }

    @Override
    public String toString() {
        return this.money == null ? "" : this.money.toString();
    }

}
