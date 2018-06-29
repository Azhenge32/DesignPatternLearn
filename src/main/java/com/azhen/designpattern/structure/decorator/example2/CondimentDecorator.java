package com.azhen.designpattern.structure.decorator.example2;

/**
 * 调味品抽象类
 */
public abstract class CondimentDecorator implements Drink {
    protected Drink decoratorDrink;
    public CondimentDecorator(Drink decoratorDrink) {
        this.decoratorDrink = decoratorDrink;
    }
    @Override
    public float cost() {
        return decoratorDrink.cost();
    }

    @Override
    public String getDescription() {
        return decoratorDrink.getDescription();
    }
}
