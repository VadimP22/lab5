package me.lab;

import java.util.Scanner;

/**
 * Создаёт MusicBand'ы
 */
public class MusicBandGenerator {
    int count = 0;
    Scanner scanner;
    private Boolean haveScanner = false;

    public void setScanner(Scanner s) {
        this.scanner = s;
        haveScanner = true;
    }

    public MusicBand generateMusicBand() {
        if (haveScanner == false) { throw new RuntimeException("You are stupid"); }

        String name;
        System.out.print("\nВведите имя\nname ->");
        name = scanner.nextLine();

        int x, y;
        System.out.print("\nВведите координаты\nx ->");
        y = Integer.parseInt(scanner.nextLine());
        System.out.print("y ->");
        y = Integer.parseInt(scanner.nextLine());
        


        System.out.print("\n новый MusicBand создан");
        return new MusicBand();
    }

    /* public MusicBand generateNewMusicBand() {


        //TODO
    } */

}