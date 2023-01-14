import java.util.*;

public class HashSetExample {
    public static void main(String args[]) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("namratha");
        hs.add("sn");
        hs.add("software");
        hs.add("developer");
        Iterator<String> itr = hs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}