package com.design.creator.builder;

/**
 * Builder 的具体实现 ConcreteBuilder:
 * 通过具体完成接口 Builder 来构建或装配产品的部件;
 * 定义并明确它所要创建的是什么具体东西;
 * 提供一个可以重新获取产品的接口:
 */
public class ConcreteBuilder implements Builder{
    @Override
    public void buildPartA() {

    }

    @Override
    public void buildPartB() {

    }

    @Override
    public void buildPartC() {

    }

    @Override
    public Product build() {
        return null;
    }
}
