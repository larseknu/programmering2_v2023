package no.hiof.larseknu.hellojavalin.model;

import java.util.Comparator;

public class SortereDyrPaaFodselsdato implements Comparator<Dyr> {
    @Override
    public int compare(Dyr dyr1, Dyr dyr2) {
        return (int) (dyr1.getFodselsdag().toEpochDay() - dyr2.getFodselsdag().toEpochDay());
        //return dyr1.getFodselsdag().compareTo(dyr2.getFodselsdag());
    }
}
