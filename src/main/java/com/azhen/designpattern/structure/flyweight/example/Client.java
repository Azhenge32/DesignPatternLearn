package com.azhen.designpattern.structure.flyweight.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//抽象享元角色类
interface ICustomerString {
    //外部状态以参数的形式通过此方法传入
    void opt(String state);
}
//具体享元角色类
class CustomerStringImpl implements ICustomerString {
    //负责为内部状态提供存储空间
    private Character mInnerState = null;

    public CustomerStringImpl(Character mInnerState) {
        this.mInnerState = mInnerState;
    }

    @Override
    public void opt(String state) {
        System.out.println("Inner state = "+this.mInnerState);
        System.out.println("Out state = "+state);
    }
}
//复合享元对象
class MultipleCustomerStringImpl implements ICustomerString {
    private Map<Character, ICustomerString> map = new HashMap<>();

    public void add(Character key, ICustomerString value) {
        map.put(key, value);
    }

    @Override
    public void opt(String state) {
        ICustomerString temp;
        for (Character obj : map.keySet()) {
            temp = map.get(obj);
            temp.opt(state);
        }
    }
}
//享元工厂角色类
class CustomerStringFactory {
    //一般而言，享元工厂对象在整个系统中只有一个，因此也可以使用单例模式
    private Map<Character, ICustomerString> map = new HashMap<>();
    //上例的单纯享元模式
    public ICustomerString factory(Character state) {
        ICustomerString cacheTemp = map.get(state);
        if (cacheTemp == null) {
            cacheTemp = new CustomerStringImpl(state);
            map.put(state, cacheTemp);
        }

        return cacheTemp;
    }
    //复合享元模式
    public ICustomerString factory(List<Character> states) {
        MultipleCustomerStringImpl impl = new MultipleCustomerStringImpl();
        for (Character state : states) {
            impl.add(state, this.factory(state));
        }

        return impl;
    }
}
//客户端
public class Client {
    public static void main(String[] args) {
        List<Character> states = new ArrayList<>();
        states.add('Y');
        states.add('A');
        states.add('N');
        states.add('B');
        states.add('O');

        states.add('Y');
        states.add('B');

        CustomerStringFactory factory = new CustomerStringFactory();
        ICustomerString customerString1 = factory.factory(states);
        ICustomerString customerString2 = factory.factory(states);
        customerString1.opt("Mutex object test!");
        System.out.println("---------------------------------");
        System.out.println("复合享元模式是否可以共享对象：" + (customerString1 == customerString2));

        Character state = 'a';
        ICustomerString fly1 = factory.factory(state);
        ICustomerString fly2 = factory.factory(state);
        System.out.println("单纯享元模式是否可以共享对象：" + (fly1 == fly2));
    }
}
