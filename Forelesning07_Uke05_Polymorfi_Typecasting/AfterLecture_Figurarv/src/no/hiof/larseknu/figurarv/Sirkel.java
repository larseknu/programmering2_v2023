package no.hiof.larseknu.figurarv;

/**
 * Klasse som representerer en figur av typen Sirkel
 */
public class Sirkel extends Figur {
    // Instansvariabel
    private double radius;

    /**
     * Konstruktør som tar radius som parameter
     */
    public Sirkel(double radius) {
        this.radius = radius;
    }

    /**
     * Metode for å regne ut areal
     * Overrider denne fra figur og lager vår egen implementasjon som passer for sirkel
     */
    @Override
    public double areal() {
        return Math.PI * radius * radius;
    }

    /**
     * Metode for å regne ut omkrets
     * Overrider denne fra figur og lager vår egen implementasjon som passer for sirkel
     */
    @Override
    public double omkrets() {
        return 2 * Math.PI * radius;
    }

    /**
     * Metode for å skrive ut det vi mener er mest relevant om et sirkel objekt
     * Overrider denne fra Object-klassen (som alle klasser arver fra)
     */
    @Override
    public String toString() {
        return "Sirkel med radius " + radius;
    }

    /**
     * Metode for å regne ut sirkelens diameter
     * @return
     */
    public double beregnDiameter() {
        return 2 * radius;
    }
}
