package com.azhen.other.creational.factorymethod;

import java.util.List;
import java.util.function.Consumer;

public abstract class BatchUtil {
    public abstract  <T> void persist(List<T> list, Consumer<List<T>> consumer);
}
