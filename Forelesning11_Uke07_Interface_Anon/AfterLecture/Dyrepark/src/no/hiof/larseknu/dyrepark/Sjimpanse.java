package no.hiof.larseknu.dyrepark;

import java.time.LocalDate;

public class Sjimpanse extends Dyr{
    private int iq;

    public Sjimpanse(String navn, int iq) {
        super(navn);
        this.iq = iq;
    }

    public Sjimpanse(String navn, LocalDate fodselsDato, int iq) {
        super(navn, fodselsDato);
        this.iq = iq;
    }


    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

}
