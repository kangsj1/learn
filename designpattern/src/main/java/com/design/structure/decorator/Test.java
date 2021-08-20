package com.design.structure.decorator;

/**
 * 装饰模式:Decorator 常被翻译成"装饰",我觉得翻译成"油漆工"更形象点,油漆工
 * (decorator)是用来刷油漆的,那么被刷油漆的对象我们称 decoratee.这两种实体在
 * Decorator 模式中是必须的.
 * Decorator 定义:
 * 动态给一个对象添加一些额外的职责,就象在墙上刷油漆.使用 Decorator 模式相比用生
 * 成子类方式达到功能的扩充显得更为灵活.
 * 为什么使用 Decorator?
 * 我们通常可以使用继承来实现功能的拓展,如果这些需要拓展的功能的种类很繁多,那么势
 * 必生成很多子类,增加系统的复杂性,同时,使用继承实现功能拓展,我们必须可预见这些拓
 * 展功能,这些功能是编译时就确定了,是静态的.
 * 使用 Decorator 的理由是:这些功能需要由用户动态决定加入的方式和时机.Decorator
 * 提供了"即插即用"的方法,在运行期间决定何时增加何种功能.
 *
 * 我们把挖坑和钉木板都排在了打桩 insert 前面,这里只是举例说明额外功能次
 * 序可以任意安排.
 * 好了,Decorator 模式出来了,我们看如何调用:
 */
public class Test {
    public static void main(String[] args) {
        Work squarePeg = new SquarePeg();
        Work decorator = new Decorator(squarePeg);
        decorator.insert();
    }

}
