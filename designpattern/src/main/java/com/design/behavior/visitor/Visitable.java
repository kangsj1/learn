package com.design.behavior.visitor;

/**
 * @description
 * @author: shengjie.kang kangsj1@lenovo.com
 * @date: create in 2021/8/11
 * @modified by:
 */
public interface Visitable {
    public void accept(Visitor visitor);
}
