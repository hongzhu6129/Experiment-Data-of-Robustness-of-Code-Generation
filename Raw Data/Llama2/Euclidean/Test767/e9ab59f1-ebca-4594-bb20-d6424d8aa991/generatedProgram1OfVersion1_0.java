import java.util.TreeSet;

public class TreeSetLessThanSeven {

    public static void main(String[] args) {
        // Create a TreeSet of integers
        TreeSet<Integer> numbers = new TreeSet<>();

        // Add some numbers to the TreeSet
        numbers.add(2);
        numbers.add(9);
        numbers.add(5);
        numbers.add(1);
        numbers.add(12);
        numbers.add(7);  // Include 7 to demonstrate the exclusive nature of headSet
        numbers.add(3);


        // Find elements less than 7 (exclusive) using headSet
        TreeSet<Integer> lessThanSeven = new TreeSet<>(numbers.headSet(7));

        // Print the elements less than 7
        System.out.println("Elements less than 7: " + lessThanSeven);


        // Alternatively, you could count them directly without creating a new set:
        int countLessThanSeven = numbers.headSet(7).size();
        System.out.println("Number of elements less than 7: " + countLessThanSeven);

         // For inclusive less than or equal to 7, you can modify the approach slightly.
        // Since TreeSet doesn't offer an inclusive headSet, you can achieve this by adding a very small number larger than the max element.  (This may be inefficient for large TreeSets).

        //TreeSet<Integer> lessThanOrEqualSeven = new TreeSet<>(numbers.headSet(7 + 0.000001)); // Assuming no floating-point values in your TreeSet
        //System.out.println("Elements less than or equal to 7: " + lessThanOrEqualSeven);


        // For greater clarity for <= 7, loop:
        int countLessThanOrEqualSeven = 0;
        for (Integer num : numbers) {
            if (num <= 7) {
                countLessThanOrEqualSeven++;
            }
        }
        System.out.println("Number of elements less than or equal to 7: " + countLessThanOrEqualSeven);
    }
}
