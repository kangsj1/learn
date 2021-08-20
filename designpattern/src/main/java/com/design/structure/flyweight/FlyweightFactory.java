package com.design.structure.flyweight;

import java.util.Hashtable;

public class FlyweightFactory {

    private Hashtable flyweights = new Hashtable();

    public FlyWeight getFlyweight(Object key) {
        FlyWeight flyweight = (FlyWeight) flyweights.get(key);
        if (flyweight == null) {
            //产生新的 ConcreteFlyweight
            flyweight = new ConcreteFlyweight();
            flyweights.put(key, flyweight);
        }
        return flyweight;
    }
}
