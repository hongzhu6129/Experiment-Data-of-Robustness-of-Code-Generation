import java.util.TreeSet;

public class TreeSetLessThanSeven {

    public static void main(String[] args) {
        // Create a TreeSet of Integer objects
        TreeSet<Integer> numbers = new TreeSet<>();

        // Add some numbers to the TreeSet (order doesn't matter, TreeSet sorts them)
        numbers.add(10);
        numbers.add(3);
        numbers.add(7);
        numbers.add(1);
        numbers.add(5);
        numbers.add(9);
        numbers.add(2);

        System.out.println("Original TreeSet: " + numbers);

        // Method 1: Using headSet() to find elements less than 7 (exclusive)
        TreeSet<Integer> lessThanSeven = (TreeSet<Integer>) numbers.headSet(7); 

        System.out.println("Numbers less than 7 (exclusive): " + lessThanSeven);


        // Method 2: Using a loop and comparing (for demonstration)
        System.out.print("Numbers less than 7 (exclusive - using loop): ");
        for (Integer num : numbers) {
            if (num < 7) {
                System.out.print(num + " ");
            }
        }
        System.out.println();


        // Method 3: Java 8 Streams (more advanced but concise)
        System.out.print("Numbers less than 7 (exclusive - using streams): ");
        numbers.stream().filter(n -> n < 7).forEach(n -> System.out.print(n + " "));
        System.out.println();



        //  Finding elements less than or equal to 7
        //  For inclusive use numbers.headSet(7, true)  or filter with <= 7


        TreeSet<Integer> lessThanOrEqualSeven = (TreeSet<Integer>) numbers.headSet(7, true);
        lessThanOrEqualSeven.remove(7); // Workaround to get numbers strictly less than 7.
        System.out.println("Number less than 7, implemented with less than or equal to and remove: "+ lessThanOrEqualSeven);
    }
}
