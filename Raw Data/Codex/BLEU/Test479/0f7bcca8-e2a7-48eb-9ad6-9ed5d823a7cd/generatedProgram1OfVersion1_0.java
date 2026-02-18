import java.util.HashSet;
import java.util.TreeSet;

public class HashSetToTreeSet {

    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Banana");
        hashSet.add("Apple");
        hashSet.add("Orange");
        hashSet.add("Grape");

        // Convert the HashSet to a TreeSet
        TreeSet<String> treeSet = new TreeSet<>(hashSet); 

        // Print the TreeSet (elements will be sorted)
        System.out.println("TreeSet: " + treeSet);


        //Example with Integers:
         HashSet<Integer> hashSetInt = new HashSet<>();
        hashSetInt.add(5);
        hashSetInt.add(1);
        hashSetInt.add(10);
        hashSetInt.add(2);

        TreeSet<Integer> treeSetInt = new TreeSet<>(hashSetInt);
        System.out.println("TreeSet of Integers: " + treeSetInt);


    }
}
