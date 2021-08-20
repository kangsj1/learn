package com.design.behavior.state;

/**
 * @description
 * @author: shengjie.kang kangsj1@lenovo.com
 * @date: create in 2021/8/11
 * @modified by:
 */
public class BlueState extends State{
    @Override
    public void handlepush(Context c) {
        //根据 push 方法"如果是 blue 状态的切换到 green" ;
        c.setState(new GreenState());
    }

    @Override
    public void handlepull(Context c) {
        //根据 pull 方法"如果是 blue 状态的切换到 red" ;
        c.setState(new RedState());
    }

    @Override
    public void getcolor() {
        System.out.println("true = " + true);
    }
}
