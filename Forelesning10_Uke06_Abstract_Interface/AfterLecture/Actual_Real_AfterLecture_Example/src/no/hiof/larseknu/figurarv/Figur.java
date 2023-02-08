package no.hiof.larseknu.figurarv;

/**
 * Klasse som representerer en generisk figur
 */
public abstract class Figur implements Comparable<Figur> {
    private String farge;
    private static final int CM_TIL_METER = 100;

    public Figur() {
        farge = "Blå";
    }

    public Figur(String farge) {
        this.farge = farge;
    }

    public String getFarge() {
        return farge;
    }

    public void setFarge(String farge) {
        this.farge = farge;
    }

    public abstract double areal();

    public abstract double omkrets();

    public final double arealIMeter() {
        return areal() / Math.pow(CM_TIL_METER, 2);
    }

    public final double omkretsIMeter() {
        return omkrets() / CM_TIL_METER;
    }

    /**
     * Metode for å sammenligne to figurer
     * Vi kan kalle den direkte med klassen, uten å instansiere ett objekt først, fordi den er statisk
     */
    @Override
    public int compareTo(Figur annenFigur) {
        return (int)(this.areal() - annenFigur.areal());
    }

    /**
     * Metode for å sammenligne to figurer
     * Denne er ikke statisk, så vi må ha en instans av Figur-klassen for å kunne kalle den
     */
    public static boolean erStorre(Figur figur1, Figur figur2) {
        return figur1.areal() >= figur2.areal();
    }


}
