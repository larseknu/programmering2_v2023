package no.hiof.larseknu.hellojavalin.model;

import java.time.LocalDate;

public class Sjimpanse extends Dyr {
    private int iq;

    public Sjimpanse(String navn, LocalDate fodselsdag, int iq) {
        super(navn, fodselsdag);
        this.iq = iq;
    }

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }
}
