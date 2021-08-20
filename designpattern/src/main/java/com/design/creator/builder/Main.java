package com.design.creator.builder;

/**
 * 在 Java 实际使用中,我们经常用到"池"(Pool)的概念,当资源提供者无法提供足够的资
 * 源,并且这些资源需要被很多用户反复共享时,就需要使用池.
 * "池"实际是一段内存,当池中有一些复杂的资源的"断肢"(比如数据库的连接池,也许有时
 * 一个连接会中断),如果循环再利用这些"断肢",将提高内存使用效率,提高池的性能.修改
 * Builder 模式中 Director 类使之能诊断"断肢"断在哪个部件上,再修复这个部件.
 */
class Main {
    public static void main(String[] args) {
        ConcreteBuilder builder = new ConcreteBuilder();
        Director director = new Director( builder );
        director.construct();
        Product product = builder.build();
    }
}
