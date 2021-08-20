package com.design.structure.composite;

/**
 * 箱子 Cabinet
 * 箱子里面可以放很多东西，如底板，电源盒，硬盘盒等；
 */
public class Cabinet extends CompositeEquipment {
    public Cabinet(String name) {
        super(name);
    }

    public double netPrice() {
        return 1. + super.netPrice();
    }

    public double discountPrice() {
        return .5 + super.discountPrice();
    }
}
