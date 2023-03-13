package no.hiof.larseknu.json;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;

public class Character {
    private String name;
    private CharacterClass characterClass;
    private int level;
    private LocalDate created;

    public Character() {
    }

    public Character(String name, CharacterClass characterClass, int level, LocalDate created) {
        this.name = name;
        this.characterClass = characterClass;
        this.level = level;
        this.created = created;
    }

    @JsonProperty("navn")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CharacterClass getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(CharacterClass characterClass) {
        this.characterClass = characterClass;
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

    @Override
    public String toString() {
        return characterClass.getName() + " -  " + name + " - level " + level;
    }
}
