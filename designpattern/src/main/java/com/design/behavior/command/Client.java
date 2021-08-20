package com.design.behavior.command;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @description
 * @author: shengjie.kang kangsj1@lenovo.com
 * @date: create in 2021/8/11
 * @modified by:
 */
public class Client {
    public static List produceRequests() {
        List queue = new ArrayList();
        queue.add( new DomesticEngineer() );
        queue.add( new Politician() );
        queue.add( new Programmer() );
        return queue;
    }

    public static void main(String[] args) {
        List queue = Client.produceRequests();
        for (Iterator it = queue.iterator(); it.hasNext(); )

        //客户端直接调用 execute 方法，无需知道被调用者的其它更多类的 方法名。
        ((Command)it.next()).execute();

    }
}
