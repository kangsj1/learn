package com.design.behavior.visitor;

import java.util.Collection;
import java.util.Iterator;

/**
 * @description
 * @author: shengjie.kang kangsj1@lenovo.com
 * @date: create in 2021/8/11
 * @modified by:
 */
public class ConcreteVisitor implements Visitor{
    @Override
    public void visitString(StringElement stringE) {
        System.out.println("'"+stringE.getValue()+"'");
    }

    @Override
    public void visitFloat(FloatElement floatE) {
        System.out.println(floatE.getValue().toString()+"f");
    }

    //在本方法中,我们实现了对 Collection 的元素的成功访问
    @Override
    public void visitCollection(Collection collection) {
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            Object o = iterator.next();
            if (o instanceof Visitable)
                ((Visitable)o).accept(this);
        }
    }
}
