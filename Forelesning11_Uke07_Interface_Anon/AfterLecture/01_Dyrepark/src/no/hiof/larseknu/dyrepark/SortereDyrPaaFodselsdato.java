package no.hiof.larseknu.dyrepark;

import java.util.Comparator;

public class SortereDyrPaaFodselsdato implements Comparator<Dyr> {
    @Override
    public int compare(Dyr dyr1, Dyr dyr2) {
        return (int) (dyr1.getFodselsDato().toEpochDay() - dyr2.getFodselsDato().toEpochDay());
    }
}
