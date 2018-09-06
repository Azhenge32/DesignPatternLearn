package com.azhen.refactoring.P6_method;

public class P80_InlineTemp {
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
