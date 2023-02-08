package no.hiof.larseknu.figurarv;

/**
 * Klasse som representerer en generisk figur
 */
public abstract class Figur implements Tegnbar, Comparable<Figur> {
    private String farge;
    private static final int CM_TIL_METER = 100;

    public Figur(String farge) {
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

    public String getFarge() {
        return farge;
    }

    public void setFarge(String farge) {
        this.farge = farge;
    }

    @Override
    public int compareTo(Figur annenFigur) {
        /*
        // METODE 1:
        // Sjekker hvilken figur som er størt ved hjelp av rekke if-else spørringer
        if (this.areal() > annenFigur.areal())
            return 1;
        else if (this.areal() < annenFigur.areal())
            return -1;
        else {
            if (this.omkrets() > annenFigur.omkrets())
                return 1;
            else if (this.omkrets() < annenFigur.omkrets())
                return -1;
            else
                return 0;
        }
        */

        // METODE 2:
        // Finner ut hvilket areal som er størst (NB: når vi konverterer fra double til int her, mister vi noe nøyaktighet)
        // Positiv verdi - denne(this) figuren er størst
        // Negativ verdi - sammenLigningsFigur er størst
        // 0 - de er like store
        /*int returVerdi = (int)(this.areal() - annenFigur.areal());

        // Hvis returVerdi er 0, har de like stort areal, sammenligner derfor omkrets
        if (returVerdi == 0)
            // Finner ut hvilken omkrets som er størst (eller om de er like)
            returVerdi = (int)(this.omkrets() - annenFigur.omkrets());

        return returVerdi;*/

        // METODE 3:
        // Samme som over, men bruker Double sin innebygde sammenligning, og unngår konvertering med tap av nøyaktighet
        int returVerdi = Double.compare(this.areal(), annenFigur.areal());

        if (returVerdi == 0)
            returVerdi = Double.compare(this.omkrets(), annenFigur.omkrets());

        return returVerdi;
    }
}
