package no.hiof.larseknu.filskriver;

import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Superhero> superheroes = new ArrayList<>();

        superheroes.add(new Superhero("Superman", "Clark Kent"));
        superheroes.add(new Superhero("Hulk", "Bruce Banner"));
        superheroes.add(new Superhero("Batman", "Bruce Wayne"));
        superheroes.add(new Superhero("Wonder Woman", "Diana Prince"));

        File source = new File("superhero_register.csv");

        //skrivTilCSVFil(superheroes, source);

        // Leser ut fra filen og legger det i en ny liste
        ArrayList<Superhero> superHeroesFromFile = readFromCSVFile(source);

        // Skriver ut den nye listen som er laget basert på innholdet i filen
        System.out.println(superHeroesFromFile);
    }

    private static ArrayList<Superhero> readFromCSVFile(File source) {
        ArrayList<Superhero> superheroesFromFile = new ArrayList<>();


        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(source))) {
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                String[] parts = line.split(";");

                // Deler opp teksten på tegnet ";" -> dette resulterer i an array som heter deler
                // index 0 -> name
                // index 1 -> alterEgo
                Superhero superhero = new Superhero(parts[0], parts[1]);

                superheroesFromFile.add(superhero);
            }

        } catch (FileNotFoundException fnfe) {
            // Skriver ut feilmelding om filen ikke finnes
            System.err.println(fnfe.getMessage());
        } catch (IOException ioexc) {
            // skriver ut feilmelding om det oppstår feil ved lesing fra fil
            System.err.println(ioexc.getLocalizedMessage());
        }

        return superheroesFromFile;
    }

    private static void skrivTilCSVFil(ArrayList<Superhero> superhelter, File filSomSkrivesTil) {
        try (BufferedWriter bufretSkriver = new BufferedWriter(new FileWriter(filSomSkrivesTil))) {
            // Går igjennom alle superhelter i superheltlisten
            for(Superhero enSuperhelt: superhelter) {
                // Skriver fornavn og alterego til filen avskilt med ";"
                bufretSkriver.write( enSuperhelt.getName() + ";" + enSuperhelt.getAlterEgo() );
                // Skriver et linjeskift
                bufretSkriver.newLine();
            }
        } catch (FileNotFoundException fnfe) {
            // Skriver ut feilmelding om filen ikke finnes
            System.err.println(fnfe.getMessage());
        } catch (IOException ioexc) {
            // skriver ut feilmelding om det oppstår feil ved skriving til fil
            System.err.println(ioexc.getLocalizedMessage());
        }

    }
}
