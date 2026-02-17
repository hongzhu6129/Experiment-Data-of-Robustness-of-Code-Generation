import java.util.HashSet;
import java.util.LinkedList;

public class LinkedListBeside {

    public static void main(String[] args) {
        // Example usage:
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);


        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(6);
        list2.add(7);
        list2.add(8);

        LinkedList<Integer> list3 = new LinkedList<>();  // Empty List
        

        LinkedList<Integer> list4 = new LinkedList<>(); // List with duplicates
        list4.add(1);
        list4.add(2);
        list4.add(2);
        list4.add(3);


        System.out.println("List 1 is beside: " + isBeside(list1)); // True
        System.out.println("List 2 is beside: " + isBeside(list2)); // True
        System.out.println("List 3 is beside: " + isBeside(list3)); // True (Empty list considered beside)
        System.out.println("List 4 is beside: " + isBeside(list4)); // False (Duplicates)


    }

    public static boolean isBeside(LinkedList<Integer> list) {
        if (list == null || list.isEmpty()) {
            return true; // Empty list or null is considered beside
        }

        HashSet<Integer> seen = new HashSet<>();
        for (Integer num : list) {
            if (seen.contains(num)) {
                return false; // Duplicate found, not beside
            }
            seen.add(num);
        }

        return true; // No duplicates found, beside
    }




}
