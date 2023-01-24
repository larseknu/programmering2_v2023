package no.hiof.larseknu.figurarv;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Oppretter og instansierer et rektangelobjekt
        Rektangel rektangelet = new Rektangel(4, 5);

        // Oppretter og instansierer et sirkelobjekt
        Sirkel sirkelen = new Sirkel(3);

        // Oppretter og instansierer et kvadratobjekt
        Kvadrat kvadratet = new Kvadrat(5);

        // Oppretter et rektangelobjekt, instansierer den som et kvadrat
        // Dette er lov, fordi Kvadrat arver fra Rektangel (alle kvadrater er et rektangel)
        Rektangel rektangel2 = new Kvadrat(4);

        // Dette er ikke lov, da Rektangel ikke arver fra Kvadrat (et rektangel er ikke en kvadrat)
        // Kvadrat kvadrat2 = new Rektangel(2,3);



        // Skriver ut en linje med * for å skille på utskriftene i terminalen
        System.out.println("\n*************Vanlig utskrift fra objekter************");

        // Skriver ut informasjon om figurene vi har laget
        // Først figuren selv (toString blir benyttet i "bakgrunnen"), så areal og omkrets
        System.out.println(rektangelet + "    Areal: "+ rektangelet.areal() + "     Omkrets: " + rektangelet.omkrets());
        System.out.println(sirkelen + "    Areal: "+ sirkelen.areal() + "     Omkrets: " + sirkelen.omkrets());
        System.out.println(kvadratet + "    Areal: "+ kvadratet.areal() + "     Omkrets: " + kvadratet.omkrets());
        System.out.println(rektangel2 + "    Areal: "+ rektangel2.areal() + "     Omkrets: " + rektangel2.omkrets());



        // Skriver ut en linje med * for å skille på utskriftene i terminalen
        System.out.println("\n*************Hvilken er størst?************");
        if ( erStorre(rektangelet, kvadratet) ) {
            System.out.println(rektangelet + " er størst");
        }
        else {
            System.out.println(kvadratet + " er størst");
        }



        // Skriver ut en linje med * for å skille på utskriftene i terminalen
        System.out.println("\n*************Utskrift fra Array************");

        // Lager en array som kan fylles med figurobjekter, plass til 4 stykker
        Figur[] figurArray = new Figur[4];

        // Legger til objekter som arver fra klassen figur
        figurArray[0] = rektangelet;
        figurArray[1] = sirkelen;
        figurArray[2] = kvadratet;
        figurArray[3] = rektangel2;

        // Lager en løkke som kjører like mange ganger som lengden til figurArray
        for (int i = 0; i < figurArray.length; i++) {
            System.out.println(figurArray[i]);
        }


        // Initialiserer en array med inter, med 12 tall som representerer månedene
        // Gir verdier til alle elementene i arrayet med en gang
        int[] maaneder = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };



        // Skriver ut en linje med * for å skille på utskriftene i terminalen
        System.out.println("\n*************Utskrift fra ArrayList************");

        // Oppretter og instansierer et ArrayList-objekt som skal inneholde figurer
        ArrayList<Figur> figurArrayList = new ArrayList<>();

        // Legger til figurobjekter til arraylisten
        figurArrayList.add(rektangelet);
        figurArrayList.add(sirkelen);
        figurArrayList.add(kvadratet);
        figurArrayList.add(rektangel2);

        // Går gjennom listen ved hjelp an foreach og skriver ut informasjon om figuren
        for (Figur enFigur : figurArrayList) {
            System.out.println(enFigur);

            // Undersøker om figuren er av instans Sirkel
            if (enFigur instanceof Sirkel) {
                // Hvis den er det, typecaster vi den til et Sirkel-objekt for å få tilgang til metoder
                Sirkel enSirkel = (Sirkel)enFigur;
                // Benytter beregnDiameter metoden vi nå har tilgjengelig og skriver den ut
                System.out.println("Sirkelens diameter er: " + enSirkel.beregnDiameter());
            }

        }


        // Skriver ut en linje med * for å skille på utskriftene i terminalen
        System.out.println("\n*************Slutt på utskrifter************");

        // Lager en string med nummeret 42
        String meningenMedLivet = "42";
        // Benytter parseInt metoden i klassen Integer til å konvertere fra String til int
        int bareEtTall = Integer.parseInt(meningenMedLivet);


        // Lager int med timeLonn
        int timeLonn = 150;
        // Gjør en implicit typecast til en double
        double faktiskTimeLonn = timeLonn;


        // Lager en double med alder
        double alder = 8.5;
        // Gjør en explicit typecast til int
        int ordentligAlder = (int) alder;
    }

    public static boolean erStorre(Figur figur1, Figur figur2) {
        return figur1.areal() > figur2.areal();
    }
}
