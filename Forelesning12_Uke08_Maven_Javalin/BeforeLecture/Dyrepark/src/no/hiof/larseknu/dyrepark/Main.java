package no.hiof.larseknu.dyrepark;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

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
        System.out.println(dyreneIKristiansand);

        Collections.sort(dyreneIKristiansand);

        System.out.println("**********MED sortering**********");
        System.out.println(dyreneIKristiansand);
    }

}
