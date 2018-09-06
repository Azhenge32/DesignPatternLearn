package com.azhen.refactoring.P8_data.ReplaceSubclasswithFields.two;

public class Person {
    private final boolean isMale;
    private final char code;

    private Person(boolean isMale, char code) {
        this.isMale = isMale;
        this.code = code;
    }

    static Person createMale() {
        return new Person(true, 'M');
    }
    static Person createFemale() {
        return new Person(false, 'F');
    }
}
