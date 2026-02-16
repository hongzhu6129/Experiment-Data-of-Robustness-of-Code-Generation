import java.util.ArrayList;
import java.util.Collections;

public class ReshuffleArrayList {

    public static void main(String[] args) {

        // Create an ArrayList of strings
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        arrayList.add("Grape");
        arrayList.add("Mango");

        // Print the original ArrayList
        System.out.println("Original ArrayList: " + arrayList);


        // Shuffle the elements using Collections.shuffle()
        Collections.shuffle(arrayList);


        // Print the reshuffled ArrayList
        System.out.println("Reshuffled ArrayList: " + arrayList);


        //Example with Integers:

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println("Original numbers: " + numbers);
        Collections.shuffle(numbers);
        System.out.println("Shuffled numbers: " + numbers);

    }
}
