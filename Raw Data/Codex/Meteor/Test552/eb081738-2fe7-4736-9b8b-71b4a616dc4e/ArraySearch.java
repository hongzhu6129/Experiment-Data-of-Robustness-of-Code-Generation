import java.util.Arrays;

public class ArraySearch {

    public static void main(String[] args) {
        // Example array of names
        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve"};

        // Element to search for
        String searchName = "Charlie";


        // Method 1: Linear Search (suitable for unsorted arrays)
        int indexLinear = -1; // Initialize to -1 to indicate not found
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(searchName)) {
                indexLinear = i;
                break; // Exit loop once found
            }
        }

        if (indexLinear != -1) {
            System.out.println("Linear Search: " + searchName + " found at index " + indexLinear);
        } else {
            System.out.println("Linear Search: " + searchName + " not found in the array.");
        }


        // Method 2: Binary Search (requires a sorted array)
        // Sort the array first if not already sorted
        Arrays.sort(names); // names array is now sorted alphabetically

        int indexBinary = Arrays.binarySearch(names, searchName);

        if (indexBinary >= 0) { // binarySearch returns the index if found, a negative value if not
            System.out.println("Binary Search: " + searchName + " found at index " + indexBinary);
        } else {
            System.out.println("Binary Search: " + searchName + " not found in the array.");
        }



        // Search for an element that's not present:
        searchName = "Frank";  // Frank is not in the array


        indexLinear = -1;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(searchName)) {
                indexLinear = i;
                break; 
            }
        }

        if (indexLinear != -1) {
            System.out.println("Linear Search: " + searchName + " found at index " + indexLinear);
        } else {
            System.out.println("Linear Search: " + searchName + " not found in the array.");
        }


        indexBinary = Arrays.binarySearch(names, searchName);

        if (indexBinary >= 0) { 
            System.out.println("Binary Search: " + searchName + " found at index " + indexBinary);
        } else {
            System.out.println("Binary Search: " + searchName + " not found in the array.");
        }



    }
}
