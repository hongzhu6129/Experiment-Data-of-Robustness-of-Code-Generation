import java.util.TreeSet;

public class AddTreeSetElements {

    public static void main(String[] args) {
        // Create the green TreeSet (you can change the elements as needed)
        TreeSet<String> greenSet = new TreeSet<>();
        greenSet.add("Lime");
        greenSet.add("Emerald");
        greenSet.add("Olive");
        greenSet.add("Seafoam");

        // Create the other TreeSet (you can also change the elements)
        TreeSet<String> otherTreeSet = new TreeSet<>();
        otherTreeSet.add("Red");
        otherTreeSet.add("Blue");
        otherTreeSet.add("Yellow");


        // Add all elements from greenSet to otherTreeSet
        otherTreeSet.addAll(greenSet);

        // Print the updated otherTreeSet
        System.out.println("Updated TreeSet: " + otherTreeSet); 
    }
}
