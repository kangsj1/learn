package com.design.behavior.visitor;

/**
 * @description
 * @author: shengjie.kang kangsj1@lenovo.com
 * @date: create in 2021/8/11
 * @modified by:
 */
public class FloatElement implements Visitable{
    private Float value;
    public FloatElement(Float value) {
        this.value = value;
    }
    public Float getValue(){
        return value;
    }

    //定义 accept 的具体内容 这里是很简单的一句调用
    @Override
    public void accept(Visitor visitor) {
        visitor.visitFloat(this);
    }
}
