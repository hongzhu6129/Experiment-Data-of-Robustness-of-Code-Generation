import java.util.ArrayList;
import java.util.List;

public class CheckArrayListEmpty {

    public static void main(String[] args) {
        // Example 1: Empty ArrayList
        List<String> list1 = new ArrayList<>();
        System.out.println("Is list1 empty? " + list1.isEmpty()); // Output: true

        // Example 2: Non-empty ArrayList
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        System.out.println("Is list2 empty? " + list2.isEmpty()); // Output: false


        // Example 3:  Using size() to check if a list is empty
        List<Double> list3 = new ArrayList<>();
        System.out.println("Is list3 empty using size()? " + (list3.size() == 0)); // Output: true
        list3.add(1.1);
        System.out.println("Is list3 empty using size()? " + (list3.size() == 0)); // Output: false
    }
}
