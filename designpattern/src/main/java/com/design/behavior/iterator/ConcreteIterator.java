package com.design.behavior.iterator;

/**
 * @description
 * @author: shengjie.kang kangsj1@lenovo.com
 * @date: create in 2021/8/2
 * @modified by:
 */
public class ConcreteIterator implements MyIterator{
    private ConcreteTeacher teacher;
    private int index = 0;
    private int size = 0;
    public ConcreteIterator(ConcreteTeacher teacher){
        this.teacher = teacher;
        size = teacher.getSize(); //得到同学的数目
        index = 0;
    }


    @Override
    public void first() {
        index = 0;
    }

    @Override
    public void next() {
        if(index<size){
            index++;
        }
    }

    @Override
    public boolean isDone() {
        return (index>=size);
    }

    @Override
    public Object currentItem() {
        return teacher.getElement(index);
    }
}
