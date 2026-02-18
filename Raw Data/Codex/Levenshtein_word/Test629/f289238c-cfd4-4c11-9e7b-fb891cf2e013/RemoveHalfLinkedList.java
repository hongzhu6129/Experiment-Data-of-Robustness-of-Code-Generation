import java.util.LinkedList;

public class RemoveHalfLinkedList {

    public static void main(String[] args) {
        // Create a sample LinkedList
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);


        System.out.println("Original LinkedList: " + numbers);

        removeHalf(numbers);

        System.out.println("LinkedList after removing half: " + numbers);


        // Example 2: Odd number of elements
        LinkedList<Integer> oddNumbers = new LinkedList<>();
        oddNumbers.add(1);
        oddNumbers.add(2);
        oddNumbers.add(3);
        oddNumbers.add(4);
        oddNumbers.add(5);

        System.out.println("Original LinkedList (odd): " + oddNumbers);

        removeHalf(oddNumbers);

        System.out.println("LinkedList after removing half (odd): " + oddNumbers);

        //Example 3: Empty list
        LinkedList<Integer> emptyList = new LinkedList<>();
        System.out.println("Original LinkedList (empty): " + emptyList);
        removeHalf(emptyList);
        System.out.println("LinkedList after removing half (empty): " + emptyList);

    }

    private static void removeHalf(LinkedList<Integer> list) {
        int originalSize = list.size();

        // Handle empty list case
        if (originalSize == 0) {
            return; // Nothing to remove
        }


        int elementsToRemove = originalSize / 2;

        for (int i = 0; i < elementsToRemove; i++) {
            list.removeLast();  // Remove from the end is more efficient for LinkedList
        }
    }
}
