import java.util.TreeSet;

public class AddTreeSetToAnother {

    public static void main(String[] args) {
        // Create the first TreeSet (source TreeSet)
        TreeSet<String> treeSet1 = new TreeSet<>();
        treeSet1.add("Apple");
        treeSet1.add("Banana");
        treeSet1.add("Orange");

        // Create the second TreeSet (destination TreeSet)
        TreeSet<String> treeSet2 = new TreeSet<>();
        treeSet2.add("Grape");
        treeSet2.add("Mango");

        // Add all elements from treeSet1 to treeSet2
        treeSet2.addAll(treeSet1);


        // Print the combined TreeSet (treeSet2)
        System.out.println("Combined TreeSet: " + treeSet2); 
    }
}
