import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CorrectTwoArrayLists {

    public static void main(String[] args) {
        // Example ArrayLists (replace with your actual lists)
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, null, 5, null, 7));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(8, 9, null, 11, null, 13, 14));

        // Correct the ArrayLists (remove nulls, sort, etc.)
        ArrayList<Integer> correctedList1 = correctArrayList(list1);
        ArrayList<Integer> correctedList2 = correctArrayList(list2);


        // Print the corrected ArrayLists
        System.out.println("Corrected List 1: " + correctedList1);
        System.out.println("Corrected List 2: " + correctedList2);

        // Example of further operations (e.g., merging) - Adapt as needed
        ArrayList<Integer> mergedList = new ArrayList<>(correctedList1);
        mergedList.addAll(correctedList2);
        Collections.sort(mergedList); 

        System.out.println("Merged and Sorted List: " + mergedList);

    }

    // Helper function to correct an ArrayList (remove nulls and sort)
    public static ArrayList<Integer> correctArrayList(ArrayList<Integer> list) {
        ArrayList<Integer> correctedList = new ArrayList<>();
        for (Integer element : list) {
            if (element != null) {
                correctedList.add(element);
            }
        }
        Collections.sort(correctedList);
        return correctedList;
    }
}




