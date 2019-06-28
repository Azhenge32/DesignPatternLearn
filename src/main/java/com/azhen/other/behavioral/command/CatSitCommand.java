package com.azhen.other.behavioral.command;

public class CatSitCommand implements CatCommand{
    private Cat cat;

    public CatSitCommand(Cat cat) {
        this.cat = cat;
    }

    @Override
    public void execute() {
        cat.sit();
    }
}
