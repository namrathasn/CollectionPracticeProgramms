import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("namratha"); //add method to add elements of the string
        list.add("mayur");
        list.add("saikumar");
        list.add("darshpatil");
        System.out.println(list.add("shradha"));
        System.out.println(list);
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("namrathasn");
        list1.add("mayurbohra");
        list1.add("saikumarss");
        list1.add("darshpatils");
        System.out.println(list.addAll(list1)); //addall method to add all the objects of a list to the parent list
        System.out.println(list.remove("mayur")); // remove the object of the list
        System.out.println(list.removeAll(list1));//remove all to remove the objects of the child list
        System.out.println(list);
        //iterator interface
        Iterator itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
