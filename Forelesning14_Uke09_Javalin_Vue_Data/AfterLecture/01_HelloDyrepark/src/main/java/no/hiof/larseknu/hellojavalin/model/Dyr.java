package no.hiof.larseknu.hellojavalin.model;

import java.time.LocalDate;

public abstract class Dyr implements Comparable<Dyr> {
    private String navn, art;
    private final int id;
    private LocalDate fodselsdag;
    private static int dyreTeller = 0;

    public Dyr(String navn, LocalDate fodselsdag) {
        this.navn = navn;
        this.fodselsdag = fodselsdag;
        this.id = 1000 + Dyr.dyreTeller;
        dyreTeller++;
    }

    @Override
    public int compareTo(Dyr dyret) {
        //return this.id - dyret.getId();
        return navn.compareTo(dyret.getNavn());
    }

    public String getArt() {
        return getClass().getSimpleName();
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public int getId() {
        return id;
    }

    public LocalDate getFodselsdag() {
        return fodselsdag;
    }

    public void setFodselsdag(LocalDate fodselsdag) {
        this.fodselsdag = fodselsdag;
    }

    @Override
    public String toString() {
        return id + " - " + navn;
    }
}
