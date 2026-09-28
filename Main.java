package BrawlStars;

import java.util.ArrayList;

public class Main {

    public static ArrayList<Brawler> brawlers;


    public static void main(String[] args) {
        Legendario leon = new Legendario("León", 8000);
        Legendario spike = new Legendario("Spike", 10000);

        Mitico tara = new Mitico("Tara", 7000);
        Mitico genio = new Mitico("Genio", 4000);

        Epico bo = new Epico("Bo", 6500);
        Epico mortis = new Epico("Mortis", 3000);

        Raro brawler = new Raro("Brawler", 2500);
        Raro colt = new Raro("Colt", 2000);

        brawlers = new ArrayList<>();
        brawlers.add(leon);
        brawlers.add(spike);
        brawlers.add(tara);
        brawlers.add(genio);
        brawlers.add(bo);
        brawlers.add(mortis);
        brawlers.add(brawler);
        brawlers.add(colt);

        System.out.println("=== DISPARANDO ===");
        for(Brawler b : brawlers){
            b.disparar();
        }

        System.out.println("\n=== MOVIENDO ===");
        for(Brawler b : brawlers){
            b.mover();
        }

    }


}
