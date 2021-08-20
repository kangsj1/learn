package com.design.behavior.template;

/**
 * @description
 * <p>
 *     Template 模板模式定义:
 * 定义一个操作中算法的骨架,将一些步骤的执行延迟到其子类中.
 * </p>
 * @author: shengjie.kang kangsj1@lenovo.com
 * @date: create in 2021/8/2
 * @modified by:
 */
public class MethodBenchmark extends Benchmark{
    @Override
    public void benchmark() {
        for (int i = 0; i < 1; i++){
            System.out.println("i="+i);
        }
    }
}
