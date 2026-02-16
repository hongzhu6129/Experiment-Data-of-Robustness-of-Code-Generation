import java.util.ArrayList;
import java.util.List;

public class ReplaceSecondElement {

    public static void main(String[] args) {
        // Create an ArrayList of strings
        List<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");

        // Print the original ArrayList
        System.out.println("Original ArrayList: " + colors);

        // Replace the second element (index 1) with "Orange"
        String newElement = "Orange";

        if (colors.size() >= 2) {  // Check if the ArrayList has at least 2 elements
            colors.set(1, newElement); 

            // Print the modified ArrayList
            System.out.println("Modified ArrayList: " + colors);
        } else {
            System.out.println("ArrayList does not have a second element to replace.");
        }


        // Another example with integers
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        System.out.println("Original numbers: " + numbers);

        int newNumber = 25;
         if (numbers.size() >= 2) {
             numbers.set(1, newNumber);
             System.out.println("Modified numbers: " + numbers);
         } else {
             System.out.println("numbers list does not have a second element to replace.");
         }



    }
}
