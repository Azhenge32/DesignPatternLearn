package com.azhen.other.creational.factorymethod;

import java.util.List;
import java.util.function.Consumer;

public class TirtyBatchUtil extends BatchUtil {
    @Override
    public <T> void persist(List<T> list, Consumer<List<T>> consumer) {
        for (int i = 0; i < list.size(); i += 30) {
            consumer.accept(list.subList(i, i + 30));
        }
    }
}
