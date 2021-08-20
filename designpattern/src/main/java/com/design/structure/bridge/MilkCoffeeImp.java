package com.design.structure.bridge;

public class MilkCoffeeImp extends CoffeeImp{
    MilkCoffeeImp() {}
    @Override
    public void pourCoffeeImp() {
        System.out.println("加了美味的牛奶");
    }
}
