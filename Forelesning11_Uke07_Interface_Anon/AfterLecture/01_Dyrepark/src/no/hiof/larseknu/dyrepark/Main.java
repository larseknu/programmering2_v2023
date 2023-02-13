package no.hiof.larseknu.dyrepark;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Dyrepark kristiansandDyrepark = new Dyrepark("Kristiansand Dyrepark");

        HonningGrevling honningGrevlingenNils = new HonningGrevling("Nils", LocalDate.of(2013, 3, 2));
        Sjimpanse sjimpansenArne = new Sjimpanse("Arne", LocalDate.of(2017, 3, 17), 60);
        Panda pandaenTrine = new Panda("Trine", LocalDate.of(2014, 4, 13), "Hvit");

        kristiansandDyrepark.leggTilEttDyrIDyreparken(sjimpansenArne);
        kristiansandDyrepark.leggTilEttDyrIDyreparken(pandaenTrine);
        kristiansandDyrepark.leggTilEttDyrIDyreparken(honningGrevlingenNils);

        for (int i = 0; i <= 5; i++)
            honningGrevlingenNils.drepteEnSlangeTil();

        sjimpansenArne.setIq(50);

        pandaenTrine.setKungFuBelteFarge("Gult");

        System.out.println(honningGrevlingenNils.getNavn() + " har drept " + honningGrevlingenNils.getAntallSlangerDrept() + " slanger");
        System.out.println(sjimpansenArne.getNavn() + " slo hodet, og ny IQ test viser en IQ på " + sjimpansenArne.getIq());
        System.out.println(pandaenTrine.getNavn() + " har gradert og har nå " + pandaenTrine.getKungFuBelteFarge() + " belte");


        // Innlagt rekkefølge:
        System.out.println("***********Dyr i innlagt rekkefølge************");
        ArrayList<Dyr> dyrIParken = kristiansandDyrepark.getDyrIDyreparken();
        printUtDyrIListe(dyrIParken);

        // Standard sortering
        System.out.println("*************Standardsortering (ID)***************");
        // Sorterer listen, bruker compareTo i Dyr, fordi vi implementerer interfacet Comparable
        Collections.sort(dyrIParken);
        printUtDyrIListe(dyrIParken);

        // Sortering på fødselsdato
        System.out.println("*************Sortert på fødselsdato***************");
        // Sorterer med vår egen klasse som implementerer Comparator for sortering
        dyrIParken.sort(new SortereDyrPaaFodselsdato());
        printUtDyrIListe(dyrIParken);
    }

    private static void printUtDyrIListe(ArrayList<Dyr> dyreListe) {
        for (Dyr etDyr : dyreListe) {
            System.out.println(etDyr + " - " + etDyr.getFodselsDato());
        }
    }
}
