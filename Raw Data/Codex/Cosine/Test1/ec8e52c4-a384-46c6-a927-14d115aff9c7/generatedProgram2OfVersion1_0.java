import java.util.TreeSet;

public class GreaterOrEqualInTreeSet {

    public static void main(String[] args) {

        // Create a TreeSet (which automatically stores elements in sorted order).
        TreeSet<Integer> greenSet = new TreeSet<>();
        greenSet.add(10);
        greenSet.add(20);
        greenSet.add(30);
        greenSet.add(40);
        greenSet.add(50);

        // Given element to search for.
        int givenElement1 = 25;

        // Use the ceiling() method to find the least element greater than or equal to the given element.
        // If no such element exists, ceiling() returns null.
        Integer greaterOrEqual1 = greenSet.ceiling(givenElement1);

        // Print the result.
        System.out.println("Element greater than or equal to " + givenElement1 + ": " + greaterOrEqual1);

        // More examples:
        int givenElement2 = 20;
        Integer greaterOrEqual2 = greenSet.ceiling(givenElement2);
        System.out.println("Element greater than or equal to " + givenElement2 + ": " + greaterOrEqual2);

        int givenElement3 = 60; 
        Integer greaterOrEqual3 = greenSet.ceiling(givenElement3);
        System.out.println("Element greater than or equal to " + givenElement3 + ": " + greaterOrEqual3);

        int givenElement4 = 5;  
        Integer greaterOrEqual4 = greenSet.ceiling(givenElement4);
        System.out.println("Element greater than or equal to " + givenElement4 + ": " + greaterOrEqual4);

    }
}
