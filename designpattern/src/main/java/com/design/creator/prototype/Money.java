package com.design.creator.prototype;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 原型模式定义:
 * 用原型实例指定创建对象的种类,并且通过拷贝这些原型创建新的对象.
 * Prototype 模式允许一个对象再创建另外一个可定制的对象，根本无需知道任何如何创建
 * 的细节,工作原理是:通过将一个原型对象传给那个要发动创建的对象，这个要发动创建的
 * 对象通过请求原型对象拷贝它们自己来实施创建
 * 我最想clone的是Money
 */
public class Money implements Cloneable{
    private BigDecimal price;
    private Integer size;
    private Date year;
    private String name;

    public Money(BigDecimal price, Integer size, Date year, String name) {
        this.price = price;
        this.size = size;
        this.year = year;
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public Integer getSize() {
        return size;
    }

    public Date getYear() {
        return year;
    }

    public String getName() {
        return name;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    protected Object clone(){
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString() {
        return "Money{" +
                "price=" + price +
                ", size=" + size +
                ", year=" + year +
                ", name='" + name + '\'' +
                '}';
    }
}
