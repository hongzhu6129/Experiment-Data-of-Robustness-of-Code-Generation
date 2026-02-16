import java.util.TreeSet;

public class TreeSetCeiling {

    public static void main(String[] args) {
        // Create a TreeSet and add some elements
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(10);
        treeSet.add(20);
        treeSet.add(30);
        treeSet.add(40);
        treeSet.add(50);

        // Get the element greater than or equal to 25
        Integer ceiling1 = treeSet.ceiling(25); 
        System.out.println("Ceiling of 25: " + ceiling1); // Output: 30

        // Get the element greater than or equal to 10 (element present in the set)
        Integer ceiling2 = treeSet.ceiling(10);
        System.out.println("Ceiling of 10: " + ceiling2); // Output: 10


        // Get the element greater than or equal to 60 (element larger than all elements in the set)
        Integer ceiling3 = treeSet.ceiling(60);
        System.out.println("Ceiling of 60: " + ceiling3); // Output: null (no element greater than or equal to 60)


        //Example with strings
        TreeSet<String> stringTreeSet = new TreeSet<>();
        stringTreeSet.add("apple");
        stringTreeSet.add("banana");
        stringTreeSet.add("orange");

        String ceiling4 = stringTreeSet.ceiling("apricot");
        System.out.println("Ceiling of apricot: " + ceiling4); // Output: banana


        String ceiling5 = stringTreeSet.ceiling("apple");
        System.out.println("Ceiling of apple: " + ceiling5); // Output: apple


        String ceiling6 = stringTreeSet.ceiling("zebra");
        System.out.println("Ceiling of zebra: " + ceiling6); // Output: null
    }
}
