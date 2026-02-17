import java.util.TreeSet;

public class AddTreeSetToAnother {

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

        // Add all elements of treeSet1 to treeSet2
        treeSet2.addAll(treeSet1);

        // Print the updated treeSet2
        System.out.println("TreeSet2 after adding elements from TreeSet1: " + treeSet2);


        // Example with Integer TreeSet
        TreeSet<Integer> numbers1 = new TreeSet<>();
        numbers1.add(10);
        numbers1.add(5);
        numbers1.add(20);

        TreeSet<Integer> numbers2 = new TreeSet<>();
        numbers2.add(15);
        numbers2.add(25);

        numbers2.addAll(numbers1);
        System.out.println("Numbers2 after adding elements from Numbers1: " + numbers2);
    }
}
