package me.lab;

import java.time.ZonedDateTime;
import java.time.zone.ZoneRulesProvider;
import java.util.Scanner;
import java.util.function.ToLongFunction;

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

        int id = count;

        String name;
        System.out.print("\nВведите имя\nname ->");
        name = scanner.nextLine();

        int x, y;
        System.out.print("\nВведите координаты\nx ->");
        y = Integer.parseInt(scanner.nextLine());
        System.out.print("y ->");
        y = Integer.parseInt(scanner.nextLine());
        
        ZonedDateTime zTime = ZonedDateTime.now();

        long numberOfParticipants = 1;

        Long albumsCount = Integer.toUnsignedLong(1);

        String description = null;

        MusicGenre mg;
        System.out.print("\nВведите жанр(MATH_ROCK, POST_PUNK, BRIT_POP)\n");
        System.out.print("genre ->");
        String str = scanner.nextLine();
        if (str.equals("MATH_ROCK")) {
            mg = MusicGenre.MATH_ROCK;
        } else if (str.equals("POST_PUNK")) {
            mg = MusicGenre.POST_PUNK;
        } else if (str.equals("BRIT_POP")) {
            mg = MusicGenre.BRIT_POP;
        }

        
        Long sales = Integer.toUnsignedLong(1);

        System.out.print("\n новый MusicBand создан");
        count = count + 1;
        return new MusicBand();
    }

    /* public MusicBand generateNewMusicBand() {


        //TODO
    } */

}