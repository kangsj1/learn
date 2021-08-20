package com.design.creator.factory;

import com.design.creator.factory.po.BlackPerson;
import com.design.creator.factory.po.WhitePerson;
import com.design.creator.factory.po.YellowPerson;

/**
 * 简单工厂,工厂方法，建立一个专门生产 Sample 实例的工厂:
 * 1.首先你要定义产品接口
 * 2.要有一个 factory 类，用来生成产品 Sample
 *
 */
public class SimpleFactory {

    public static Person createPerson(String name,Integer type){
        if(type == 1){
            YellowPerson yellowPerson = new YellowPerson();
            return yellowPerson;
        }else if(type == 2){
            BlackPerson blackPerson = new BlackPerson();
            return blackPerson;
        }else if(type == 3){
            WhitePerson whitePerson = new WhitePerson();
            return whitePerson;
        }else {
            return null;
        }
    }
}
