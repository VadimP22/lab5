package me.lab;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        CommandProcessor commandProcessor = new CommandProcessor();
        registerCommands(commandProcessor);

        Scanner scanner = new Scanner(System.in);

        System.out.println();

        while (true) {
            System.out.print("\n->");
            String scannedLine = scanner.nextLine();
            try {
                commandProcessor.execute(scannedLine);
            } catch (Exception e) {
                System.out.print(e.getMessage());
            }
        }


    }


    public static void registerCommands(CommandProcessor commandProcessor)
    {
        Exit exit = new Exit();
        commandProcessor.register("exit", exit);
    }


}
