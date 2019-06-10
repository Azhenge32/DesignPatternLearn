package com.azhen.other.creational.factorymethod;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        BatchUtilsFactory factory = new FiftyBatchUtilFactory();
        BatchUtil util = factory.getUtil();
        if(util == null){
            return;
        }
        List<Integer> list = new ArrayList<Integer>();

        util.persist(list, null);
    }
}
