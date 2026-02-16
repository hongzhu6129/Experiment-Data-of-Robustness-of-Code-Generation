import java.util.TreeSet;

public class FindCeilingInTree {

    public static void main(String[] args) {
        // Example usage:
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);

        int target1 = 25;
        Integer ceiling1 = treeSet.ceiling(target1);
        System.out.println("Ceiling of " + target1 + ": " + ceiling1); // Output: 30

        int target2 = 15;
        Integer ceiling2 = treeSet.ceiling(target2);
        System.out.println("Ceiling of " + target2 + ": " + ceiling2); // Output: 20


        int target3 = 5;
        Integer ceiling3 = treeSet.ceiling(target3);
        System.out.println("Ceiling of " + target3 + ": " + ceiling3); // Output: 10

        int target4 = 60;
        Integer ceiling4 = treeSet.ceiling(target4);
        System.out.println("Ceiling of " + target4 + ": " + ceiling4); // Output: null (no element greater than or equal to 60)


         // Demonstrating with other data types (e.g., String)
        TreeSet<String> stringTreeSet = new TreeSet<>();
        stringTreeSet.add("apple");
        stringTreeSet.add("banana");
        stringTreeSet.add("orange");

        String targetString = "apricot";
        String ceilingString = stringTreeSet.ceiling(targetString);
        System.out.println("Ceiling of " + targetString + ": " + ceilingString); // Output: banana

    }
}
