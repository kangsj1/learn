package org.example.timer;

import java.util.Arrays;

/**
 * @description
 * @author: shengjie.kang kangsj1@lenovo.com
 * @date: create in 2021/8/5
 * @modified by:
 */
public class TestFixUp {
    static Integer[] queue = new Integer[10];

    public static void main(String[] args) {
        queue[0] = 1;
        queue[1] = 0;
        queue[2] = 3;
        queue[3] = 1;
        fixUp(1);
        System.out.println("Arrays.toString(queue) = " + Arrays.toString(queue));
    }

    private static void fixUp(int k) {
        while (k > 1) {
            int j = k >> 1;
            if (queue[j] <= queue[k])
                break;
            Integer tmp = queue[j];  queue[j] = queue[k]; queue[k] = tmp;
            k = j;
        }
    }
}
