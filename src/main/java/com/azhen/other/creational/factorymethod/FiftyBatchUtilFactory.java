package com.azhen.other.creational.factorymethod;

public class FiftyBatchUtilFactory extends BatchUtilsFactory {
    @Override
    public BatchUtil getUtil() {
        return new FiftyBatchUtil();
    }
}
