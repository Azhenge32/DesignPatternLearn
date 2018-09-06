package com.azhen.refactoring.P6_method;

import java.util.ArrayList;
import java.util.List;

public class P10_RemoveAssignmentsToParameters {
    class BadOne {
        void discount(int inputVal, int quantity, int yearToDate) {
            if (inputVal > 50) {
                inputVal = -2;
            }
        }

        void add(List<String> list) {
            list = new ArrayList<>();
        }
    }

    class GoodOne {
        void discount(int inputVal, int quantity, int yearToDate) {
            int result = inputVal;
            if (inputVal > 50) {
                result = -2;
            }
        }

        void add(List<String> list) {
            list.add("111");
        }
    }
}
