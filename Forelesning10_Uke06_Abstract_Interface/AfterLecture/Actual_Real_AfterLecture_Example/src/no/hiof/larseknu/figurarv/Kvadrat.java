package no.hiof.larseknu.figurarv;

public class Kvadrat extends Rektangel {
    private double side;

    public Kvadrat(double side, String farge) {
        // Kaller konstruktøren til superklassen (Rektangel)
        super(side, side, farge);

        this.side = side;
    }

    @Override
    public String toString() {
        return "Kvadrat med side " + side;
    }
}
