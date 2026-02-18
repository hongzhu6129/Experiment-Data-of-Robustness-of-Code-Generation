import java.util.LinkedList;

public class LinkedListElementCheck {

    public static void main(String[] args) {
        // Create a sample LinkedList
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Grape");
        fruits.add("Mango");

        // Element to search for
        String searchElement = "Orange";

        // Method 1: Using contains()
        boolean found1 = fruits.contains(searchElement);
        System.out.println("Using contains(): " + searchElement + " found? " + found1);


        // Method 2: Manual iteration (educational)
        boolean found2 = false;
        for (String fruit : fruits) {
            if (fruit.equals(searchElement)) {
                found2 = true;
                break; // Exit loop once found
            }
        }
        System.out.println("Using iteration: " + searchElement + " found? " + found2);


        // Method 3: indexOf() (returns index or -1 if not found) - Demonstrates a different approach
        int index = fruits.indexOf(searchElement);
        System.out.println("Using indexOf(): Index of " + searchElement + ": " + index);
        boolean found3 = (index != -1);
        System.out.println("Using indexOf() to check existence: " + searchElement + " found? " + found3);


         // Example showing how to handle a case where the element isn't present:
        String notPresentElement = "Kiwi";
        if (fruits.contains(notPresentElement)) {
            System.out.println(notPresentElement + " is in the list.");
        } else {
            System.out.println(notPresentElement + " is NOT in the list.");
        }


        // Example to avoid NullPointerException if the list itself is null
        LinkedList<String> nullList = null;
        if (nullList != null && nullList.contains("Apple")) { // Check for null first
            System.out.println("Apple found in nullList (This won't print).");
        } else if (nullList == null){
            System.out.println("The list is null!");
        }




    }
}
