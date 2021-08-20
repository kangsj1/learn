package com.design.creator.builder;

public class PojoDemo {
    private Integer id;
    private String name;

    public PojoDemo(){
    }

    public static void main(String[] args) {
        PojoDemo xxx = new PojoDemoBuilder()
                .setId(1)
                .setName("xxx")
                .build();

    }

    public static class PojoDemoBuilder{
        private PojoDemo pojoDemo = new PojoDemo();
        public PojoDemoBuilder setId(Integer id){
            pojoDemo.id= id;
            return this;
        }

        public PojoDemoBuilder setName(String name){
            pojoDemo.name = name;
            return this;
        }

        public PojoDemo build(){
            return pojoDemo;
        }
    }

}
