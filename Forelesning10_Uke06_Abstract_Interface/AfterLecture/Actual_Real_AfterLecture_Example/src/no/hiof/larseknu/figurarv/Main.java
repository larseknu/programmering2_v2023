package no.hiof.larseknu.figurarv;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Rektangel rektangelet = new Rektangel(4, 5, "Grønn");
        Sirkel sirkelen = new Sirkel(3);
        Kvadrat kvadratet = new Kvadrat(4, "Rød");

        System.out.println(rektangelet.getFarge());

        // Skriver ut en linje med * for å skille på utskriftene i terminalen
        System.out.println("\n*************Data i meter************");
        System.out.printf("%s sitt areal: %.2f og omkrets: %.2f%n", rektangelet, rektangelet.areal(), rektangelet.omkrets());
        System.out.printf("%s sitt areal i kvadratmeter: %.4f og omkrets i meter: %.2f%n", rektangelet, rektangelet.arealIMeter(), rektangelet.omkretsIMeter());

        System.out.println("\n\n****Figurtegninger****");
        rektangelet.tegn();
        //sirkelen.tegn();
        kvadratet.tegn();


        ArrayList<Figur> figurListe = new ArrayList<>();
        figurListe.add(sirkelen);
        figurListe.add(rektangelet);
        figurListe.add(kvadratet);
        figurListe.add(new Rektangel(2, 8, "Svart"));

        System.out.println(figurListe);

        Collections.sort(figurListe);

        System.out.println(figurListe);
    }
}
