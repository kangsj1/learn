package com.design.structure.bridge;

public class SuperSizeCoffee extends Coffee{

    public SuperSizeCoffee() {setCoffeeImp();}

    @Override
    public void pourCoffee() {
        CoffeeImp coffeeImp = this.getCoffeeImp();
        //我们以重复次数来说明是冲中杯还是大杯 ,重复 5 次是大杯
        for (int i = 0; i < 5; i++)
        {
            coffeeImp.pourCoffeeImp();
        }
    }
}
