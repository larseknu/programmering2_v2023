import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

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