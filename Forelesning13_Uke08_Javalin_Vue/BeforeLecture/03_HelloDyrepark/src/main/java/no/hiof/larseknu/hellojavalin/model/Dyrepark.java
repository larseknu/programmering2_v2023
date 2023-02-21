package no.hiof.larseknu.hellojavalin.model;

import java.util.ArrayList;

public class Dyrepark {
    private String navn;
    private ArrayList<Dyr> dyreListe;

    public Dyrepark(String navn) {
        this.navn = navn;
        dyreListe = new ArrayList<>();
    }

    public void leggTilDyrIDyrepark(Dyr dyret) {
        dyreListe.add(dyret);
    }

    public ArrayList<Dyr> getDyreListe() {
        return new ArrayList<>(dyreListe);
    }
}
