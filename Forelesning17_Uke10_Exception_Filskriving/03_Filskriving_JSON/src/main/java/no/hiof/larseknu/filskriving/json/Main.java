package no.hiof.larseknu.filskriving.json;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();

        // Konvertere Superhero-objekt til JSON og tilbake igjen
        try {
            String jsonText = objectMapper.writeValueAsString(new Superhero("Superman", "Clark Kent"));
            System.out.println("JSON objekt: " + jsonText);
            Superhero superman = objectMapper.readValue(jsonText, Superhero.class);
            System.out.println("Konvertert fra JSON: " + superman);

            ArrayList<Superhero> Superheroer = new ArrayList<>();
            Superheroer.add(new Superhero("Batman", "Bruce Wayne"));
            Superheroer.add(new Superhero("The Hulk", "Bruce Banner"));
            Superheroer.add(superman);

            // Skriver listen til JSON-fil
            skrivTilJSONFil(Superheroer, "superheroes.json");

            // Leser liste fra JSON-fil
            ArrayList<Superhero> SuperheroerFraJSONFil = lesFraJSONFil("superheroes.json");

            System.out.println("**********Liste lest fra fil**********");
            // Skriver ut Superheroer leste fra fil
            for (Superhero enHelt : SuperheroerFraJSONFil) {
                System.out.println(enHelt);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void skrivTilJSONFil(ArrayList<Superhero> superheroes, String path) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        objectMapper.writerWithDefaultPrettyPrinter().writeValue(new File(path), superheroes);
    }

    private static ArrayList<Superhero> lesFraJSONFil(String path) {
        ObjectMapper objectMapper = new ObjectMapper();

        ArrayList<Superhero> superheroListFromFile = new ArrayList<>();

        try {
            Superhero[] SuperheroArray = objectMapper.readValue(new File(path), Superhero[].class);

            superheroListFromFile.addAll(Arrays.asList(SuperheroArray));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return superheroListFromFile;
    }
}
