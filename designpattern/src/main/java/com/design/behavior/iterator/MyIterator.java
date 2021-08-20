package com.design.behavior.iterator;

/**
 * @description
 * @author: shengjie.kang kangsj1@lenovo.com
 * @date: create in 2021/8/2
 * @modified by:
 */
public interface MyIterator {
    void first(); //第一个
    void next(); //下一个
    boolean isDone(); //是否点名完毕
    Object currentItem(); //当前同学的出勤情况
}
