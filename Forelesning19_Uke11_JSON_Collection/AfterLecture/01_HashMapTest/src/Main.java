import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> months = new HashMap<>();

        months.put(1, "January");
        months.put(2, "Febru");
        months.put(2, "Fuar");
        months.put(2, "February");

        System.out.println(months);

        months.put(3, "March");
        months.put(4, "April");

        System.out.println(months);

        System.out.println("We're getting the valye based on the key: " + months.get(3));

        for (Integer key : months.keySet()) {
            System.out.println(key + " points to the month of " + months.get(key));
        }

        for (String value : months.values()) {
            System.out.println(value);
        }

        if (!months.containsKey(5))
            months.put(5, "May");

        System.out.println(months);
    }
}