import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListProgramms {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("namratha");
        list.add("mayur");
        list.add("saikumar");
        list.add("darshpatil");
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
