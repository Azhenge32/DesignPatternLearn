package com.azhen.refactoring.method_6;

/**
 * 防止变量责任过重
 */
public class SplitTemporaryVariable {
    class One {
        double _height;
        double _width;
        public void  getResult() {
            double temp = 2 * (_height + _width);
            System.out.println(temp);
            temp = _height * _width;
            System.out.println(temp);
        }
    }

    class Two {
        double _height;
        double _width;
        public void  getResult() {
            final double length = 2 * (_height + _width);
            System.out.println(length);
            final double area  = _height * _width;
            System.out.println(area);
        }
    }
}
