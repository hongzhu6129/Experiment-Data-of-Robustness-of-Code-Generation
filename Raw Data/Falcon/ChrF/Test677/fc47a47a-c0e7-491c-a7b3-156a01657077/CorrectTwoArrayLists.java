import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CorrectTwoArrayLists {

    public static void main(String[] args) {
        // Example usage:
        List<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(3, 5, 6, 7, 8));

        correctLists(list1, list2);

        System.out.println("Corrected list1: " + list1);
        System.out.println("Corrected list2: " + list2);


        // Another Example (demonstrates handling nulls and empty lists)
        List<String> list3 = new ArrayList<>(Arrays.asList("apple", "banana", "orange"));
        List<String> list4 = null; 

        correctLists(list3, list4);  //Handles null list2

        System.out.println("Corrected list3: " + list3);
        System.out.println("Corrected list4: " + list4);



        List<Double> list5 = new ArrayList<>();  // Empty list
        List<Double> list6 = new ArrayList<>(Arrays.asList(1.1, 2.2, 3.3));


        correctLists(list5, list6);  // Handles empty list1

        System.out.println("Corrected list5: " + list5);
        System.out.println("Corrected list6: " + list6);
    }

    public static <T> void correctLists(List<T> list1, List<T> list2) {
        if (list1 == null) {
            return; // Or throw an exception, depending on desired behavior
        }

        if (list2 == null) {
            return; // Or throw an exception or create a new list for list2
        }


        // Remove elements present in both lists from list1
        list1.removeAll(list2);


        // Add elements from list2 that are not in list1 to list1 (union without duplicates)
        for (T element : list2) {
            if (!list1.contains(element)) {
                list1.add(element);
            }
        }


         // Sort list1 (if sorting is a correction requirement, otherwise remove this part)
        // Note:  This assumes the elements are Comparable.  If not, you'll need a custom Comparator.
         if(list1 instanceof Comparable){ //Added a check for comparability, otherwise it won't compile.
             java.util.Collections.sort((List<Comparable>) list1);  //Cast to comparable to allow for Collections.sort
         }
    }
}
