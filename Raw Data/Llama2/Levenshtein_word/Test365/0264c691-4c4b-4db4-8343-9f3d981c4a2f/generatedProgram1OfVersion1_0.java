import java.util.TreeSet;

public class GreaterOrEqualInTree {

    public static void main(String[] args) {
        // Example usage:
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);

        int element = 25;

        Integer greaterOrEqualElement = treeSet.ceiling(element); 

        if (greaterOrEqualElement != null) {
            System.out.println("The element greater than or equal to " + element + " is: " + greaterOrEqualElement);
        } else {
            System.out.println("No element greater than or equal to " + element + " found in the tree.");
        }



        element = 15; //Another example
        greaterOrEqualElement = treeSet.ceiling(element);

        if (greaterOrEqualElement != null) {
            System.out.println("The element greater than or equal to " + element + " is: " + greaterOrEqualElement);
        } else {
            System.out.println("No element greater than or equal to " + element + " found in the tree.");
        }


         element = 60; // Another example where no element is greater or equal.
        greaterOrEqualElement = treeSet.ceiling(element);

        if (greaterOrEqualElement != null) {
            System.out.println("The element greater than or equal to " + element + " is: " + greaterOrEqualElement);
        } else {
            System.out.println("No element greater than or equal to " + element + " found in the tree.");
        }
    }
}
