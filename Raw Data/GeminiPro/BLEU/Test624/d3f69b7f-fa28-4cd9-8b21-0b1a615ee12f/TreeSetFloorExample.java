import java.util.TreeSet;

public class TreeSetFloorExample {

    public static void main(String[] args) {
        // Create a TreeSet and populate it with some elements
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);

        // Example 1: Element present in the TreeSet
        int element1 = 30;
        Integer floor1 = treeSet.floor(element1);
        System.out.println("Floor of " + element1 + ": " + floor1); // Output: 30 (because 30 is present)

        // Example 2: Element not present, but a smaller element exists
        int element2 = 35;
        Integer floor2 = treeSet.floor(element2);
        System.out.println("Floor of " + element2 + ": " + floor2); // Output: 30 (largest element <= 35)


        // Example 3: Element smaller than the smallest element in the TreeSet
        int element3 = 5;
        Integer floor3 = treeSet.floor(element3);
        System.out.println("Floor of " + element3 + ": " + floor3); // Output: null (no element <= 5)

        // Example 4:  Using a different data type (String)
        TreeSet<String> stringTreeSet = new TreeSet<>();
        stringTreeSet.add("apple");
        stringTreeSet.add("banana");
        stringTreeSet.add("orange");
        stringTreeSet.add("pear");

        String element4 = "mango";
        String floor4 = stringTreeSet.floor(element4);
        System.out.println("Floor of \"" + element4 + "\": " + floor4);  // Output: orange (lexicographically largest <= mango)

          String element5 = "apricot"; // lexicographically comes before "apple"
        String floor5 = stringTreeSet.floor(element5);
        System.out.println("Floor of \"" + element5 + "\": " + floor5);  // Output: null


        //Important Note about null:
        //TreeSets don't allow null (unless it's a TreeSet of specifically nullable types). 
        //Attempting to add null will usually result in a NullPointerException.



    }
}
