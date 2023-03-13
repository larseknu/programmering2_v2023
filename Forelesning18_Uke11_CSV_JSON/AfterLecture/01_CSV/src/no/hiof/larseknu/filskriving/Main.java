package no.hiof.larseknu.filskriving;

import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ArrayList<Superhero> superheroList = new ArrayList<>();

        superheroList.add(new Superhero("Superman", "Clark Kent"));
        superheroList.add(new Superhero("Hulk", "Bruce Banner"));
        superheroList.add(new Superhero("Batman", "Bruce Wayne"));
        superheroList.add(new Superhero("Wonder Woman", "Diana Prince"));

        writeToCSVFile(superheroList, "superheroes.csv");

        ArrayList<Superhero> superHeroesFromFile = readFromCSVFile(new File("superheroes.csv"));

        System.out.println(superHeroesFromFile);
    }

    private static ArrayList<Superhero> readFromCSVFile(File source) {
        ArrayList<Superhero> superheroesFromFile = new ArrayList<>();

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(source))) {
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                String[] parts = line.split(";");

                // Deler opp teksten på tegnet ";" -> dette resulterer i an array som heter parts
                // index 0 -> name
                // index 1 -> alterEgo
                String name = parts[0];
                String alterEgo = parts[1];
                Superhero superhero = new Superhero(name, alterEgo);

                superheroesFromFile.add(superhero);
            }

        } catch (FileNotFoundException fnfe) {
            System.err.println(fnfe.getMessage());
        } catch (IOException ioexc) {
            System.err.println(ioexc.getLocalizedMessage());
        }

        return superheroesFromFile;
    }

    private static void writeToCSVFile(List<Superhero> superheroList, String filepath) {
        // Logikk for å skrive superhelter til CSV-fil
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filepath))) {
            for (Superhero superhero : superheroList) {
                bufferedWriter.write(superhero.getName() + ";" + superhero.getAlterEgo());
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
