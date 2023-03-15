package no.hiof.larseknu.json;

import java.time.LocalDate;

public class Character {
    private String name;
    private int level;
    private LocalDate created;

    public Character() {
    }

    public Character(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public Character(String name, int level, LocalDate created) {
        this.name = name;
        this.level = level;
        this.created = created;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public LocalDate getCreated() {
        return created;
    }

    public void setCreated(LocalDate created) {
        this.created = created;
    }
}
