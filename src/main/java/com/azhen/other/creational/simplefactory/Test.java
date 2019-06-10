package com.azhen.other.creational.simplefactory;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        BatchUtilsFactory factory = new BatchUtilsFactory();
        BatchUtil util = factory.getUtil(FiftyBatchUtil.class);
        if(util == null){
            return;
        }
        List<Integer> list = new ArrayList<Integer>();

        util.persist(list, null);
    }
}
