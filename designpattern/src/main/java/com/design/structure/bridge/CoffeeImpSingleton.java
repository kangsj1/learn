package com.design.structure.bridge;

public class CoffeeImpSingleton {
    private static CoffeeImp coffeeImp;

    public CoffeeImpSingleton(CoffeeImp coffeeImpIn) {
        this.coffeeImp = coffeeImpIn;
    }

    public static CoffeeImp getTheCoffeeImp() {
        return coffeeImp;
    }

}
