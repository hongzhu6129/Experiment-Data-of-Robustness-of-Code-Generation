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

        int element = 25;

        Integer greaterOrEqualElement = treeSet.ceiling(element);

        if (greaterOrEqualElement != null) {
            System.out.println("Element greater than or equal to " + element + ": " + greaterOrEqualElement);
        } else {
            System.out.println("No element greater than or equal to " + element + " found in the TreeSet.");
        }



         element = 20; // Example with an element present in the set.
         greaterOrEqualElement = treeSet.ceiling(element);
        if (greaterOrEqualElement != null) {
            System.out.println("Element greater than or equal to " + element + ": " + greaterOrEqualElement);
        } else {
            System.out.println("No element greater than or equal to " + element + " found in the TreeSet.");
        }


        element = 60;  // Example with an element greater than all in the set
        greaterOrEqualElement = treeSet.ceiling(element);
        if (greaterOrEqualElement != null) {
            System.out.println("Element greater than or equal to " + element + ": " + greaterOrEqualElement);
        } else {
            System.out.println("No element greater than or equal to " + element + " found in the TreeSet.");
        }
    }
}
