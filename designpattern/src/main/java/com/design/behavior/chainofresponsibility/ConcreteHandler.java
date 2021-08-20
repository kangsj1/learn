package com.design.behavior.chainofresponsibility;

/**
 * @description
 * @author: shengjie.kang kangsj1@lenovo.com
 * @date: create in 2021/8/3
 * @modified by:
 */
public class ConcreteHandler implements Handler{
    private Handler successor;

    public ConcreteHandler(Handler successor){
        this.successor=successor;
    }

    @Override
    public void handleRequest(Request request) {
        if (request instanceof HelpRequest){
            //这里是处理 Help 的具体代码
        }else if (request instanceof PrintRequst){
            request.execute();
        }else
            //传递到下一个
            successor.handleRequest(request);
    }
}
