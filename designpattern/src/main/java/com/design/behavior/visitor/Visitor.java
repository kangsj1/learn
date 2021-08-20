package com.design.behavior.visitor;

import java.util.Collection;

/**
 *
 * Visitor 访问者模式定义
 * 作用于某个对象群中各个对象的操作. 它可以使你在不改变这些对象本身的情况下,定义
 * 作用于这些对象的新操作.
 * 在 Java 中,Visitor 模式实际上是分离了 collection 结构中的元素和对这些元素进行
 * 操作的行为.
 * @description
 * @author: shengjie.kang kangsj1@lenovo.com
 * @date: create in 2021/8/11
 * @modified by:
 */
public interface Visitor {
    public void visitString(StringElement stringE);
    public void visitFloat(FloatElement floatE);
    public void visitCollection(Collection collection);
}
