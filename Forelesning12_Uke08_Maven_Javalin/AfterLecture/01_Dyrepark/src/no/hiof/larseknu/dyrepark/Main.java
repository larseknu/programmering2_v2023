package no.hiof.larseknu.dyrepark;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        HonningGrevling honningGrevlingenNils = new HonningGrevling("Nils", LocalDate.of(2017, 6, 20));
        Panda pandaenTurid = new Panda("Turid", LocalDate.now(), "Hvit");
        Sjimpanse sjimpansenArne = new Sjimpanse("Arne", LocalDate.of(2020, 1, 1), 60);

        System.out.println(honningGrevlingenNils + " har spist  " + honningGrevlingenNils.getAntallSlangerSpist() + " slanger");
        System.out.println(pandaenTurid + " har beltet " + pandaenTurid.getKungFuBelteFarge()  );
        System.out.println(sjimpansenArne + " har en iq på " + sjimpansenArne.getIq());

        sjimpansenArne.setIq(50);

        System.out.println(sjimpansenArne + " slo hodet og har nå en iq på " + sjimpansenArne.getIq());

        Dyrepark kristiansandDyrepark = new Dyrepark("Kristiansand Dyrepark");
        kristiansandDyrepark.leggTilDyrIDyrepark(honningGrevlingenNils);
        kristiansandDyrepark.leggTilDyrIDyrepark(sjimpansenArne);
        kristiansandDyrepark.leggTilDyrIDyrepark(pandaenTurid);

        ArrayList<Dyr> dyreneIKristiansand = kristiansandDyrepark.getDyreListe();
        System.out.println("**********Uten sortering**********");
        printDyrIListe(dyreneIKristiansand);

        Collections.sort(dyreneIKristiansand);

        System.out.println("\n**********MED sortering**********");
        printDyrIListe(dyreneIKristiansand);

        System.out.println("\n**********Sortering Fødselsdag**********");
        //Collections.sort(dyreneIKristiansand, new SortereDyrPaaFodselsdato());
        // Denne vil gjøre det samme som linjen over
        dyreneIKristiansand.sort(new SortereDyrPaaFodselsdato());
        printDyrIListe(dyreneIKristiansand);


        System.out.println("\n**********Sortering Navn**********");
        dyreneIKristiansand.sort(new Comparator<Dyr>() {
            @Override
            public int compare(Dyr dyr1, Dyr dyr2) {
                return dyr1.getNavn().compareTo(dyr2.getNavn());
            }
        });
        printDyrIListe(dyreneIKristiansand);
    }

    private static void printDyrIListe(ArrayList<Dyr> dyreListe) {
        for (Dyr etDyr : dyreListe) {
            System.out.println(etDyr + " - " + etDyr.getFodselsdag());
        }
    }

}
