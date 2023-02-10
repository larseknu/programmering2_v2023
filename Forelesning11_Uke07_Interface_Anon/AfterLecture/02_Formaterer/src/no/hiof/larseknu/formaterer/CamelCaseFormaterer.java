package no.hiof.larseknu.formaterer;

public class CamelCaseFormaterer implements Formaterer {

    @Override
    public String formaterTekst(String tekstSomSkalFormateres) {
        // Instansierer en StringBuilder, da vi skal jobbe med å sette sammen String
        // String-klassen er immutable, så hvis vi hadde benyttet den, hadde vi laget en ny String i minnet for hver operasjon
        StringBuilder stringBygger = new StringBuilder();

        // Splitter på mellomrom, og går gjennom hvert ord i teksten
        for (String ord : tekstSomSkalFormateres.split(" ")) {
            // Gjør den første bokstaven i orden til uppercase
            stringBygger.append(ord.substring(0,1).toUpperCase());
            // Gjør resten av ordet til lowercase
            stringBygger.append(ord.substring(1).toLowerCase());
            // Legger til et mellomrom etter ordet
            stringBygger.append(" ");
        }

        // Returnerer den sammensatte String'en
        return stringBygger.toString();
    }
}
