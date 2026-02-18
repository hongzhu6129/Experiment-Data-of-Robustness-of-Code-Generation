import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseArrayList {

    public static void main(String[] args) {
        // Create an ArrayList of integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println("Original ArrayList: " + numbers);

        // Reverse the ArrayList using Collections.reverse()
        Collections.reverse(numbers);

        System.out.println("Reversed ArrayList: " + numbers);


        // Example with Strings:
        List<String> strings = new ArrayList<>();
        strings.add("apple");
        strings.add("banana");
        strings.add("orange");

        System.out.println("Original String ArrayList: " + strings);

        Collections.reverse(strings);

        System.out.println("Reversed String ArrayList: " + strings);



         // Manual reversal using a loop (Less efficient but demonstrates the logic):
        List<Integer> numbers2 = new ArrayList<>();
        numbers2.add(10);
        numbers2.add(20);
        numbers2.add(30);
        numbers2.add(40);


        System.out.println("Original ArrayList (Manual Reversal): " + numbers2);
        List<Integer> reversedNumbers2 = manuallyReverseList(numbers2); 
        System.out.println("Reversed ArrayList (Manual Reversal): " + reversedNumbers2);

    }

    //Manual reversal method (for demonstration)
    public static List<Integer> manuallyReverseList(List<Integer> list) {
        List<Integer> reversedList = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }
        return reversedList;
    }
}
