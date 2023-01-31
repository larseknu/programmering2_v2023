package no.hiof.larseknu.flyoversikt;

public class Transportfly extends Fly {
    private double bruktLast;
    private double maksLast;

    public Transportfly() {
        maksLast = 10000;
    }

    public Transportfly(String modell, int seter, double maksLast) {
        // Kaller konstruktøren til super-klassen Fly
        super(modell, seter);
        this.maksLast = maksLast;
    }

    public void leggTilEnPakke(double hoyde, double bredde, double dybde) {
        // Regner ut størrelsen på pakken i kubikkmeter
        double storrelse = hoyde * bredde * dybde;

        // Undersøker om det er plass til pakken på flyet
        if ( harLedigLagringsPlass(storrelse) )
            bruktLast += storrelse;
        else
            System.out.println("Du vil overskride makslast");
    }

    private boolean harLedigLagringsPlass(double storrelse) {
        return bruktLast + storrelse <= maksLast;
    }

    public double getBruktLast() {
        return bruktLast;
    }

    public double getMaksLast() {
        return maksLast;
    }

}
