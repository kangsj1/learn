package com.design.creator.singleton;

/**
 * 使用ThreadLocal为每个线程副本copy一份变量
 */
public class SingletonThreadLocal {
    private static final ThreadLocal<SingletonThreadLocal> singleton = new ThreadLocal<SingletonThreadLocal>(){
        @Override
        protected SingletonThreadLocal initialValue() {
            return new SingletonThreadLocal();
        }
    };

    private SingletonThreadLocal(){}

    public static SingletonThreadLocal instance(){
        return singleton.get();
    }
}
