package com.design.creator.singleton.test;

import com.design.creator.singleton.SingletonLazy03;

import java.util.concurrent.CountDownLatch;

/**
 * 测试双重检查锁
 */
public class TestSingleton03 {
    static CountDownLatch countDownLatch = new CountDownLatch(100);
    static CountDownLatch countDownLatchCost = new CountDownLatch(100);

    public static void test(){
        try {
            System.out.println("threadName=" + Thread.currentThread().getName() +"await.....");
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        SingletonLazy03 singletonLazy03 = SingletonLazy03.instance();
        System.out.println("threadName=" + Thread.currentThread().getName() +",singletonLazy03 = " + singletonLazy03);
        countDownLatchCost.countDown();
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            Thread th = new Thread(TestSingleton03::test);
            th.start();
            countDownLatch.countDown();
        }
        try {
            countDownLatchCost.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();
        System.out.println("costTime = " + (end-start) + "ms");
    }
}
