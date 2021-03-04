package me.lab;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Main class
 * @author Petrov Vadim
 * 
 */
public class App 
{

    public static LinkedList<MusicBand> bands = new LinkedList<>();
    public static MusicBandGenerator bandGenerator = new MusicBandGenerator();

    public static void main( String[] args )
    {
        CommandProcessor commandProcessor = new CommandProcessor();

        Scanner scanner = new Scanner(System.in);
        bandGenerator.setScanner(scanner);
        registerCommands(commandProcessor);

        

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

        Help help = new Help();
        commandProcessor.register("help", help);

        Debug debug = new Debug(bandGenerator, bands);
        commandProcessor.register("debug", debug);
    }


}
