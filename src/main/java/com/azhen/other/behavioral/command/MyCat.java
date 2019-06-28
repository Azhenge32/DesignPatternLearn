package com.azhen.other.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class MyCat {
    private List<CatCommand> commandList = new ArrayList<>();
    public void addCommand(CatCommand command) {
        commandList.add(command);
    }

    public void executeCommands() {
        for (CatCommand command : commandList) {
            command.execute();
        }
        commandList.clear();
    }
}
