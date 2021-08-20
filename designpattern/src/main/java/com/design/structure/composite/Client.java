package com.design.structure.composite;

/**
 * Composite 模式定义:
 * 将对象以树形结构组织起来,以达成“部分－整体” 的层次结构，使得客户端对单个对象和
 * 组合对象的使用具有一致性.
 * Composite 比较容易理解，想到 Composite 就应该想到树形结构图。组合体内这些对象
 * 都有共同接口,当组合体一个对象的方法被调用执行时，Composite 将遍历(Iterator)
 * 整个树形结构,寻找同样包含这个方法的对象并实现调用执行。可以用牵一动百来形容。
 * 所以 Composite 模式使用到 Iterator 模式，和 Chain of Responsibility 模式类
 * 似。
 * Composite 好处:
 * 1.使客户端调用简单，客户端可以一致的使用组合结构或其中单个对象，用户就不必关系
 * 自己处理的是单个对象还是整个组合结构，这就简化了客户端代码。
 * 2.更容易在组合体内加入对象部件. 客户端不必因为加入了新的对象部件而更改代码
 */
public class Client {
    public static void main(String[] args) {
        Cabinet cabinet=new Cabinet("Tower");
        Chassis chassis=new Chassis("PC Chassis");
        //将 PC Chassis 装到 Tower 中 (将盘盒装到箱子里)
        cabinet.add(chassis);
        //将一个 10GB 的硬盘装到 PC Chassis (将硬盘装到盘盒里)
        chassis.add(new Disk("10 GB"));

        //调用 netPrice()方法;
        System.out.println("netPrice="+cabinet.netPrice());
        System.out.println("discountPrice="+cabinet.discountPrice());
        //上面调用的方法 netPrice()或 discountPrice()，实际上Composite 使用 Iterator
        //遍历了整个树形结构,寻找同样包含这个方法的对象并实现调用执行.
    }
}
