package com.azhen.other.creational.factorymethod;

import java.util.List;
import java.util.function.Consumer;

public class AsyncBatchUtil extends BatchUtil {
    @Override
    public <T> void persist(List<T> list, Consumer<List<T>> consumer) {

    }
}
