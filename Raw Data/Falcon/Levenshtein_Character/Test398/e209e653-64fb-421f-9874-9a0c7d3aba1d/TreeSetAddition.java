import java.util.TreeSet;

public class TreeSetAddition {

    public static void main(String[] args) {
        // Create two TreeSets
        TreeSet<Integer> treeSet1 = new TreeSet<>();
        TreeSet<Integer> treeSet2 = new TreeSet<>();

        // Add elements to the first TreeSet
        treeSet1.add(10);
        treeSet1.add(20);
        treeSet1.add(30);
        treeSet1.add(40);
        treeSet1.add(50);


        // Add elements to the second TreeSet
        treeSet2.add(60);
        treeSet2.add(70);
        treeSet2.add(80);
        treeSet2.add(90);
        treeSet2.add(100);

        // Add all elements of treeSet2 to treeSet1
        treeSet1.addAll(treeSet2);


        // Print the updated TreeSet
        System.out.println("TreeSet after adding all elements: " + treeSet1);


        // Example with different data types (String)

        TreeSet<String> stringTreeSet1 = new TreeSet<>();
        TreeSet<String> stringTreeSet2 = new TreeSet<>();

        stringTreeSet1.add("Apple");
        stringTreeSet1.add("Banana");

        stringTreeSet2.add("Cherry");
        stringTreeSet2.add("Date");

        stringTreeSet1.addAll(stringTreeSet2);
        System.out.println("String TreeSet after adding all elements: " + stringTreeSet1);

    }
}
