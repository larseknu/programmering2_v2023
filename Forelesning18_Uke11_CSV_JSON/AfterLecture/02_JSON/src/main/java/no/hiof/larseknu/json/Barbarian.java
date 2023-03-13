package no.hiof.larseknu.json;

public class Barbarian extends CharacterClass {
    private int rages;

    public Barbarian() {
    }

    public Barbarian(String name, String description, int dice, int rages) {
        super(name, description, dice);
        this.rages = rages;
    }

    public void useRage() {
        rages--;
    }

    public int getRages() {
        return rages;
    }

    public void setRages(int rages) {
        this.rages = rages;
    }
}
