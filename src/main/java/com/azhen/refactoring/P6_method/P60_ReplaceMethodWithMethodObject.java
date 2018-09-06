package com.azhen.refactoring.P6_method;

/**
 * 将这个函数放进一个单独对象中，如此一来局部变量就成了对象内的值域（field）
 * 然后你可以在同一个对象中将这个大型函数分解为数个小型函数，而不需要进行参数传递
 */
public class P60_ReplaceMethodWithMethodObject {
    class ReplaceMethodWithObject {

        /***
         * 在函数中有大量的临时变量，提取方法的时比较乱
         */
        public int gamma(int inputVal,int quantity,int yearToDate){
            int importantValue1 = (inputVal * quantity)+100;
            int importantValue2 = (inputVal * yearToDate)+100;
            if((yearToDate-importantValue1)>100){
                importantValue2-=20;
            }
            int importantValue3 = importantValue2 * 7;
            return importantValue3 - 2*importantValue1;
        }

        public int gammaRepair(int inputVal,int quantity,int yearToDate){
            return new RepMethodObject(inputVal,quantity,yearToDate).gamma();
        }
    }

    class RepMethodObject {

        private int inputVal;
        private int quantity;
        private int yearToDate;
        private int importantValue1;
        private int importantValue2;

        public RepMethodObject(int inputVal, int quantity, int yearToDate) {
            this.inputVal = inputVal;
            this.quantity = quantity;
            this.yearToDate = yearToDate;
        }

        public int gamma() {
            importantValue1 = (inputVal * quantity) + 100;
            importantValue2 = (inputVal * yearToDate) + 100;
            if ((yearToDate - importantValue1) > 100) {
                importantValue2 -= 20;
            }
            int importantValue3 = importantValue2 * 7;
            return importantValue3 - 2 * importantValue1;
        }
    }
}
