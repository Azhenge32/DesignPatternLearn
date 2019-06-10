package com.azhen.other.creational.factorymethod;

public class TirtyBatchUtilFactory extends BatchUtilsFactory {
    @Override
    public BatchUtil getUtil() {
        return new TirtyBatchUtil();
    }
}
