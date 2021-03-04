package me.lab;

public class Exit implements Command {
    @Override
    public void execute(String[] args) {
        System.exit(0);
    }
}
