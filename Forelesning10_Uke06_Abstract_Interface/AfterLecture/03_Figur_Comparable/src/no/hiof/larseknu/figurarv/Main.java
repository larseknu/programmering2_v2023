package no.hiof.larseknu.figurarv;


import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Rektangel rektangelet = new Rektangel(2, 8, "Grønn");

        Sirkel sirkelen = new Sirkel(3, "Rød");

        Kvadrat kvadratet = new Kvadrat(4, "Blå");

        Rektangel rektangelet2 = new Rektangel(1, 0.5, "Svart");

        System.out.println(sirkelen + " er " + sirkelen.getFarge());

        // Skriver ut en linje med * for å skille på utskriftene i terminalen
        System.out.println("\n*************Data i meter************");
        System.out.printf("%s sitt areal: %.2f og omkrets: %.2f%n", rektangelet, rektangelet.areal(), rektangelet.omkrets());
        System.out.printf("%s sitt areal i kvadratmeter: %.4f og omkrets i meter: %.2f%n", rektangelet, rektangelet.arealIMeter(), rektangelet.omkretsIMeter());

        System.out.println("\n*************Tegne figurer************");
        // Når Figur implementerte tegnbar, kunne vi tegne alle figurer
        rektangelet.tegn();
        sirkelen.tegn();
        kvadratet.tegn();


        ArrayList<Figur> figurListe = new ArrayList<>();
        figurListe.add(rektangelet);
        figurListe.add(sirkelen);
        figurListe.add(kvadratet);
        figurListe.add(rektangelet2);

        /*System.out.println("\n*************Tegnbare figurer (når bare Rektangel implementerer Tegnbar)************");
        for (Figur figur: figurListe) {
            if (figur instanceof Tegnbar tegnbarFigur)
                // tegnbarFigur-koden kan erstatte linjen med typecasting:
                // Tegnbar tegnbarFigur = (Tegnbar) figur;
                tegnbarFigur.tegn();
        }*/

        System.out.println("\n******Tilfeldig liste:*******");

        for (Figur figur : figurListe)
            System.out.println(String.format("Areal: %05.2f Omkrets: %05.2f  -  ", + (float)figur.areal(), (float)figur.omkrets()) + figur);

        Collections.sort(figurListe);

        System.out.println("\n******Sortert liste:*******");

        for (Figur figur : figurListe)
            System.out.println(String.format("Areal: %.2f Omkrets: %.2f  -  ", + figur.areal(), figur.omkrets()) + figur);


        System.out.println(kvadratet.compareTo(rektangelet));

    }
}
