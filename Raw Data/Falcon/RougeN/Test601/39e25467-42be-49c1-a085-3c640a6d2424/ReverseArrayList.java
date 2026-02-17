import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {

    public static void main(String[] args) {

        // Create an ArrayList of strings
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grape");

        System.out.println("Original ArrayList: " + fruits);

        // Reverse the ArrayList using Collections.reverse()
        Collections.reverse(fruits);

        System.out.println("Reversed ArrayList: " + fruits);


        // Example with integers:
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println("Original ArrayList of numbers: " + numbers);
        Collections.reverse(numbers);
        System.out.println("Reversed ArrayList of numbers: " + numbers);



    }
}
