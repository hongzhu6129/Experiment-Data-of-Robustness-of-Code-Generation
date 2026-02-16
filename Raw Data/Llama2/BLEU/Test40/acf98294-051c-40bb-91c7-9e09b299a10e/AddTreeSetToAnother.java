import java.util.TreeSet;

public class AddTreeSetToAnother {

    public static void main(String[] args) {
        // Create the first TreeSet (source)
        TreeSet<String> treeSet1 = new TreeSet<>();
        treeSet1.add("Apple");
        treeSet1.add("Banana");
        treeSet1.add("Orange");

        // Create the second TreeSet (destination)
        TreeSet<String> treeSet2 = new TreeSet<>();
        treeSet2.add("Grape");
        treeSet2.add("Mango");

        // Add all elements from treeSet1 to treeSet2
        treeSet2.addAll(treeSet1);


        // Print the updated treeSet2
        System.out.println("TreeSet 2 after adding elements from TreeSet 1: " + treeSet2);


         // Example with Integer TreeSet
        TreeSet<Integer> numbers1 = new TreeSet<>();
        numbers1.add(10);
        numbers1.add(5);
        numbers1.add(15);

        TreeSet<Integer> numbers2 = new TreeSet<>();
        numbers2.add(20);
        numbers2.add(25);

        numbers2.addAll(numbers1);

        System.out.println("Numbers2 TreeSet after adding elements from Numbers1: " + numbers2);


    }
}
