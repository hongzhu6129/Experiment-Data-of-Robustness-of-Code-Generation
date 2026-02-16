import java.util.TreeSet;

public class MixTreeSet {

    public static void main(String[] args) {
        // Create the first TreeSet
        TreeSet<String> treeSet1 = new TreeSet<>();
        treeSet1.add("Red");
        treeSet1.add("Green");
        treeSet1.add("Blue");

        // Create the second TreeSet
        TreeSet<String> treeSet2 = new TreeSet<>();
        treeSet2.add("Yellow");
        treeSet2.add("Orange");


        // Mix elements from treeSet1 to treeSet2
        treeSet2.addAll(treeSet1); //addAll maintains the sorted property of the TreeSet


        // Print the mixed TreeSet (treeSet2)
        System.out.println("Mixed TreeSet: " + treeSet2); 
    }
}
