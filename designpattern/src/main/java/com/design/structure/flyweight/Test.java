package com.design.structure.flyweight;

public class Test {
    public static void main(String[] args) {
        FlyweightFactory flyweightFactory = new FlyweightFactory();
        FlyWeight fred = flyweightFactory.getFlyweight("Fred");
        FlyWeight wilma = flyweightFactory.getFlyweight("Wilma");

    }
}
