import java.util.*;

public class LinkedHashSetProgram {
    public static void main(String args[]) {
        LinkedHashSet<String> lhs = new LinkedHashSet<String>();
        lhs.add("namratha");
        lhs.add("sn");
        lhs.add("software");
        lhs.add("developer");
        // Traversing elements
        Iterator<String> itr = lhs.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}