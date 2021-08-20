package com.design.creator.builder;

/**
 * 将一个复杂对象的构建与它的表示分离,使得同样的构建过程可以创建不同的表示.
 *
 * Builder 模式是一步一步创建一个复杂的对象,它允许用户可以只通过指定复杂对象的类
 * 型和内容就可以构建它们.用户不知道内部的具体构建细节.Builder模式是非常类似抽象
 * 工厂模式,细微的区别大概只有在反复使用中才能体会到.
 *
 * 使用：是为了将构建复杂对象的过程和它的部件解耦.注意: 是解耦过程和部件.
 *
 */
public interface Builder {

    //创建部件 A 比如创建汽车车轮
    void buildPartA();
    //创建部件 B 比如创建汽车方向盘
    void buildPartB();
    //创建部件 C 比如创建汽车发动机
    void buildPartC();

    //成品的组装过程不在这里进行,而是转移到下面的 Director 类中进行.
    //从而实现了解耦过程和部件
    Product build();
}
