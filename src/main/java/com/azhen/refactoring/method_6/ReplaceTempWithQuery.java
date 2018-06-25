package com.azhen.refactoring.method_6;

public class ReplaceTempWithQuery {
    class One {
        double _quantity;
        double _itemPrice;
        public double  getResult() {
            double basePrice = _quantity * _itemPrice;
            if (basePrice > 1000) {
                return basePrice * 0.95;
            } else {
                return basePrice * 0.98;
            }
        }
    }

    class Two {
        double _quantity;
        double _itemPrice;
        public double  getResult() {
            if (basePrice() > 1000) {
                return basePrice() * 0.95;
            } else {
                return basePrice() * 0.98;
            }
        }

        double basePrice() {
            return  _quantity * _itemPrice;
        }
    }
}
