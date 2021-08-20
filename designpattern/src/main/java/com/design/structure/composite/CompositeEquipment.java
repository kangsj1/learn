package com.design.structure.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class CompositeEquipment extends Equipment{

    private int i=0;
    //定义一个 Vector 用来存放'儿子'
    private List equipment=new ArrayList();

    public CompositeEquipment(String name) {
        super(name);
    }

    @Override
    public boolean add(Equipment equipment) {
        return this.equipment.add(equipment);
    }

    @Override
    public boolean remove(Equipment equipment) {
        return this.equipment.remove(equipment);
    }

    @Override
    public Iterator iter() {
        return this.equipment.iterator();
    }

    @Override
    public double netPrice() {
        double netPrice=0.;
        Iterator iter=equipment.iterator();
        for(;iter.hasNext();){
            netPrice+=((Equipment)iter.next()).netPrice();
        }
        return netPrice;
    }

    @Override
    public double discountPrice() {
        double discountPrice=0.;
        Iterator iter=equipment.iterator();
        while (iter.hasNext())
            discountPrice+=((Equipment)iter.next()).discountPrice();
        return discountPrice;
    }
}
