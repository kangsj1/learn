package com.design.creator.singleton.test;

import com.design.creator.singleton.SingletonHungry;

import java.util.concurrent.CountDownLatch;

/**
 * 单例测试 100 个线程
 */
public class TestSingletonHungry {
    static CountDownLatch countDownLatch = new CountDownLatch(100);
    static CountDownLatch countDownLatchCost = new CountDownLatch(100);

    public static void test(){
        try {
            System.out.println("threadname"+Thread.currentThread().getName()+"await....");
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        SingletonHungry instance = SingletonHungry.instance();
        System.out.println("threadname="+Thread.currentThread().getName()+",instance = " + instance);
        countDownLatchCost.countDown();
    }

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(TestSingletonHungry::test);
            thread.start();
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
