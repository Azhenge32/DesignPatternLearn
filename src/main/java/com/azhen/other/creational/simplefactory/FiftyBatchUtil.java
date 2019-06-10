package com.azhen.other.creational.simplefactory;

import java.util.List;
import java.util.function.Consumer;

public class FiftyBatchUtil extends BatchUtil {
    @Override
    public <T> void persist(List<T> list, Consumer<List<T>> consumer) {
        for (int i = 0; i < list.size(); i += 50) {
            consumer.accept(list.subList(i, i + 50));
        }
    }
}
