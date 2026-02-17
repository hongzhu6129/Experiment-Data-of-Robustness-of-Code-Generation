import java.util.LinkedList;

public class ConcatenateLinkedLists {

    public static void main(String[] args) {
        // Create the first linked list
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        // Create the second linked list
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(4);
        list2.add(5);
        list2.add(6);

        // Concatenate list2 to list1 (modifies list1)
        list1.addAll(list2); 

        // Print the concatenated list
        System.out.println("Concatenated List: " + list1);


        // Demonstrating another way to concatenate without modifying the original lists
         LinkedList<Integer> concatenatedList = new LinkedList<>(list1); // create a copy to avoid modifying the original
        LinkedList<Integer> list3 = new LinkedList<>();
        list3.add(7);
        list3.add(8);

        concatenatedList.addAll(list3);
        System.out.println("Original List 1: " + list1);
        System.out.println("Concatenated List (new list): " + concatenatedList);


        // Demonstrating concatenation using a loop (more manual approach, sometimes useful for specific logic)
        LinkedList<Integer> list4 = new LinkedList<>();
        list4.add(9);
        list4.add(10);

        LinkedList<Integer> manualConcatenation = new LinkedList<>(list1); // Start with a copy

        for (Integer element : list4) {
            manualConcatenation.add(element);
        }

        System.out.println("Manual Concatenation: " + manualConcatenation);




    }
}
