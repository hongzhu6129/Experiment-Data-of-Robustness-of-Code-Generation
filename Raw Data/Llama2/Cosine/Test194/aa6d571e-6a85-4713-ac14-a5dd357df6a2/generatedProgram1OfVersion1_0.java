import java.util.TreeSet;

public class TreeSetGreaterOrEqual {

    public static void main(String[] args) {
        // Example usage:
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);

        int givenElement = 25;

        Integer greaterOrEqualElement = treeSet.ceiling(givenElement);


        if (greaterOrEqualElement != null) {
            System.out.println("Element greater than or equal to " + givenElement + ": " + greaterOrEqualElement);
        } else {
            System.out.println("No element greater than or equal to " + givenElement + " found.");
        }


         givenElement = 20; // Example with element present
        greaterOrEqualElement = treeSet.ceiling(givenElement);

        if (greaterOrEqualElement != null) {
             System.out.println("Element greater than or equal to " + givenElement + ": " + greaterOrEqualElement);
         } else {
             System.out.println("No element greater than or equal to " + givenElement + " found.");
         }

        givenElement = 60; // Example with no larger element

         greaterOrEqualElement = treeSet.ceiling(givenElement);

        if (greaterOrEqualElement != null) {
             System.out.println("Element greater than or equal to " + givenElement + ": " + greaterOrEqualElement);
         } else {
             System.out.println("No element greater than or equal to " + givenElement + " found.");
         }
    }
}
