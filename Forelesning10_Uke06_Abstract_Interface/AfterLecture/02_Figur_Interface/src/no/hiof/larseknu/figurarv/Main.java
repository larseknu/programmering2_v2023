package no.hiof.larseknu.figurarv;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Rektangel rektangelet = new Rektangel(4, 5, "Grønn");
        Sirkel sirkelen = new Sirkel(3, "Rød");
        Kvadrat kvaratet = new Kvadrat(5, "Blå");

        System.out.println(sirkelen + " er " + sirkelen.getFarge());

        // Skriver ut en linje med * for å skille på utskriftene i terminalen
        System.out.println("\n*************Data i meter************");
        System.out.printf("%s sitt areal: %.2f og omkrets: %.2f%n", rektangelet, rektangelet.areal(), rektangelet.omkrets());
        System.out.printf("%s sitt areal i kvadratmeter: %.4f og omkrets i meter: %.2f%n", rektangelet, rektangelet.arealIMeter(), rektangelet.omkretsIMeter());

        System.out.println("\n*************Tegne figurer************");
        // Når Figur implementerte tegnbar, kunne vi tegne alle figurer
        rektangelet.tegn();
        sirkelen.tegn();
        kvaratet.tegn();

        /*System.out.println("\n*************Tegnbare figurer (når bare Rektangel implementerer Tegnbar)************");
        ArrayList<Figur> figurListe = new ArrayList<>();
        figurListe.add(rektangelet);
        figurListe.add(sirkelen);
        figurListe.add(kvaratet);

        for (Figur figur: figurListe) {
            if (figur instanceof Tegnbar tegnbarFigur)
                // tegnbarFigur-koden kan erstatte linjen med typecasting:
                // Tegnbar tegnbarFigur = (Tegnbar) figur;
                tegnbarFigur.tegn();
        }*/

    }
}
