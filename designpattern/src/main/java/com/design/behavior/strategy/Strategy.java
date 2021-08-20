package com.design.behavior.strategy;

/**
 *
 * Strategy 策略模式是属于设计模式中 对象行为型模式,主要是定义一系列的算法,把这
 * 些算法一个个封装成单独的类.
 * Stratrgy 应用比较广泛,比如, 公司经营业务变化图, 可能有两种实现方式,一个是线条
 * 曲线,一个是框图(bar),这是两种算法,可以使用 Strategy 实现.
 * 这里以字符串替代为例, 有一个文件,我们需要读取后,希望替代其中相应的变量,然后输
 * 出.关于替代其中变量的方法可能有多种方法,这取决于用户的要求,所以我们要准备几套
 * 变量字符替代方案.
 *
 * 实际整个 Strategy 的核心部分就是抽象类的使用,使用 Strategy 模式可以在用户需要
 * 变化时,修改量很少,而且快速.
 * Strategy和Factory有一定的类似,Strategy相对简单容易理解,并且可以在运行时刻
 * 自由切换。Factory 重点是用来创建对象。
 * Strategy 适合下列场合:
 * 1.以不同的格式保存文件;
 * 2.以不同的算法压缩文件;
 * 3.以不同的算法截获图象;
 * 4.以不同的格式输出同样数据的图形,比如曲线 或框图 bar
 * @description
 * @author: shengjie.kang kangsj1@lenovo.com
 * @date: create in 2021/8/11
 * @modified by:
 */
public interface Strategy {
}
