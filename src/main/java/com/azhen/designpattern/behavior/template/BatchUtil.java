package com.azhen.designpattern.behavior.template;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.StreamSupport;

public class BatchUtil {
    private static final Integer STEP = 50;
    private static final Integer FACTOR = 10;
    public static <T> void batchPersist(List<T> list, Consumer<List<T>> consumer) {
        serialPersist(list, consumer, STEP);
    }

    public static <T> void serialPersist(List<T> list, Consumer<List<T>> repositoryConsumer, int step) {
        int fromIndex = 0;
        int size = list.size();
        while (fromIndex < size) {
            int toIndex = fromIndex + step;
            if (toIndex >= size) {
                toIndex = size;
            }
            if (fromIndex != toIndex) {
                repositoryConsumer.accept(list.subList(fromIndex, toIndex));
            }
            fromIndex += step;
        }
    }
}
