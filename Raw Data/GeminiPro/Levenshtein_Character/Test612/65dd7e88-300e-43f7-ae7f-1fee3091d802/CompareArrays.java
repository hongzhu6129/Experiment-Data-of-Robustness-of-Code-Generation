import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareArrays {

    public static void main(String[] args) {
        // Example arrays
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {3, 5, 6, 7, 8};

        // Find common elements (retain)
        List<Integer> commonElements = new ArrayList<>();
        for (int element1 : array1) {
            for (int element2 : array2) {
                if (element1 == element2) {
                    commonElements.add(element1);
                    break; // Move to the next element of array1 once a match is found
                }
            }
        }

        System.out.println("Common elements (retain): " + commonElements);


        // Find elements that are in array1 but not in array2 (break/difference)
        List<Integer> differenceElements = new ArrayList<>();
        for (int element1 : array1) {
            boolean found = false;
            for (int element2 : array2) {
                if (element1 == element2) {
                    found = true;
                    break; // Exit inner loop once a match is found
                }
            }
            if (!found) {
                differenceElements.add(element1);
            }
        }

        System.out.println("Elements in array1 but not in array2 (break/difference): " + differenceElements);



        // Demonstrating with Integer arrays (for more complex objects, equals() would be essential)
        Integer[] array3 = {1, 2, 3, 4, null};
        Integer[] array4 = {3, null, 5, 1};

        List<Integer> commonElementsInteger = new ArrayList<>();
        for (Integer element1 : array3) {
            for (Integer element2 : array4) {
                if (element1 == element2 ) { // Uses == for Integer objects for demonstration (generally use .equals for objects) 
                   commonElementsInteger.add(element1);
                   break;
                }
             }
        }
         System.out.println("Common elements Integer arrays: " + commonElementsInteger);


        // Example with Strings (requires .equals() for comparison)
        String[] stringArray1 = {"apple", "banana", "orange"};
        String[] stringArray2 = {"orange", "grape", "apple"};

        List<String> commonStrings = new ArrayList<>();
        for (String str1 : stringArray1) {
            for (String str2 : stringArray2) {
                if (str1.equals(str2)) { // Correct string comparison
                    commonStrings.add(str1);
                    break;
                }
            }
        }
        System.out.println("Common strings: " + commonStrings);



    }
}
