package me.lab;

import java.util.LinkedList;



public class Debug implements Command {

    private MusicBandGenerator generator;
    LinkedList ll;

    public Debug(MusicBandGenerator gen, LinkedList ll) {
        generator = gen;
        this.ll = ll;
    }

    @Override
    public void execute(String[] args) {
        if (args.length == 1) {
            System.out.print("\nпишите help debug");
            return;
        } else {
            if (args[1].equals("new")) {
                System.out.print("new MusicBand generation");
                MusicBand mb = generator.generateMusicBand();
            } else if (args[1].equals("add")) {
                System.out.print("new MusicBand addition to LinkedList");
                MusicBand mb = generator.generateMusicBand();
                ll.add(mb);
            }
        }
        // TODO Auto-generated method stub
        
    }
}
