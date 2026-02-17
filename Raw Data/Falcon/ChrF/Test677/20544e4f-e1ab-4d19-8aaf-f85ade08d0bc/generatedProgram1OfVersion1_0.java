import java.util.ArrayList;
import java.util.List;

public class CompareArrayLists {

    public static void main(String[] args) {
        // Create seven ArrayLists of Integers (you can change the type as needed)
        List<Integer> list1 = new ArrayList<>(List.of(1, 2, 3));
        List<Integer> list2 = new ArrayList<>(List.of(1, 2, 3));
        List<Integer> list3 = new ArrayList<>(List.of(4, 5, 6));
        List<Integer> list4 = new ArrayList<>(List.of(1, 2, 3, 4));
        List<Integer> list5 = new ArrayList<>(List.of(1, 2));
        List<Integer> list6 = new ArrayList<>(List.of(1, 2, 3));
        List<Integer> list7 = new ArrayList<>(List.of(3, 2, 1));


        // Compare the lists using equals()
        System.out.println("list1 equals list2: " + list1.equals(list2));  // True
        System.out.println("list1 equals list3: " + list1.equals(list3));  // False
        System.out.println("list1 equals list4: " + list1.equals(list4));  // False
        System.out.println("list1 equals list5: " + list1.equals(list5));  // False
        System.out.println("list1 equals list6: " + list1.equals(list6));  // True
        System.out.println("list1 equals list7: " + list1.equals(list7));  // False (order matters)

        // Example: Check if all lists from list1 to list3 are equal:
        boolean allEqual123 = list1.equals(list2) && list1.equals(list3); // allEqual will be false
        System.out.println("list1, list2, and list3 are all equal: " + allEqual123);


        // Example: Check if any list from list1, list2, list 6  are equal to list3
        boolean anyEqual = list3.equals(list1) || list3.equals(list2) || list3.equals(list6) ;
        System.out.println("At least one of list1, list2, list6 is equal to list3: " + anyEqual); //anyEqual is false


        // Example of comparing more than two lists efficiently  (e.g. list1, list2, list6):
        boolean allEqual126 = true;
        List<List<Integer>> listsToCompare = List.of(list1, list2, list6);
        for (int i = 1; i < listsToCompare.size(); i++) {
            if (!listsToCompare.get(0).equals(listsToCompare.get(i))) {
                allEqual126 = false;
                break; // Exit the loop early if a mismatch is found
            }
        }

        System.out.println("list1, list2, and list6 are all equal: " + allEqual126); //true

    }
}
