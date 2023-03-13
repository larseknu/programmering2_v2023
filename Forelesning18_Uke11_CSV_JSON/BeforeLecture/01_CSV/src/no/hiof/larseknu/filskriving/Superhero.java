package no.hiof.larseknu.filskriving;

public class Superhero {
    private String name, alterEgo;

    public Superhero(String name, String alterEgo) {
        this.name = name;
        this.alterEgo = alterEgo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlterEgo() {
        return alterEgo;
    }

    public void setAlterEgo(String alterEgo) {
        this.alterEgo = alterEgo;
    }

    @Override
    public String toString() {
        return name + " has the alter ego " + alterEgo;
    }
}
