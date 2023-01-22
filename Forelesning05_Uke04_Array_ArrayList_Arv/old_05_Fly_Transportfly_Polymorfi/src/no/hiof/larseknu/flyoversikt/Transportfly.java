package no.hiof.larseknu.flyoversikt;

/**
 * Representerer et Transportfly, arver fra klassen Fly
 */
public class Transportfly extends Fly {
    private double bruktLast;
    private double maksLast;

    /**
     * Tom konstruktør
     * Setter makslast til 10000 kubikkmeter
     */
    public Transportfly() {
        maksLast = 10000;
    }

    /**
     * Konstruktør for klassen Transportfly
     * Gir mulighet til å sette modell, antall seter og maksLast i kubikkmeter
     */
    public Transportfly(String modell, int seter, double maksLast) {
        // Kaller konstruktøren til super-klassen Fly
        super(modell, seter);
        this.maksLast = maksLast;
    }


    /**
     * Metode for å legge til en pakke på flyet
     * Tar dimensjonene til en pakke i hoyde, bredde og dybde i meter
     * Oppdaterer bruktLast hvis det er plass på flyet
     * Skriver en melding til terminalen hvis det ikke er plass
     */
    public void leggTilEnPakke(double hoyde, double bredde, double dybde) {
        // Regner ut størrelsen på pakken i kubikkmeter
        double storrelse = hoyde * bredde * dybde;

        // Undersøker om det er plass til pakken på flyet
        if ( harLedigLagringsPlass(storrelse) )
            bruktLast += storrelse;
        else
            System.out.println("Du vil overskride makslast");
    }

    /**
     * Metode som tar storrelse på en pakke i kvm
     * Returnerer true/false om det er plass til pakken eller ikke
     */
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
