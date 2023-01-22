package no.larseknu.hiof.flyoversikt;

/**
 * Representerer et fly
 */
public class Fly {
    // Instansvariabler
    private String modell;
    private int seter;
    private int passasjerer;

    /**
     * Konstruktør for klassen Fly
     * Gir mulighet til å sette modell og antall seter
     * Antall passasjerer blir satt til 0
     */
    public Fly (String modell, int seter) {
        this.modell = modell;
        this.seter = seter;
        this.passasjerer = 0;
    }

    /**
     * Konstruktør for klassen Fly
     * Gir mulighet til å sette modell, antall seter og antall passasjerer
     */
    public Fly (String modell, int seter, int passasjerer) {
        this.modell = modell;
        this.seter = seter;
        this.passasjerer = passasjerer;
    }

    /**
     * Metode for å legge til en passasjer hvis det er et sete ledig.
     * Er flyet fullt skrives en melding ut til terminalen.
     */
    public void leggTilEnPassasjer() {
        // Sjekker om antallet passasjerer er mindre enn antallet seter
        if (passasjerer < seter) {
            // Hvis det er mindre, legg til en passasjer
            passasjerer++;
        }
        else
            // Hvis det ikke er ledige seter, skriv ut melding
            System.out.println("Ingen ledige seter tilgjengelig");
    }

    public String getModell() {
        return modell;
    }

    public int getPassasjerer() {
        return passasjerer;
    }

    public int getSeter() {
        return seter;
    }
}
