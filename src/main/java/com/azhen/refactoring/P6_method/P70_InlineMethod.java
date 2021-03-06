package com.azhen.refactoring.P6_method;

public class P70_InlineMethod {
    class One {
        int _numberOfLateDeliveries;
        int getRating() {
            return (moreThanFiveLateDeliveries()) ? 2 : 1;
        }

        boolean moreThanFiveLateDeliveries() {
            return  _numberOfLateDeliveries > 5;
        }
    }

    class Two {
        int _numberOfLateDeliveries;
        int getRating() {
            return ( _numberOfLateDeliveries > 5) ? 2 :1;
        }
    }
}
