import java.util.*;

public class TreeSetExample {

    public static void main(String args[]) {
        TreeSet<String> ts = new TreeSet<String>();
        ts.add("namratha");
        ts.add("sn");
        ts.add("software");
        ts.add("developer");
        Iterator<String> itr = ts.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}