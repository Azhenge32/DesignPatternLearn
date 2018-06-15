package com.azhen.designpattern.construct.builder.example2;

public class Director {
    private Builder builder;
   public Director( Builder builder ) {
　　this.builder = builder;
　}
    public void construct() {
        builder.buildPartA();
        builder.buildPartB();
        builder.buildPartC();
    }
}
