package no.hiof.larseknu.json;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
        use = JsonTypeInfo.Id.NAME,
        property = "type")
@JsonSubTypes({
        @JsonSubTypes.Type(value = Wizard.class, name = "wizard"),
        @JsonSubTypes.Type(value = Barbarian.class, name = "barbarian")
})
public abstract class CharacterClass {
    private String name, description;
    public int dice;

    public CharacterClass() {
    }

    public CharacterClass(String name, String description, int dice) {
        this.name = name;
        this.description = description;
        this.dice = dice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDice() {
        return dice;
    }

    public void setDice(int dice) {
        this.dice = dice;
    }
}
