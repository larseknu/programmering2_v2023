package no.hiof.larseknu.dyrepark;

import java.util.ArrayList;

public class Dyrepark {
    private String navn;
    private ArrayList<Dyr> dyrIDyreparken = new ArrayList<>();

    public Dyrepark(String navn) {
        this.navn = navn;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public ArrayList<Dyr> getDyrIDyreparken() {
        return new ArrayList<>(dyrIDyreparken);
    }

    public void leggTilEttDyrIDyreparken(Dyr etDyr) {
        dyrIDyreparken.add(etDyr);
    }

    public void leggTilDyrIDyreparken(ArrayList<Dyr> dyrIDyreparken) {
        this.dyrIDyreparken.addAll(dyrIDyreparken);
    }
}
