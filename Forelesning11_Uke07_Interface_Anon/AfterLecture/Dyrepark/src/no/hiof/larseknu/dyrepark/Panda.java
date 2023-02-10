package no.hiof.larseknu.dyrepark;

import java.time.LocalDate;

public class Panda extends Dyr {
    private String kungFuBelteFarge;

    public Panda(String navn, LocalDate fodselsdag, String kungFuBelteFarge) {
        super(navn, fodselsdag);
        this.kungFuBelteFarge = kungFuBelteFarge;
    }

    public String getKungFuBelteFarge() {
        return kungFuBelteFarge;
    }

    public void setKungFuBelteFarge(String kungFuBelteFarge) {
        this.kungFuBelteFarge = kungFuBelteFarge;
    }
}
