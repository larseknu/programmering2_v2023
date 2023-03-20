import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<String> dyreNavnArrayList = new ArrayList<>();
        dyreNavnArrayList.add("HonningGrevling(Nils)");
        dyreNavnArrayList.add("Panda(Trine)");
        dyreNavnArrayList.add("Sjimpanse(Arne)");
        dyreNavnArrayList.add("Katt(Misti)");
        dyreNavnArrayList.add("Hund(Dent)");

        System.out.println(dyreNavnArrayList);

        List<String> dyreNavnLinkedList = new LinkedList<>();
        dyreNavnLinkedList.add("HonningGrevling(Nils)");
        dyreNavnLinkedList.add("Panda(Trine)");
        dyreNavnLinkedList.add("Sjimpanse(Arne)");
        dyreNavnLinkedList.add("Katt(Misti)");
        dyreNavnLinkedList.add("Hund(Dent)");

        System.out.println(dyreNavnLinkedList);

        ArrayList<Integer> tallArrayListe = new ArrayList<>();
        LinkedList<Integer> tallLinkedListe = new LinkedList<>();

        System.out.println("\n**************ADDING DATA***********************");
        // Legger til 1000000 elementer i slutten av en ArrayListe
        addNumbersToEndArrayList(tallArrayListe, 1000000);
        // Legger til 1000000 elementer i slutten av en LinkedListe
        addNumbersToEndLinkedList(tallLinkedListe, 1000000);

        // Legger til 10000 elementer i begynnelsen av en ArrayListe
        addNumbersToBeginningArrayList(tallArrayListe, 10000);
        // Legger til 10000 elementer i begynnelsen av en LinkedListe
        addNumbersToBeginningOfLinkedList(tallLinkedListe, 10000);

        // Legger til 1000 elementer i midten av en ArrayList med 1010000 fra før
        addNumbersToMiddleList(tallArrayListe, 1000);
        // Legger til 1000 elementer i midten av en LinkedList med 1010000 fra før
        addNumbersToMiddleList(tallLinkedListe, 1000);

        // Legger til 1000 elementer tilfeldig ArrayList
        addNumbersToRandomPlaces(tallArrayListe, 1000);
        // Legger til 1000 elementer tilfeldig LinkedList
        addNumbersToRandomPlaces(tallLinkedListe, 1000);


        System.out.println("\n**************GETTING DATA***********************");
        // Get elements in beginning of ArrayList
        getNumbersToBeginningArrayList(tallArrayListe, 1000000000);
        // Get elements in beginning of LinkedList
        getNumbersToBeginningOfLinkedList(tallLinkedListe, 1000000000);
        // Get elements in middle of ArrayList
        getNumbersInMiddleList(tallArrayListe, 1000);
        // Get elements in middle of LinkedList
        getNumbersInMiddleList(tallLinkedListe, 1000);
        // Get elements in end of ArrayList
        getNumbersToEndArrayList(tallArrayListe, 1000000000);
        // Get elements in end of LinkedList
        getNumbersToEndLinkedList(tallLinkedListe, 1000000000);

        /*
        // KONKLUSJON: 	vi benytter ArrayList når vi i hovedsak legger til elementer mot slutten av listen
        // 				vi benytter LinkedList når vi i hovedsak legger til elementer mot starten av listen
        // 				vi benytter LinkedList når vi legger til elementer både mot start og slutt
        //              vi benytter ArrayList når vi legger til elementer mot midten
        */
    }

    private static void addNumbersToBeginningOfLinkedList(LinkedList<Integer> list, int numberOfInserts) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i <= numberOfInserts; i++) {
            list.addFirst(i);
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Adding " + numberOfInserts + " elements to beginning" +
                " of a "+ list.getClass().getSimpleName() +
                ": " + (endTime - startTime) + " ms");
    }

    private static void addNumbersToBeginningArrayList(ArrayList<Integer> list, int numberOfInserts) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i <= numberOfInserts; i++) {
            list.add(0, i);

        }

        long endTime = System.currentTimeMillis();

        System.out.println("Adding " + numberOfInserts + " elements to beginning" +
                " of a "+ list.getClass().getSimpleName() +
                ": " + (endTime - startTime) + " ms");
    }

    private static void addNumbersToEndArrayList(ArrayList<Integer> list, int numberOfInserts) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i <= numberOfInserts; i++) {
            list.add(i);
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Adding " + numberOfInserts + " elements to the end" +
                " of a "+ list.getClass().getSimpleName() +
                ": " + (endTime - startTime) + " ms");
    }

    private static void addNumbersToEndLinkedList(LinkedList<Integer> list, int numberOfInserts) {
        long startTime = System.currentTimeMillis();

        for (int i = 0; i <= numberOfInserts; i++) {
            list.addLast(i);
        }

        long endTime = System.currentTimeMillis();

        // Skriver ut tiden vi brukte
        System.out.println("Adding " + numberOfInserts + " elements to the end" +
                " of a "+ list.getClass().getSimpleName() +
                ": " + (endTime - startTime) + " ms");
    }

    private static void addNumbersToMiddleList(List<Integer> list, int numberOfInserts) {
        int position = list.size() / 2;

        long startTime = System.currentTimeMillis();

        for (int i = 0; i <= numberOfInserts; i++) {
            list.add(position, i);
            position = list.size() / 2;
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Adding " + numberOfInserts + " elements to the middle" +
                " of a "+ list.getClass().getSimpleName() +
                ": " + (endTime - startTime) + " ms");
    }

    private static void addNumbersToRandomPlaces(List<Integer> list, int numberOfInserts) {
        Random random = new Random();
        int position = 0;

        long startTime = System.currentTimeMillis();

        for (int i = 0; i <= numberOfInserts; i++) {
            position = random.nextInt(list.size());
            list.add(position, i);
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Adding " + numberOfInserts + " elements randomly" +
                " of a "+ list.getClass().getSimpleName() +
                ": " + (endTime - startTime) + " ms");
    }

    private static void getNumbersInMiddleList(List<Integer> list, int numberOfGets) {

        int number = 0;
        int position = list.size() / 2;

        long startTime = System.currentTimeMillis();

        for (int i = 0; i <= numberOfGets; i++) {
            number = list.get(position);
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Getting " + numberOfGets + " elements in the middle" +
                " of a "+ list.getClass().getSimpleName() +
                ": " + (endTime - startTime) + " ms");
    }

    private static void getNumbersToBeginningOfLinkedList(LinkedList<Integer> list, int numberOfGets) {
        int number = 0;

        long startTime = System.currentTimeMillis();

        for (int i = 0; i <= numberOfGets; i++) {
            number = list.getFirst();
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Getting " + numberOfGets + " elements in the beginning" +
                " of a "+ list.getClass().getSimpleName() +
                ": " + (endTime - startTime) + " ms");
    }

    private static void getNumbersToBeginningArrayList(ArrayList<Integer> list, int numberOfGets) {
        int number = 0;

        long startTime = System.currentTimeMillis();

        for (int i = 0; i <= numberOfGets; i++) {
            number = list.get(0);
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Getting " + numberOfGets + " elements in the beginning" +
                " of a "+ list.getClass().getSimpleName() +
                ": " + (endTime - startTime) + " ms");
    }

    private static void getNumbersToEndArrayList(ArrayList<Integer> list, int numberOfGets) {
        int number = 0;

        long startTime = System.currentTimeMillis();

        for (int i = 0; i <= numberOfGets; i++) {
            number = list.get(list.size()-1);
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Getting " + numberOfGets + " elements in the end" +
                " of a "+ list.getClass().getSimpleName() +
                ": " + (endTime - startTime) + " ms");
    }

    private static void getNumbersToEndLinkedList(LinkedList<Integer> list, int numberOfGets) {
        int number = 0;

        long startTime = System.currentTimeMillis();

        for (int i = 0; i <= numberOfGets; i++) {
            number = list.getLast();
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Getting " + numberOfGets + " elements in the end" +
                " of a "+ list.getClass().getSimpleName() +
                ": " + (endTime - startTime) + " ms");
    }
}