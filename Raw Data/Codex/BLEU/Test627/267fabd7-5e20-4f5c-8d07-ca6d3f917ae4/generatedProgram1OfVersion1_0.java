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


        // Example 3: Using size() method (alternative approach - not strictly required by the prompt, but useful)
        List<Double> list3 = new ArrayList<>();
        
        if (list3.size() == 0) {
            System.out.println("list3 is empty (using size)");
        } else {
            System.out.println("list3 is not empty (using size)");
        }

         list3.add(1.1);  //Adding an element

        if (list3.size() == 0) {
            System.out.println("list3 is empty (using size)");
        } else {
            System.out.println("list3 is not empty (using size)");
        }
    }
}
