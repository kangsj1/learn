package com.design.structure.decorator;

import java.util.ArrayList;
import java.util.ListIterator;

public class Decorator implements Work{
    private Work work;
    //额外增加的功能被打包在这个 List 中
    private ArrayList others = new ArrayList();
    //在构造器中使用组合 new 方式,引入 Work 对象;
    public Decorator(Work work)
    {
        this.work=work;

        others.add("挖坑");
        others.add("钉木板");
    }

    @Override
    public void insert() {
        newMethod();
    }

    //在新方法中,我们在 insert 之前增加其他方法,这里次序先后是用户灵活指定的
    public void newMethod()
    {
        otherMethod();
        work.insert();
    }

    public void otherMethod()
    {
        ListIterator listIterator = others.listIterator();
        while (listIterator.hasNext())
        {

            System.out.println(((String)(listIterator.next())) +
                    " 正在进行");
        }
    }
}
