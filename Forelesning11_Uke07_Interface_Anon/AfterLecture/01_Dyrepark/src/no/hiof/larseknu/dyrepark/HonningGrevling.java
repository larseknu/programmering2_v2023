package no.hiof.larseknu.dyrepark;

import java.time.LocalDate;

public class HonningGrevling extends Dyr {
    private static final int ANTALL_SLANGER_DREPT_FOR_AVLIVNING = 5;
    private int antallSlangerDrept;

    public HonningGrevling(String navn, LocalDate fodselsDato) {
        super(navn, fodselsDato);
        antallSlangerDrept = 0;
    }

    public int getAntallSlangerDrept() {
        return antallSlangerDrept;
    }

    public void drepteEnSlangeTil() {
        if (antallSlangerDrept < ANTALL_SLANGER_DREPT_FOR_AVLIVNING)
            antallSlangerDrept++;
        else
            System.out.println(super.getNavn() + " har drept " + antallSlangerDrept + " slanger og må avlives! :'(");
    }
}
