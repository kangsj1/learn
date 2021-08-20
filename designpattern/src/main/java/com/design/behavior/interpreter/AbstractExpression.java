package com.design.behavior.interpreter;

/**
 * Interpreter 解释器模式定义:
 * 定义语言的文法 ,并且建立一个解释器来解释该语言中的句子.
 * Interpreter 似乎使用面不是很广,它描述了一个语言解释器是如何构成的,在实际应用
 * 中,我们可能很少去构造一个语言的文法.我们还是来简单的了解一下:
 * 首先要建立一个接口,用来描述共同的操作.
 *
 * @description
 * @author: shengjie.kang kangsj1@lenovo.com
 * @date: create in 2021/8/11
 * @modified by:
 */
public interface AbstractExpression {
    void interpret( Context context );
}
