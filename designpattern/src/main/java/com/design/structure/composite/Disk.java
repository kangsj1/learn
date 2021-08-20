package com.design.structure.composite;


public class Disk extends Equipment{
    public Disk(String name) { super(name); }

    @Override
    public double netPrice() {
        return 1.;
    }

    @Override
    public double discountPrice() {
        return .5;
    }
}
