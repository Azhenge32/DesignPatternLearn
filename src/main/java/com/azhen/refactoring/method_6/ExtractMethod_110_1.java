package com.azhen.refactoring.method_6;

/**
 * 将这段代码放进一个独立函数中，并让函数名称解释该函数的用途
 */
public class ExtractMethod_110_1 {
    class One {
        private String _name;
        void printOwing(double amount) {
            printBananer();

            // print details
            System.out.println("name:" + _name);
            System.out.println("amount:" + amount);
        }

        private void printBananer() {
        }
    }

    /**
     * 代码的语义化
     * 代码即注释
     */
    class Two {
        private String _name;
        void printOwing(double amount) {
            printBananer();

            // print details
            printDetails(amount);
        }

        private void printBananer() {
        }

        void printDetails(double amount) {
            System.out.println("name:" + _name);
            System.out.println("amount:" + amount);
        }
    }
}
