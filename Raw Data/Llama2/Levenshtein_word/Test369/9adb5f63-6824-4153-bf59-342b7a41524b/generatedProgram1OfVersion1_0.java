import java.util.ArrayList;
import java.util.List;

public class ExtractArrayListPortion {

    public static void main(String[] args) {

        // Sample ArrayList
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Grape");
        fruits.add("Pineapple");


        // Method 1: Using subList() - Creates a view, modifications affect original list
        System.out.println("Method 1: subList()");
        List<String> sublist1 = fruits.subList(1, 4); // Extracts elements from index 1 (inclusive) to 4 (exclusive)
        System.out.println("Sublist 1: " + sublist1);

        // Modifying the sublist also modifies the original list
        sublist1.set(0, "Watermelon"); 
        System.out.println("Original list after sublist modification: " + fruits);



        // Method 2:  Creating a new ArrayList with a loop - Creates a copy
        System.out.println("\nMethod 2: Loop and new ArrayList");
        ArrayList<String> sublist2 = new ArrayList<>();
        int startIndex = 2;
        int endIndex = 5; // Exclusive

        for (int i = startIndex; i < endIndex && i < fruits.size(); i++) { // Safeguard against going beyond list size
            sublist2.add(fruits.get(i));
        }
        System.out.println("Sublist 2: " + sublist2);

        // Modifying this new sublist does NOT affect the original
        sublist2.set(0, "Kiwi");
        System.out.println("Original list after sublist2 modification: " + fruits);



        // Method 3: Using Java Streams (Java 8 and above) - Creates a new list
        System.out.println("\nMethod 3: Java Streams");

        List<String> sublist3 = fruits.stream()
                .skip(0)  // Skip the first 0 elements
                .limit(3)  // Take the next 3 elements
                .toList(); // Convert to a new list

        System.out.println("Sublist 3: " + sublist3);




        // Important notes about subList():
        System.out.println("\nImportant Notes about subList():");
        System.out.println("- subList() creates a *view* of the original list, not a copy.");
        System.out.println("- Modifications to the sublist will affect the original list.");
        System.out.println("- If you need a separate, independent copy, use the loop or streams method.");




    }
}
