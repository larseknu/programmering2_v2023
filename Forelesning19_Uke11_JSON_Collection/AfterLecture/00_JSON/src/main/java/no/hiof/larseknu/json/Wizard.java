package no.hiof.larseknu.json;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.ArrayList;

public class Wizard extends CharacterClass {
    private ArrayList<String> spells = new ArrayList<>();

    public Wizard() {
    }

    public Wizard(String name, String description, int dice) {
        super(name, description, dice);
    }

    public void addSpell(String spell) {
        spells.add(spell);
    }

    @JsonIgnore
    public String getSecretSpell() {
        return "Wish";
    }

    public ArrayList<String> getSpells() {
        return new ArrayList<>(spells);
    }

    public void setSpells(ArrayList<String> trylleformler) {
        this.spells = trylleformler;
    }


}
