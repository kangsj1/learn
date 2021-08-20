package com.design.structure.adapter;

/**
 * @description
 * @author: shengjie.kang kangsj1@lenovo.com
 * @date: create in 2021/8/2
 * @modified by:
 */
public class PegAdapter extends SquarePeg{
    private RoundPeg roundPeg;
    public PegAdapter(RoundPeg peg){this.roundPeg=peg;}
    public void insert(String str){ roundPeg.insertIntoHole(str);}
}
