import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> ssdf = new ArrayList<>();
        
        HashMap<Integer, String> months = new HashMap<>();

        months.put(1, "January");
        months.put(2, "Feb");
        System.out.println(months);

        months.put(2, "Febdsfry");
        months.put(2, "February");
        months.put(3, "March");

        System.out.println(months);

        System.out.println("Name of the second month: " + months.get(2));

        if (months.containsKey(4)) {
            System.out.println(months.get(4));
        }
        else {
            months.put(4, "April");
        }

        System.out.println(months);

        for (Integer key: months.keySet()) {
            System.out.println(key);
        }

        for (String value : months.values()) {
            System.out.println(value);
        }

        /*
        for (Map<Integer, String> map : months) {
            System.out.println(map);
        }*/
    }
}
