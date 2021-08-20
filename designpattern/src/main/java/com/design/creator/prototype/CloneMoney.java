package com.design.creator.prototype;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 因为 Java 中的提供 clone()方法来实现对象的克隆,所以 Prototype 模式实现一下子变
 * 得很简单.
 */
public class CloneMoney {
    public static void main(String[] args) {
        Money money = new Money(new BigDecimal("123"),123,new Date(),"123");
        Object clone = money.clone();
        System.out.println("clone = " + clone);
        BigDecimal price = money.getPrice();
        Money money1 = (Money) clone;
        BigDecimal price1 = money1.getPrice();
        System.out.println("price==price2 = " + (price==price1));
        BigDecimal multiply = money.getPrice().multiply(new BigDecimal("2"));
        money.setPrice(multiply);
        System.out.println("money = " + money);
        System.out.println("price==price2 = " + (price==price1));
        System.out.println("money1 = " + money1);
    }
}
