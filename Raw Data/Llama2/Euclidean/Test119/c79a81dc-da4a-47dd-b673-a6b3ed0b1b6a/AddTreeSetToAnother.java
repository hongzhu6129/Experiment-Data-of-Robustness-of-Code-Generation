import java.util.TreeSet;

public class AddTreeSetToAnother {

    public static void main(String[] args) {
        // Create the first TreeSet (source)
        TreeSet<String> treeSet1 = new TreeSet<>();
        treeSet1.add("Red");
        treeSet1.add("Green");
        treeSet1.add("Blue");

        // Create the second TreeSet (destination - specifically named "greenSet" as requested)
        TreeSet<String> greenSet = new TreeSet<>();
        greenSet.add("Yellow");
        greenSet.add("Orange");


        // Add all elements from treeSet1 to greenSet
        greenSet.addAll(treeSet1);


        // Print the updated greenSet
        System.out.println("Green Set after adding elements: " + greenSet); 
    }
}
