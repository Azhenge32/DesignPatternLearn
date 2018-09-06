package com.azhen.refactoring.P8_data.ChangeReferencetoValue.two;

import java.util.HashMap;
import java.util.Map;

public class Currency {
    private String code;
    public String getCode() {
        return code;
    }
    private Currency(String code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Currency currency = (Currency) o;

        return code != null ? code.equals(currency.code) : currency.code == null;
    }

    @Override
    public int hashCode() {
        return code != null ? code.hashCode() : 0;
    }
}
