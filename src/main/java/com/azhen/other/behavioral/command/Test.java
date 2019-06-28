package com.azhen.other.behavioral.command;

public class Test {
    public static void main(String[] args) {
        Cat cat = new Cat("白白");
        CatSitCommand sitCommand = new CatSitCommand(cat);
        CatEatCommand eatCommand = new CatEatCommand(cat);

        MyCat myCat = new MyCat();
        myCat.addCommand(sitCommand);
        myCat.addCommand(eatCommand);
        myCat.executeCommands();
    }
}
