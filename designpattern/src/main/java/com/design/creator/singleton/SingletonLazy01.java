package com.design.creator.singleton;

/**
 * 懒汉式，线程不安全，类初始化时不加载，在方法被调用时进行加载
 */
public class SingletonLazy01 {
    /**
     * 1.持有自身的引用
     */
    private static SingletonLazy01 singletonLazy01;

    /**
     * 2.私有化构造函数
     */
    private SingletonLazy01(){

    }

    /**
     * 3.对外提供创建自身实力公共的方法
     * 此方法不安全
     * @return
     */
    public static SingletonLazy01 instance(){
        if(singletonLazy01==null){
            singletonLazy01 = new SingletonLazy01();
        }
        return singletonLazy01;
    }
}
