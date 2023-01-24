package no.hiof.larseknu.figurarv;

/**
 * Klasse som representerer en rektangel av typen Kvadrat
 */
public class Kvadrat extends Rektangel {
    private double side;

    /**
     * Kunstruktør som tar en side av kvadratet som parameter
     */
    public Kvadrat(double side) {
        // Kaller konstruktøren til superklassen (Rektangel)
        super(side, side);

        this.side = side;
    }

    /**
     * Metode for å skrive ut det vi mener er mest relevant om et kvadrat objekt
     */
    @Override
    public String toString() {
        return "Kvadrat med side " + side;
    }
}
