package me.lab;

import java.util.HashMap;

public class CommandProcessor {
    private HashMap<String, Command> commandsMap = new HashMap<>();
    
    public void register(String keyword, Command command) {
        commandsMap.put(keyword, command);
    }

    public void execute(String userInput) {
        String[] parsed = parse(userInput);
        String userCommand = parsed[0];
        Command command = commandsMap.get(userCommand);
        if (command == null) {
            throw new RuntimeException("Command <" + userCommand + "> not exists");
        }

        command.execute(parsed);
    }

    public String[] parse(String inp) {
        return inp.split("\\s");
    } 
}
