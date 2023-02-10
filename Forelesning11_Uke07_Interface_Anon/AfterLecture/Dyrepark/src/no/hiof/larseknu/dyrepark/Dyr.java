package no.hiof.larseknu.dyrepark;

import java.time.LocalDate;

public abstract class Dyr implements Comparable<Dyr> {
    private int id;
    private String navn;
    private LocalDate fodselsDato;
    private static int dyreTeller;

    public Dyr(String navn) {
        this(navn, LocalDate.EPOCH);
    }

    public Dyr(String navn, LocalDate fodselsDato) {
        this.id = 1000 + dyreTeller++;
        this.navn = navn;
        this.fodselsDato = fodselsDato;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public LocalDate getFodselsDato() {
        return fodselsDato;
    }

    public void setFodselsDato(LocalDate fodselsDato) {
        this.fodselsDato = fodselsDato;
    }

    public static int getAntallDyr() {
        return dyreTeller;
    }

    /**
     * Overrider compareTo fra Comparable interfacet, slik at vi får en standardsortering
     */
    @Override
    public int compareTo(Dyr annetDyr) {
        return this.id - annetDyr.getId();
    }

    @Override
    public String toString() {
        return navn + " ID:" + id;
    }
}
