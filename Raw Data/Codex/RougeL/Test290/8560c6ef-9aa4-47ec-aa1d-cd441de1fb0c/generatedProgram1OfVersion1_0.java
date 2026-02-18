import java.util.LinkedList;

public class CompareLinkedLists {

    public static void main(String[] args) {
        // Create two linked lists
        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();

        // Populate list1
        list1.add(1);
        list1.add(2);
        list1.add(3);

        // Populate list2 - make it different initially
        list2.add(1);
        list2.add(2);
        list2.add(4);


        // Compare the lists using .equals()
        System.out.println("Are list1 and list2 equal initially? " + list1.equals(list2)); // Output: false


        // Modify list2 to be equal to list1
        list2.clear();
        list2.addAll(list1);


        // Compare the lists again
        System.out.println("Are list1 and list2 equal after modification? " + list1.equals(list2)); // Output: true

        //Demonstrate other comparison scenarios
        list2.add(5); //Make list2 longer

        System.out.println("Are list1 and list2 equal after adding to list2? " + list1.equals(list2));// Output: false

        list2.removeLast(); // Make them the same size again but different content
        list2.set(2, 6);


        System.out.println("Are list1 and list2 equal after changing content of list2? " + list1.equals(list2));// Output: false

        //Demonstrate comparison with null
        list2 = null;
        System.out.println("Is list1 equal to null? " + list1.equals(list2)); //Output: false




    }
}
