package com.design.structure.flyweight;

public class Artist {

    private String name;
    // note that Artist is immutable.
    String getName(){return name;}
    Artist(String n){
        name = n;
    }
}
