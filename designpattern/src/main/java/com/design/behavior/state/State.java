package com.design.behavior.state;

/**
 * @description
 * @author: shengjie.kang kangsj1@lenovo.com
 * @date: create in 2021/8/11
 * @modified by:
 */
public abstract class State {
    public abstract void handlepush(Context c);
    public abstract void handlepull(Context c);
    public abstract void getcolor();
}
