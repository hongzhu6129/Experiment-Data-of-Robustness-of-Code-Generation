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


        // Example with Strings
        ArrayList<String> strings = new ArrayList<>();
        strings.add("apple");
        strings.add("banana");
        strings.add("orange");

        System.out.println("Original String ArrayList: " + strings);
        Collections.reverse(strings);
        System.out.println("Reversed String ArrayList: " + strings);



         //Demonstrating manual reversal (without Collections.reverse())
        ArrayList<Integer> numbers2 = new ArrayList<>();
        numbers2.add(10);
        numbers2.add(20);
        numbers2.add(30);
        numbers2.add(40);


        System.out.println("Original ArrayList (manual reverse): " + numbers2);
        reverseArrayListManually(numbers2);
        System.out.println("Reversed ArrayList (manual reverse): " + numbers2);
    }

    // Manual reversal method (for demonstration)
    private static void reverseArrayListManually(ArrayList<Integer> list) {
        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            // Swap elements at left and right indices
            Integer temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);

            // Move indices towards the middle
            left++;
            right--;
        }
    }
}
