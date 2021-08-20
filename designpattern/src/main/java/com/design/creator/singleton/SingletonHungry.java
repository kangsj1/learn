package com.design.creator.singleton;

import java.io.ObjectStreamException;

/**
 * 饿汉式，线程安全，初始化时进行实例化
 */
public class SingletonHungry {
    private static SingletonHungry singletonHungry = new SingletonHungry();

    private SingletonHungry(){
        // 防止反射获取多个对象的漏洞
        if (null != singletonHungry) {
            throw new RuntimeException();
        }
    }

    public static SingletonHungry instance(){
        return singletonHungry;
    }

    // 防止反序列化获取多个对象的漏洞。
    // 无论是实现Serializable接口，或是Externalizable接口，当从I/O流中读取对象时，readResolve()方法都会被调用到。
    // 实际上就是用readResolve()中返回的对象直接替换在反序列化过程中创建的对象。
    private Object readResolve() throws ObjectStreamException {
        return singletonHungry;
    }

}
