import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetToTreeSet {

    public static void main(String[] args) {
        // Create a HashSet
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Grape");

        // Convert HashSet to TreeSet (natural ordering)
        Set<String> treeSet = new TreeSet<>(hashSet); 

        // Print the TreeSet (elements will be sorted)
        System.out.println("TreeSet: " + treeSet);


        // Example with integers (demonstrates sorting)
        Set<Integer> integerHashSet = new HashSet<>();
        integerHashSet.add(5);
        integerHashSet.add(2);
        integerHashSet.add(8);
        integerHashSet.add(1);

        Set<Integer> integerTreeSet = new TreeSet<>(integerHashSet);
        System.out.println("Integer TreeSet: " + integerTreeSet);



        // Example using a custom Comparator (for more complex sorting)
        //  TreeSet<String> customTreeSet = new TreeSet<>(String::compareToIgnoreCase); //case-insensitive example
        //  customTreeSet.addAll(hashSet);
        //  System.out.println("Custom TreeSet: "+customTreeSet);


    }
}
