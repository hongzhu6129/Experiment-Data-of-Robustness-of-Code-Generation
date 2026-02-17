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


        int element1 = 25;
        Integer greaterOrEqual1 = treeSet.ceiling(element1);
        System.out.println("Element greater than or equal to " + element1 + ": " + greaterOrEqual1); // Output: 30

        int element2 = 30;
        Integer greaterOrEqual2 = treeSet.ceiling(element2);
        System.out.println("Element greater than or equal to " + element2 + ": " + greaterOrEqual2); // Output: 30


        int element3 = 55; // Element greater than any in the set
        Integer greaterOrEqual3 = treeSet.ceiling(element3);
        System.out.println("Element greater than or equal to " + element3 + ": " + greaterOrEqual3); // Output: null (no such element)


        // Example with strings:
        TreeSet<String> stringTreeSet = new TreeSet<>();
        stringTreeSet.add("apple");
        stringTreeSet.add("banana");
        stringTreeSet.add("cherry");
        stringTreeSet.add("date");

        String strElement = "blueberry";
        String greaterOrEqualStr = stringTreeSet.ceiling(strElement);
        System.out.println("String greater than or equal to " + strElement + ": " + greaterOrEqualStr); // Output: cherry
    }
}
