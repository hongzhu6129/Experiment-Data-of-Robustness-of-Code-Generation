import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class ShuffleLinkedList {

    public static void main(String[] args) {

        // 1. Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");
        linkedList.add("Date");
        linkedList.add("Elderberry");

        System.out.println("Original LinkedList: " + linkedList);

        // 2. Shuffle using Collections.shuffle() - Easiest approach
        Collections.shuffle(linkedList); // Shuffles in place using a default Random object
        System.out.println("Shuffled LinkedList (Collections.shuffle): " + linkedList);


        // 3. Shuffle manually using a Random object and swapping (for demonstration and learning)
        LinkedList<String> linkedList2 = new LinkedList<>(); // Create a new list for manual shuffle
        linkedList2.add("Apple");
        linkedList2.add("Banana");
        linkedList2.add("Cherry");
        linkedList2.add("Date");
        linkedList2.add("Elderberry");



        Random random = new Random();
        for (int i = linkedList2.size() - 1; i > 0; i--) {
            int j = random.nextInt(i + 1); // Generate a random index between 0 and i (inclusive)

            // Swap elements at i and j
            String temp = linkedList2.get(i);
            linkedList2.set(i, linkedList2.get(j));
            linkedList2.set(j, temp);

        }
        System.out.println("Shuffled LinkedList (Manual Swap): " + linkedList2);



        // 4. Convert to an ArrayList, shuffle, and convert back (less efficient)
        List<String> arrayList = new ArrayList<>(linkedList); // Convert to ArrayList
        Collections.shuffle(arrayList); // Shuffle the ArrayList

        LinkedList<String> shuffledLinkedList = new LinkedList<>(arrayList);  // Convert back to LinkedList
        System.out.println("Shuffled LinkedList (via ArrayList): " + shuffledLinkedList);

    }
}
