package com.design.creator.factory;

import com.design.creator.factory.po.*;

/**
 * 工厂方法
 */
public class AnimalFactory {

    public Person createPerson(String name,Integer type){
        if(type==1){
            return new YellowPerson();
        }else if(type==2){
            return new BlackPerson();
        }else if(type==3){
            return new WhitePerson();
        }
        return null;
    }

    public Dog createDog(String name,Integer type){
        if(type==1){
            return new ChineseDog();
        }else if(type==2){
            return new AmericaDog();
        }
        return null;
    }

}
