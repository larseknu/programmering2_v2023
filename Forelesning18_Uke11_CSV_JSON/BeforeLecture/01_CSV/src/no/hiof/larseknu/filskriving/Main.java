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
