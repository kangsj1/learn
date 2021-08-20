package com.design.creator.singleton;

/**
 * 懒汉式，线程安全方式，加方法锁，性能不高
 */
public class SingletonLazy02 {
    private static SingletonLazy02 singletonLazy02;

    private SingletonLazy02(){}

    public static synchronized SingletonLazy02 instance(){
        if(singletonLazy02==null){
            singletonLazy02 = new SingletonLazy02();
        }
        return singletonLazy02;
    }
}
