package com.azhen.designpattern.structure.adapter.class1;

public class Client {
    public static void main(String[] args) {
        Ps3 p = new Adapter();
        p.isPs3();
    }
}
