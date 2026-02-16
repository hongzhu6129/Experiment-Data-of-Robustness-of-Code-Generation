import java.util.ArrayList;
import java.util.Arrays;

public class CheckBesideArrayList {

    public static void main(String[] args) {
        // Test cases
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(6, 7, 8, 9, 10));
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));
        ArrayList<Integer> list4 = new ArrayList<>(Arrays.asList(2, 4, 6, 8, 10));
        ArrayList<Integer> list5 = new ArrayList<>(Arrays.asList(1, 2, 4, 5)); // Non-beside example


        System.out.println("Is list1 beside list2? " + isBeside(list1, list2)); // True
        System.out.println("Is list3 beside list4? " + isBeside(list3, list4)); // True
        System.out.println("Is list1 beside list3? " + isBeside(list1, list3)); // False
        System.out.println("Is list1 beside list5? " + isBeside(list1, list5)); // False (due to non-sequential elements)


    }

    public static boolean isBeside(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        if (list1 == null || list2 == null || list1.size() != list2.size()) {
            return false; // Handle null or unequal sizes
        }

        boolean allGreater = true;
        boolean allLess = true;

        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) >= list2.get(i)) {
                allLess = false;
            }
            if (list1.get(i) <= list2.get(i)) {
                allGreater = false;
            }

        }

       return allGreater || allLess;

       /* Alternate, more efficient approach (avoids unnecessary iterations once a condition is violated):

        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) >= list2.get(i)) {
                allLess = false;
            } else { // Must be greater, so allGreater could become false
                allGreater = false;
            }
             if (!allGreater && !allLess) { // Optimization: Exit early if neither condition holds
                 return false;
             }
        } 
        return true; // If loop completes without returning, one of the conditions must be true.
       */

    }
}
