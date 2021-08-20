package com.design.structure.bridge;

/**
 *
 * Bridge 模式定义 :
 * 将抽象和行为划分开来,各自独立,但能动态的结合。
 * 任何事物对象都有抽象和行为之分，例如人，人是一种抽象，人分男人和女人等；人有行为，
 * 行为也有各种具体表现，所以，“人”与“人的行为”两个概念也反映了抽象和行为之分。
 * 在面向对象设计的基本概念中，对象这个概念实际是由属性和行为两个部分组成的，属性我
 * 们可以认为是一种静止的，是一种抽象，一般情况下，行为是包含在一个对象中，但是，在
 * 有的情况下，我们需要将这些行为也进行归类，形成一个总的行为接口，这就是桥模式的用
 *
 * Bridge 模式的执行类如 CoffeeImp 和 Coffee 是一对一的关系, 正确创建
 * CoffeeImp 是该模式的关键,
 *
 * Bridge 模式在 EJB 中的应用
 * EJB 中有一个 Data Access Object (DAO)模式,这是将商业逻辑和具体数据资源分开
 * 的,因为不同的数据库有不同的数据库操作.将操作不同数据库的行为独立抽象成一个行为
 * 接口 DAO.如下:
 * 1.Business Object (类似 Coffee)
 * 实现一些抽象的商业操作:如寻找一个用户下所有的订单
 * 涉及数据库操作都使用 DAOImplementor.
 * 2.Data Access Object (类似 CoffeeImp)
 * 一些抽象的对数据库资源操作
 * 3.DAOImplementor 如 OrderDAOCS, OrderDAOOracle, OrderDAOSybase(类似
 * MilkCoffeeImp FragrantCoffeeImp)
 * 具体的数据库操作,如"INSERT INTO "等语句,OrderDAOOracle 是 Oracle
 * OrderDAOSybase 是 Sybase 数据库.
 * 4.数据库 (Cloudscape, Oracle, or Sybase database via JDBC API)
 *
 */
public class Test {
    public static void main(String[] args) {
        //拿出牛奶
        CoffeeImpSingleton coffeeImpSingleton = new CoffeeImpSingleton(new
                MilkCoffeeImp());
        //中杯加奶
        MediumCoffee mediumCoffee = new MediumCoffee();
        mediumCoffee.pourCoffee();
        //大杯加奶
        SuperSizeCoffee superSizeCoffee = new SuperSizeCoffee();
        superSizeCoffee.pourCoffee();
    }
}
