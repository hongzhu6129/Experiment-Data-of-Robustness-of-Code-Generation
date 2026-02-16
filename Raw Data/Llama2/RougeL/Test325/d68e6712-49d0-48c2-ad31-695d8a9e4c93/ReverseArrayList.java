import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {

    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println("Original ArrayList: " + numbers);

        // Reverse the ArrayList using Collections.reverse()
        Collections.reverse(numbers);

        System.out.println("Reversed ArrayList: " + numbers);


        //Example with Strings
        ArrayList<String> strings = new ArrayList<>();
        strings.add("apple");
        strings.add("banana");
        strings.add("cherry");

        System.out.println("Original String ArrayList: " + strings);
        Collections.reverse(strings);
        System.out.println("Reversed String ArrayList: " + strings);
    }
}
