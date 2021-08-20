package com.design.structure.composite;

/**
 * 盘盒 Chassis
 * 盘盒里面可以放一些小设备，如硬盘
 * 软驱等。无疑这两个都是属于组合体性质的
 */
public class Chassis extends CompositeEquipment {
    public Chassis(String name) {
        super(name);
    }

    public double netPrice() {
        return
                1. + super.netPrice();
    }

    public double discountPrice() {
        return .5 + super.discountPrice();
    }
}

