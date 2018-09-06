package com.azhen.refactoring.P8_data.ChangeReferencetoValue.one;

import java.util.HashMap;
import java.util.Map;

public class Currency {
    private static Map<String, Currency> instances = new HashMap<>();
    private String code;
    public String getCode() {
        return code;
    }

    public static Currency get(String code) {
        return instances.get(code);
    }

    private Currency(String code) {
        this.code = code;
    }
}
