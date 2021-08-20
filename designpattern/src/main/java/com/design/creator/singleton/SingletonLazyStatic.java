package com.design.creator.singleton;

import java.io.ObjectStreamException;

/**
 * 静态内部类的方式实现,当内部类在访求调用时被加载时初始化实例
 */
public class SingletonLazyStatic {
    static {
        System.out.println("SingletonLazyStatic类初始化");
    }
    private static SingletonLazyStatic singletonLazyStatic;

    private SingletonLazyStatic(){
        // 防止反射获取多个对象的漏洞
        if (null != singletonLazyStatic) {
            throw new RuntimeException();
        }
    }

    public static SingletonLazyStatic instance(){
        return SingletonLazyStaticInner.singletonLazyStatic;
    }

    // 防止反序列化获取多个对象的漏洞
    private Object readResolve() throws ObjectStreamException {
        return singletonLazyStatic;
    }

    private static class SingletonLazyStaticInner{
        static {
            System.out.println("SingletonLazyStaticInnerd内部类初始化");
        }
        private static SingletonLazyStatic singletonLazyStatic = new SingletonLazyStatic();
    }
}
