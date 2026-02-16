import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ShuffleLinkedList {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);

        System.out.println("Original LinkedList: " + linkedList);

        shuffleLinkedList(linkedList);

        System.out.println("Shuffled LinkedList: " + linkedList);


        //Demonstrate alternative shuffle approach using List conversion (more efficient):
         LinkedList<Integer> linkedList2 = new LinkedList<>();
        linkedList2.add(10);
        linkedList2.add(20);
        linkedList2.add(30);
        linkedList2.add(40);
        linkedList2.add(50);

        System.out.println("\nOriginal LinkedList 2: " + linkedList2);
        shuffleLinkedListEfficiently(linkedList2);
        System.out.println("Efficiently Shuffled LinkedList 2: " + linkedList2);



    }


    // Less Efficient (but demonstrates in-place shuffling without auxillary data structure):
    public static void shuffleLinkedList(LinkedList<Integer> linkedList) {
        int size = linkedList.size();

        // Shuffle elements using Fisher-Yates (Durstenfeld) algorithm adaptation.
        for (int i = size - 1; i > 0; i--) {
            int j = (int) (Math.random() * (i + 1));  // Random index from 0 to i

            // Swap elements at i and j
            int temp = linkedList.get(i);
            linkedList.set(i, linkedList.get(j));
            linkedList.set(j, temp);

        }

    }




    //More Efficient Shuffle (uses an ArrayList to shuffle, then rebuilds LinkedList)
    public static void shuffleLinkedListEfficiently(LinkedList<Integer> linkedList) {
        List<Integer> list = new ArrayList<>(linkedList); // Convert to ArrayList
        Collections.shuffle(list);                         // Shuffle the ArrayList
        linkedList.clear();                              // Clear the original LinkedList
        linkedList.addAll(list);                           // Add shuffled elements back 
    }




}
