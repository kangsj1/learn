package org.example.quartz;

import java.util.Random;

/**
 * @description
 * @author: shengjie.kang kangsj1@lenovo.com
 * @date: create in 2021/8/15
 * @modified by:
 */
public class Test {

    private static Random random = new Random(System.currentTimeMillis());

    public static void main(String[] args) {
        int i = random.nextInt(7000);
        System.out.println("i = " + i);
    }
}
