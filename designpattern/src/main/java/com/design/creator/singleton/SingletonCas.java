package com.design.creator.singleton;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/**
 * 使用CAS锁来保证实例的唯一
 */
public class SingletonCas {
    private static final AtomicReference<SingletonCas> INSTANCE = new AtomicReference<>();

    private SingletonCas(){
        // 防止反射获取多个对象的漏洞
        if (null != INSTANCE.get()) {
            throw new RuntimeException();
        }
    }


    public static SingletonCas instance(){
        while (true){
            SingletonCas singletonCas = INSTANCE.get();
            if(singletonCas!=null){
                return singletonCas;
            }
            singletonCas = new SingletonCas();
            if(INSTANCE.compareAndSet(null,singletonCas)){
                return singletonCas;
            }
        }
    }
}
