package com.design.creator.singleton;

/**
 * 懒汉式，双重检查锁,双重校验锁
 */
public class SingletonLazy03 {
    //volatile 避免因3，4行指令重排导致的不同对象产生
    private static volatile SingletonLazy03 singletonLazy03;

    private SingletonLazy03(){}

    public static SingletonLazy03 instance(){
        //外层判断，避免每次获取都要加锁
        if(singletonLazy03==null){
            //锁当前class对象
            synchronized (SingletonLazy03.class){
                //内层判断，避免当同时等待的线程在获取取到锁后创建不同对象
                if(singletonLazy03==null){//3
                    singletonLazy03 = new SingletonLazy03();//4
                }
            }
        }
        return singletonLazy03;
    }
}
