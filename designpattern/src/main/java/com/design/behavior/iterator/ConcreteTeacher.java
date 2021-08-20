package com.design.behavior.iterator;

/**
 * @description
 * @author: shengjie.kang kangsj1@lenovo.com
 * @date: create in 2021/8/2
 * @modified by:
 */
public class ConcreteTeacher implements Teacher{

    private Object[] present = {"张三来了","李四来了","王五没来"}; //同学出勤集合

    public Object getElement(int index){ //得到当前同学的出勤情况
        if(index<present.length){
            return present[index];
        }
        else{
            return null;
        }
    }
    public int getSize(){
        return present.length; //得到同学出勤集合的大小,也就是说要知道班上有多少人
    }

    @Override
    public MyIterator createIterator() {
        return new ConcreteIterator(this); //新的点名
    }
}
