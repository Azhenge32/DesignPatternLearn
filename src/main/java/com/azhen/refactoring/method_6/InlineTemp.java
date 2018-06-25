package com.azhen.refactoring.method_6;

public class InlineTemp {
    class One {
        double basePrice() {
            return 3.4;
        }

        boolean test() {
            double basePrice = basePrice();
            return (basePrice > 1000);
        }
    }

    class Two {
        double basePrice() {
            return 3.4;
        }

        boolean test() {
            return (basePrice() > 1000);
        }
    }
}
