package com.design.structure.flyweight;

/**
 * Flyweight模式是一个提高程序效率和性能的模式,会大大加快程序的运行速度.应
 * 用场合很多:比如你要从一个数据库中读取一系列字符串,这些字符串中有许多是重复的,
 * 那么我们可以将这些字符串储存在Flyweight池(pool)中.
 */
public interface FlyWeight {

    void operation(ExtrinsicState state);



}
