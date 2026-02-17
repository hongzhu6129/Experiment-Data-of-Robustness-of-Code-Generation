import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseSophisticatedList {

    public static void main(String[] args) {

        // Example usage:
        List<Object> sophisticatedList = new ArrayList<>();
        sophisticatedList.add("Hello");
        sophisticatedList.add(123);
        sophisticatedList.add(4.56);
        sophisticatedList.add(true);
        sophisticatedList.add(new Object()); // Can handle any object type

        System.out.println("Original list: " + sophisticatedList);

        reverseList(sophisticatedList);

        System.out.println("Reversed list: " + sophisticatedList);
    }


    //  A method to reverse a generic list (sophisticated or not!)
    private static <T> void reverseList(List<T> list) {
        Collections.reverse(list);
    }
}


