import java.util.LinkedList;

public class CompareLinkedLists {

    public static void main(String[] args) {
        // Create two LinkedLists
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();

        // Populate list1
        list1.add(1);
        list1.add(2);
        list1.add(3);

        // Populate list2 - Example 1: Identical to list1
        list2.add(1);
        list2.add(2);
        list2.add(3);

        // Compare and print the result for Example 1
        System.out.println("Comparison 1 (Identical): " + list1.equals(list2)); // Output: true


        // Clear list2 and repopulate - Example 2: Different elements
        list2.clear();
        list2.add(4);
        list2.add(5);
        list2.add(6);

        // Compare and print the result for Example 2
        System.out.println("Comparison 2 (Different elements): " + list1.equals(list2)); // Output: false

        // Clear list2 and repopulate - Example 3: Different order
        list2.clear();
        list2.add(3);
        list2.add(2);
        list2.add(1);

        // Compare and print the result for Example 3
        System.out.println("Comparison 3 (Different order): " + list1.equals(list2)); // Output: false



        // Clear list2 and repopulate - Example 4: One is a subset/prefix of the other
        list2.clear();
        list2.add(1);
        list2.add(2);

        // Compare and print the result for Example 4
        System.out.println("Comparison 4 (Subset): " + list1.equals(list2)); // Output: false


        // Example 5: One list is null
        list2 = null;
        System.out.println("Comparison 5 (One list is null): " + (list1.equals(list2))); // Output: false

        // Example 6: Both lists are null
        list1 = null;
        list2 = null;
        System.out.println("Comparison 6 (Both lists are null): " + (list1 == list2)); // Output: true (need to use == here)


    }
}
