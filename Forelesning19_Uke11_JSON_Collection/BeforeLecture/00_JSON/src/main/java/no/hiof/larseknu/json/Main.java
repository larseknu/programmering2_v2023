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
        Character saeris = new Character("Saeris", 13, LocalDate.of(2016, 3, 3));
        Character trok = new Character("Trok", 10, LocalDate.of(2016, 3, 3));
        Character scanlan = new Character("Scanlan", 20, LocalDate.of(2014, 1, 1));

        ArrayList<Character> characters = new ArrayList<>();
        characters.add(saeris);
        characters.add(trok);
        characters.add(scanlan);

        writeToJson(characters, "characters.json");

        List<Character> charactersFromJson = readFromJson("characters.json");

        for (Character character : charactersFromJson) {
            System.out.println(character.getName() + " - " + character.getLevel());
        }
    }

    public static List<Character> readFromJson(String filepath) {
        ObjectMapper objectMapper = new ObjectMapper();

        try {
            objectMapper.registerModule(new JavaTimeModule());
            Character[] characterArray = objectMapper.readValue(new File(filepath), Character[].class);

            return Arrays.asList(characterArray);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return new ArrayList<>();
    }

    public static void writeToJson(ArrayList<Character> characters, String filepath) {
        ObjectMapper objectMapper = new ObjectMapper();

        File file = new File(filepath);
        try {
            objectMapper.registerModule(new JavaTimeModule());
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(file, characters);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




    private static void testJson(Character dndCharacter) {
        ObjectMapper objectMapper = new ObjectMapper();

        try {

            String jsonString = objectMapper.writeValueAsString(dndCharacter);

            System.out.println("******JSON OF CHARACTER-OBJECT******");
            System.out.println(jsonString);

            System.out.println("******CHARACTER-OBJECT FROM JSON******");
            Character readFromJson = objectMapper.readValue(jsonString, Character.class);
            System.out.println(readFromJson.getName() + " - " + readFromJson.getLevel());

        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }


    }
}
