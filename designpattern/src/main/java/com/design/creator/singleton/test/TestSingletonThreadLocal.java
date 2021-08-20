package com.design.creator.singleton.test;

import com.design.creator.singleton.SingletonThreadLocal;

import java.util.concurrent.CountDownLatch;

public class TestSingletonThreadLocal {
    static CountDownLatch countDownLatch = new CountDownLatch(100);
    static CountDownLatch countDownLatchCost = new CountDownLatch(100);

    public static void test(){
        try {
            System.out.println("threadName=" + Thread.currentThread().getName());
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        SingletonThreadLocal singletonThreadLocal = SingletonThreadLocal.instance();
        System.out.println("threadName=" + Thread.currentThread().getName() + "singletonThreadLocal = " + singletonThreadLocal);
    }
}
