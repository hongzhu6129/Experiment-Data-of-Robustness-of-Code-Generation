import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArrayList {

    public static void main(String[] args) {

        // Method 1: Using Collections.reverse() - The simplest and most efficient way.

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println("Original ArrayList: " + numbers);

        Collections.reverse(numbers);

        System.out.println("Reversed ArrayList using Collections.reverse(): " + numbers);



        // Method 2: Using a loop (for educational purposes - less efficient)

        List<String> strings = new ArrayList<>();
        strings.add("apple");
        strings.add("banana");
        strings.add("cherry");

        System.out.println("\nOriginal ArrayList: " + strings);

        List<String> reversedStrings = new ArrayList<>();

        for (int i = strings.size() - 1; i >= 0; i--) {
            reversedStrings.add(strings.get(i));
        }

        System.out.println("Reversed ArrayList using a loop: " + reversedStrings);



         // Method 3: Reversing in-place using a loop (most efficient if you need to modify the original list)
        List<Double> doubles = new ArrayList<>();
        doubles.add(1.1);
        doubles.add(2.2);
        doubles.add(3.3);
        doubles.add(4.4);


        System.out.println("\nOriginal ArrayList: " + doubles);

        int start = 0;
        int end = doubles.size() - 1;

        while (start < end) {
            // Swap elements at start and end indices
            Collections.swap(doubles, start, end);  // Or manual swap:
            //Double temp = doubles.get(start);
            //doubles.set(start, doubles.get(end));
            //doubles.set(end, temp);


            start++;
            end--;
        }

        System.out.println("Reversed ArrayList in-place using a loop: " + doubles);


    }
}
