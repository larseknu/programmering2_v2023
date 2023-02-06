package no.hiof.larseknu.figurarv;

/**
 * Klasse som representerer en generisk figur
 */
public class Figur {

    public double areal() {
        return 0;
    }

    public double omkrets() {
        return 0;
    }

    /**
     * Metode for å sammenligne to figurer
     * Vi kan kalle den direkte med klassen, uten å instansiere ett objekt først, fordi den er statisk
     */
    public boolean erStorre(Figur annenFigur) {
        return this.areal() >= annenFigur.areal();
    }

    /**
     * Metode for å sammenligne to figurer
     * Denne er ikke statisk, så vi må ha en instans av Figur-klassen for å kunne kalle den
     */
    public static boolean erStorre(Figur figur1, Figur figur2) {
        return figur1.areal() >= figur2.areal();
    }


}
