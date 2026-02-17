import java.util.ArrayList;
import java.util.List;

public class CheckArrayListEmpty {

    public static void main(String[] args) {
        // Example 1: Empty ArrayList
        List<String> list1 = new ArrayList<>(); 

        if (list1.isEmpty()) {
            System.out.println("list1 is empty");
        } else {
            System.out.println("list1 is not empty");
        }

        // Example 2: Non-empty ArrayList
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);

        if (list2.isEmpty()) {
            System.out.println("list2 is empty");
        } else {
            System.out.println("list2 is not empty");
        }


        // Example 3:  ArrayList with null elements (it's NOT considered empty)
         List<String> list3 = new ArrayList<>();
         list3.add(null);
         list3.add(null);


        if (list3.isEmpty()) {
            System.out.println("list3 is empty");
        } else {
            System.out.println("list3 is not empty"); // This will be printed because it contains nulls
        }


    }
}
