import java.util.ArrayList;
import java.util.List;

public class ReplaceSecondElement {

    public static void main(String[] args) {
        // Create an ArrayList
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grape");

        // Specify the element to replace with
        String newElement = "Mango";

        // Replace the second element (index 1) if the list has at least 2 elements
        if (fruits.size() >= 2) {
            fruits.set(1, newElement); 
        } else {
            System.out.println("ArrayList does not have a second element to replace.");
        }

        // Print the updated ArrayList
        System.out.println(fruits);


        // Example with an Integer ArrayList
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        int newNumber = 10;

        if (numbers.size() >= 2) {
            numbers.set(1, newNumber);
        } else {
            System.out.println("ArrayList does not have a second element to replace.");
        }

        System.out.println(numbers);


        // Example handling an empty or single-element list:
        List<String> emptyList = new ArrayList<>();

        String newValue = "Kiwi";
        if (emptyList.size() >= 2) {
            emptyList.set(1, newValue);
        } else {
            System.out.println("ArrayList does not have a second element to replace.");
        }
        System.out.println(emptyList); // Output: [] (remains empty)

        List<String> singleItemList = new ArrayList<>();
        singleItemList.add("Peach");

        if(singleItemList.size()>=2) {
            singleItemList.set(1, newValue);
        } else {
            System.out.println("ArrayList does not have a second element to replace.");
        }
        System.out.println(singleItemList); // Output: [Peach]
    }
}
