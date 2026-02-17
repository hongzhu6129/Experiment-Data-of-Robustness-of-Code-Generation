import java.util.TreeSet;

public class TreeSetFloor {

    public static void main(String[] args) {
        // Create a TreeSet and populate it with some elements.
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);


        // Example 1: Element present in the TreeSet
        int element1 = 30;
        Integer floor1 = treeSet.floor(element1); 
        System.out.println("Floor of " + element1 + ": " + floor1); // Output: 30


        // Example 2: Element not present, but a smaller element exists
        int element2 = 35;
        Integer floor2 = treeSet.floor(element2);
        System.out.println("Floor of " + element2 + ": " + floor2); // Output: 30


        // Example 3: Element smaller than all elements in the TreeSet
        int element3 = 5;
        Integer floor3 = treeSet.floor(element3);
        System.out.println("Floor of " + element3 + ": " + floor3); // Output: null (no smaller element)



        // Example with a different data type (String)
        TreeSet<String> stringTreeSet = new TreeSet<>();
        stringTreeSet.add("apple");
        stringTreeSet.add("banana");
        stringTreeSet.add("orange");

        String element4 = "grape";
        String floor4 = stringTreeSet.floor(element4);
        System.out.println("Floor of " + element4 + ": " + floor4); // Output: banana



        // Example with an empty TreeSet
         TreeSet<Integer> emptyTreeSet = new TreeSet<>();
         Integer floor5 = emptyTreeSet.floor(10);
         System.out.println("Floor of 10 in an empty set: " + floor5); // Output: null

    }
}
