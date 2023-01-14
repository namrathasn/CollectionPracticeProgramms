import java.util.*;

public class StackExample {
    public static void main(String args[]) {
        Stack<String> stack = new Stack<String>();
        stack.push("namratha");
        stack.push("sn");
        stack.push("software");
        stack.push("developer");
        Iterator<String> itr = stack.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();
        stack.pop();
        itr = stack.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
    }
}