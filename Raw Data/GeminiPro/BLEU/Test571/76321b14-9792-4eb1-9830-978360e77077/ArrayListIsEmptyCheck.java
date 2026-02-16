import java.util.ArrayList;
import java.util.List;

public class ArrayListIsEmptyCheck {

    public static void main(String[] args) {

        // Example 1: Empty ArrayList
        List<String> list1 = new ArrayList<>();
        if (list1.isEmpty()) {
            System.out.println("list1 is empty");
        } else {
            System.out.println("list1 is not empty");
        }

        // Example 2: ArrayList with elements
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);

        if (list2.isEmpty()) {
            System.out.println("list2 is empty");
        } else {
            System.out.println("list2 is not empty");
        }


        // Example 3:  Using size() method (alternative, less efficient but demonstrates another approach)
        List<Double> list3 = new ArrayList<>();

        if (list3.size() == 0) {  // Check if size is 0
            System.out.println("list3 is empty (using size)");
        } else {
            System.out.println("list3 is not empty (using size)");
        }

        list3.add(3.14);

        if (list3.size() == 0) {  // Check if size is 0
            System.out.println("list3 is empty (using size)");
        } else {
            System.out.println("list3 is not empty (using size)");
        }



    }
}
