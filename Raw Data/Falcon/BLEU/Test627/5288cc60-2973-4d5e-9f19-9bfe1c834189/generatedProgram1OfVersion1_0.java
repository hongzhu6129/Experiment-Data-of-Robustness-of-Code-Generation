import java.util.ArrayList;
import java.util.List;

public class CheckArrayListEmpty {

    public static void main(String[] args) {
        // Example 1: Empty ArrayList
        List<String> list1 = new ArrayList<>();
        System.out.println("Is list1 empty? " + list1.isEmpty());

        // Example 2: Non-empty ArrayList
        List<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        System.out.println("Is list2 empty? " + list2.isEmpty());


        // Example 3:  ArrayList initialized, but with no elements added
        List<Double> list3 = new ArrayList<>();  // Although initialized, it's still empty
        System.out.println("Is list3 empty? " + list3.isEmpty());

         // Example 4: Using size() to check (alternative but less efficient)
         List<Character> list4 = new ArrayList<>();
         list4.add('a');
         System.out.println("Is list4 empty? " + (list4.size() == 0));  //  true if size is 0


    }
}
