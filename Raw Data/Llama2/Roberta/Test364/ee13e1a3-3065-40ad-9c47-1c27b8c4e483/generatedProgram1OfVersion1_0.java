import java.util.TreeSet;

public class TreeSetLower {

    public static void main(String[] args) {
        // Create a TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Add elements to the TreeSet (order doesn't matter, it will be sorted automatically)
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);


        // Example usages:

        // 1. Find the element less than or equal to 35
        Integer element1 = treeSet.floor(35); 
        System.out.println("Element less than or equal to 35: " + element1); // Output: 30

        // 2. Find the element less than or equal to 20 (which exists in the set)
        Integer element2 = treeSet.floor(20);
        System.out.println("Element less than or equal to 20: " + element2); // Output: 20

        // 3. Find the element less than or equal to 5 (which is smaller than all elements)
        Integer element3 = treeSet.floor(5);
        System.out.println("Element less than or equal to 5: " + element3); // Output: null (no smaller element)

        // 4. Find the element less than or equal to 60 (which is larger than all elements)
        Integer element4 = treeSet.floor(60);
        System.out.println("Element less than or equal to 60: " + element4); // Output: 50 (largest element)



        // Example with other data types (String):
        TreeSet<String> stringTreeSet = new TreeSet<>();
        stringTreeSet.add("apple");
        stringTreeSet.add("banana");
        stringTreeSet.add("cherry");
        stringTreeSet.add("date");

        String strElement = stringTreeSet.floor("cranberry");
        System.out.println("String less than or equal to cranberry: " + strElement); // Output: banana


    }
}
