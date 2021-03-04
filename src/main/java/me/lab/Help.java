package me.lab;

import java.util.HashMap;

public class Help implements Command {
    HashMap<String, String> manual = new HashMap<>();
    private String[] listOfWorkingCommands = {"help", "exit"};

    public Help() {
        manual.put("help", "help или help <command> вывести справку");
        manual.put("info", "вывести в стандартный поток вывода информацию о коллекции (тип, дата инициализации, количество элементов и т.д.)");
        manual.put("show", "вывести в стандартный поток вывода все элементы коллекции в строковом представлении");
        manual.put("exit", "завершить программу (без сохранения в файл)");
    }



    @Override
    public void execute(String[] args) {
        if (args.length == 1) {

            for(int i = 0; i < listOfWorkingCommands.length; i++) {
                String ref = listOfWorkingCommands[i] + ": " + manual.get(listOfWorkingCommands[i]);
                System.out.print(ref + "\n");
            } 

        }
        else {

            try {
                String ref = args[1] + ": " + manual.get(args[1]);
                System.out.print(ref);
            } catch (Exception e) {
                System.out.print("Command <" + args[1] + "> not exists");
            }
            
        }

    }
        // TODO Auto-generated method stub
        
    
}
