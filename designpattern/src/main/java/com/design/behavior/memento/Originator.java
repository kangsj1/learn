package com.design.behavior.memento;

import java.io.File;

/**
 * Memento 备望录模式定义:
 * memento 是一个保存另外一个对象内部状态拷贝的对象.这样以后就可以将该对象恢复到
 * 原先保存的状态.
 *
 * 可见 Memento 中保存了 Originator 中的 number 和 file 的值. 通过调用
 * Originator 中 number 和 file 值改变的话,通过调用 setMemento()方法可以恢复.
 * Memento 模式的缺点是耗费大,如果内部状态很多,再保存一份,无意要浪费大量内存.
 * Memento 模式在 Jsp+Javabean 中的应用
 * 在 Jsp 应用中,我们通常有很多表单要求用户输入,比如用户注册,需要输入姓名和 Email
 * 等, 如果一些表项用户没有填写或者填写错误,我们希望在用户按"提交 Submit"后,通过
 * Jsp 程序检查,发现确实有未填写项目,则在该项目下红字显示警告或错误,同时,还要显示
 * 用户刚才已经输入的表项.
 *
 * @description
 * @author: shengjie.kang kangsj1@lenovo.com
 * @date: create in 2021/8/11
 * @modified by:
 */
public class Originator {
    private int number;
    private File file = null;
    public Originator(){}
    // 创建一个 Memento
    public Memento getMemento(){
        return new Memento(this);
    }
    // 恢复到原始值
    public void setMemento(Memento m){
        number = m.number;
        file = m.file;
    }

    private class Memento implements java.io.Serializable{
        private int number;
        private File file = null;
        public Memento( Originator o){
            number = o.number;
            file = o.file;
        }
    }

}

