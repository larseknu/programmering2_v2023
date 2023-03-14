package no.hiof.larseknu.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Wizard wizard = new Wizard("Divination Wizard", "A magic user who sees the future", 6);
        wizard.addSpell("Fireball");
        wizard.addSpell("Prestidigitation");

        Barbarian barbarian = new Barbarian("Berserker Barbarian", "Hits stuff", 12, 3);

        Character saeris = new Character("Saeris", wizard, 13, LocalDate.of(2016, 3, 3));
        Character trok = new Character("Trok", barbarian, 10, LocalDate.of(2016, 3, 3));


        testJson(saeris);



        ArrayList<Character> characters = new ArrayList<>();
        characters.add(saeris);
        characters.add(trok);



        writeToJson("characters.json", characters);

        List<Character> nyListe = readFromJson("characters.json");
        System.out.println("*****LEST FRA FIL******");
        System.out.println(nyListe);

    }

    public static void writeToJson(String filename, List<Character> characters) {
        try {
            File file = new File(filename);
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.registerModule(new JavaTimeModule());

            objectMapper.writerWithDefaultPrettyPrinter().writeValue(file, characters);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Character> readFromJson(String filename) {
        List<Character> characters = new ArrayList<>();

        try {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.registerModule(new JavaTimeModule());

            Character[] karakterArray = objectMapper.readValue(new File(filename), Character[].class);

            characters = Arrays.asList(karakterArray);
        } catch (IOException e) {
            e.printStackTrace(System.out);
        }

        return characters;
    }

    public static void testJson(Character character) {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());

        try {
            objectMapper.writerWithDefaultPrettyPrinter();
            String jsonOfCharacter = objectMapper.writeValueAsString(character);


            System.out.println(jsonOfCharacter);

            Character characterFromJson = objectMapper.readValue(jsonOfCharacter, Character.class);

            System.out.println(characterFromJson);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

}
