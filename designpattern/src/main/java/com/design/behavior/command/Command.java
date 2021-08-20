package com.design.behavior.command;

/**
 *
 * Command模式是最让我疑惑的一个模式,我在阅读了很多代码后,才感觉隐约掌握其大概原
 * 理,我认为理解设计模式最主要是掌握起原理构造,这样才对自己实际编程有指导作
 * 用.Command 模式实际上不是个很具体,规定很多的模式,正是这个灵活性,让人有些
 * confuse.
 * Command 定义
 * n 将来自客户端的请求传入一个对象，无需了解这个请求激活的 动作或有关接受这个请求
 * 的处理细节。
 * 这是一种两台机器之间通讯联系性质的模式，类似传统过程语 言的 CallBack 功能。
 * 优点：
 * 解耦了发送者和接受者之间联系。 发送者调用一个操作，接受者接受请求执行相应的动作，
 * 因为使用 Command 模式解耦，发送者无需知道接受者任何接口
 *
 * @description
 * @author: shengjie.kang kangsj1@lenovo.com
 * @date: create in 2021/8/11
 * @modified by:
 */
public interface Command {
    public abstract void execute();
}
