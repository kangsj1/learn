package com.design.behavior.interpreter;

/**
 * @description
 * @author: shengjie.kang kangsj1@lenovo.com
 * @date: create in 2021/8/11
 * @modified by:
 */
public class NonterminalExpression implements AbstractExpression{
    private AbstractExpression successor;

    public void setSuccessor( AbstractExpression successor ) {
        this.successor = successor;
    }
    public AbstractExpression getSuccessor() {
        return successor;
    }
    public void interpret( Context context ) { }
}
