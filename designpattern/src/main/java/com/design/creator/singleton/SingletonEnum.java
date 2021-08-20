package com.design.creator.singleton;

/**
 * 枚举实现，通过枚举访求实现类的唯一
 */
public enum SingletonEnum {
    INSTANCE("001","实例");

    private String code;
    private String name;

    SingletonEnum(String code,String name){
        this.code = code;
        this.name = name;
    }
}
