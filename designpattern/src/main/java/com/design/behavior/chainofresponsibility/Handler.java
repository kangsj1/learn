package com.design.behavior.chainofresponsibility;

/**
 * @description
 * <p>
 *     Chain of Responsibility 定义
 * Chain of Responsibility(CoR) 是用一系列类(classes)试图处理一个请求
 * request,这些类之间是一个松散的耦合,唯一共同点是在他们之间传递 request. 也就
 * 是说，来了一个请求，A 类先处理，如果没有处理，就传递到 B 类处理，如果没有处理，就
 * 传递到 C 类处理，就这样象一个链条(chain)一样传递下去
 * </p>
 * @author: shengjie.kang kangsj1@lenovo.com
 * @date: create in 2021/8/3
 * @modified by:
 */
public interface Handler {
    public void handleRequest(Request request);
}
