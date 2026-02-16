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
        numbers.add(7); // Include 7 to demonstrate the exclusive nature of headSet
        numbers.add(3);

        // Find elements less than 7 (exclusive)
        TreeSet<Integer> lessThanSeven = (TreeSet<Integer>) numbers.headSet(7); 

        // Print the elements less than 7
        System.out.println("Elements less than 7: " + lessThanSeven);


        // Example with an empty TreeSet
         TreeSet<Integer> emptySet = new TreeSet<>();
         TreeSet<Integer> lessThanSevenEmpty = (TreeSet<Integer>) emptySet.headSet(7);
         System.out.println("Elements less than 7 in an empty set: " + lessThanSevenEmpty);



        // Example where all elements are greater than or equal to 7
        TreeSet<Integer> allGreaterThanOrEqualSeven = new TreeSet<>();
        allGreaterThanOrEqualSeven.add(7);
        allGreaterThanOrEqualSeven.add(8);
        allGreaterThanOrEqualSeven.add(9);
        TreeSet<Integer> lessThanSevenAllGreater = (TreeSet<Integer>) allGreaterThanOrEqualSeven.headSet(7);
        System.out.println("Elements less than 7 when all are >= 7: " + lessThanSevenAllGreater);

    }
}
