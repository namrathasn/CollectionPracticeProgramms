import java.util.*;

public class HashMapDemo {

    public static void main(String args[]) {
        HashMap<Integer, String> hm = new HashMap<Integer, String>();

        hm.put(1, "namratha");
        hm.put(2, "sn");
        hm.put(3, "developer");

        // Finding the value for a key
        System.out.println("Value for 1 is " + hm.get(1));

        // Traversing through the HashMap
        for (Map.Entry<Integer, String> e : hm.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());
    }
}
