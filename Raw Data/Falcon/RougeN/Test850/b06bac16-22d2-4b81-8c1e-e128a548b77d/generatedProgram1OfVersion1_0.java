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

        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);
        System.out.println("Are lists equal (Example 1)? " + list1.equals(list2));


        // Clear list2 and repopulate - Example 2: Different elements
        list2.clear();
        list2.add(4);
        list2.add(5);
        list2.add(6);

        System.out.println("\nList 1: " + list1);
        System.out.println("List 2: " + list2);
        System.out.println("Are lists equal (Example 2)? " + list1.equals(list2));



        // Clear list2 and repopulate - Example 3: Same elements, different order
        list2.clear();
        list2.add(3);
        list2.add(2);
        list2.add(1);

        System.out.println("\nList 1: " + list1);
        System.out.println("List 2: " + list2);
        System.out.println("Are lists equal (Example 3)? " + list1.equals(list2));


        // Clear list2 and repopulate - Example 4: One list is a subset of the other
        list2.clear();
        list2.add(1);
        list2.add(2);


        System.out.println("\nList 1: " + list1);
        System.out.println("List 2: " + list2);
        System.out.println("Are lists equal (Example 4)? " + list1.equals(list2));


        // Example 5: Comparing with null
        list2 = null; 
        System.out.println("\nList 1: " + list1);
        System.out.println("List 2: " + list2);
        System.out.println("Are lists equal (Example 5)? " + (list1 == list2)); // Use == for null check

    }
}
