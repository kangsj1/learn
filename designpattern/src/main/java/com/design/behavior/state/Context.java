package com.design.behavior.state;

/**
 * @description
 * @author: shengjie.kang kangsj1@lenovo.com
 * @date: create in 2021/8/11
 * @modified by:
 */
public class Context {
    private State state=null; //我们将原来的 Color state 改成了新建的
    //setState 是用来改变 state 的状态 使用 setState 实现状态的切换
    public void setState(State state){
        this.state=state;
    }
    public void push(){
        //状态的切换的细节部分,在本例中是颜色的变化,已经封装在子类的
//        handlepush 中实现,这里无需关心
        state.handlepush(this);

        //因为 sample 要使用 state 中的一个切换结果,使用 getColor()
//        Sample sample=new Sample(state.getColor());
//        sample.operate();
    }

    public void pull(){
        state.handlepull(this);

//        Sample2 sample2=new Sample2(state.getColor());
//        sample2.operate();
    }
}
