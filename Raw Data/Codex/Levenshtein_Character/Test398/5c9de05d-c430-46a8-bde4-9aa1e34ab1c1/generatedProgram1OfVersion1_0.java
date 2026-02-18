import java.util.TreeSet;

public class AddTreeSetToAnother {

    public static void main(String[] args) {
        // Create the first TreeSet (source)
        TreeSet<String> treeSet1 = new TreeSet<>();
        treeSet1.add("Red");
        treeSet1.add("Green");
        treeSet1.add("Blue");

        // Create the second TreeSet (destination - I assume "green set" was a typo for a general set)
        TreeSet<String> treeSet2 = new TreeSet<>();
        treeSet2.add("Yellow");
        treeSet2.add("Orange");


        // Add all elements from treeSet1 to treeSet2
        treeSet2.addAll(treeSet1);

        // Print the updated treeSet2
        System.out.println("TreeSet2 after adding elements from TreeSet1: " + treeSet2);


        //Example with Integers
        TreeSet<Integer> numbers1 = new TreeSet<>();
        numbers1.add(5);
        numbers1.add(2);
        numbers1.add(8);

        TreeSet<Integer> numbers2 = new TreeSet<>();
        numbers2.add(1);
        numbers2.add(9);

        numbers2.addAll(numbers1);
        System.out.println("Numbers2 after adding elements from Numbers1: " + numbers2);

    }
}
