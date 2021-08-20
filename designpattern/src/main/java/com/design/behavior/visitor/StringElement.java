package com.design.behavior.visitor;

/**
 * @description
 * @author: shengjie.kang kangsj1@lenovo.com
 * @date: create in 2021/8/11
 * @modified by:
 */
public class StringElement implements Visitable{
    private String value;
    public StringElement(String string) {
        value = string;
    }
    public String getValue(){
        return value;
    }

    ////定义 accept 的具体内容 这里是很简单的一句调
    @Override
    public void accept(Visitor visitor) {
        visitor.visitString(this);
    }
}
