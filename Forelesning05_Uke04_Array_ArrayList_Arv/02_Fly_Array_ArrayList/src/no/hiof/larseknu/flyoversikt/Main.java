package no.hiof.larseknu.flyoversikt;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Oppretter og initialiserer et flyobjekt med 130 seter
        Fly boing747 = new Fly("Boing-747", 130);
        Fly sr71 = new Fly("SR-71", 2);
        Fly airbusA380 = new Fly("Aibus A380", 525);


        Fly[] flyArray = new Fly[3];

        flyArray[0] = boing747;
        flyArray[1] = sr71;
        flyArray[2] = airbusA380;

        System.out.println("\nAlly flymodellene vi har tilgjengelig (array): ");
        for (int i = 0; i < flyArray.length; i++) {
            System.out.println(flyArray[i].getModell());
        }


        ArrayList<Fly> flyArrayList = new ArrayList<>();

        flyArrayList.add(airbusA380);
        flyArrayList.add(sr71);
        flyArrayList.add(boing747);

        System.out.println("\nAlly flymodellene vi har tilgjengelig (arraylist): ");
        for (int i = 0; i < flyArrayList.size(); i++) {
            System.out.println(flyArrayList.get(i).getModell());
        }

    }
}