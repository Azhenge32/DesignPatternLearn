package com.azhen.other.behavioral.command;

public class CatEatCommand implements CatCommand{
    private Cat cat;

    public CatEatCommand(Cat cat) {
        this.cat = cat;
    }

    @Override
    public void execute() {
        cat.eat();
    }
}
