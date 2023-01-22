package no.hiof.larseknu.flyoversikt;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Oppretter og initialiserer et flyobjekt med 130 seter
        Fly boing747 = new Fly("Boing-747", 130);
        Fly sr71 = new Fly("SR-71", 2);
        Fly airbusA380 = new Fly("Aibus A380", 525);

        // Legger til noen passasjerer
        boing747.leggTilEnPassasjer();
        boing747.leggTilEnPassasjer();
        boing747.leggTilEnPassasjer();
        boing747.leggTilEnPassasjer();
        boing747.leggTilEnPassasjer();
        boing747.leggTilEnPassasjer();

        // Skriver ut info om boeing747 via toString()
        System.out.println(boing747.toString());

        // Lager et transportfly med 15 seter og en makslast på 10000.0 kubikkmeter
        Transportfly an225 = new Transportfly("AN-225", 15, 10000);

        // Legger til en pakke
        an225.leggTilEnPakke(5, 5, 5);

        // Skriver ut info om an225 via toString() (vil gi oss det samme som om vi kalte an225.toString() direkte)
        System.out.println(an225);
    }
}