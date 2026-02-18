import java.util.ArrayList;
import java.util.List;

public class EmptyArrayList {

    public static void main(String[] args) {
        // Create an ArrayList
        List<String> arrayList = new ArrayList<>();

        // Add some elements to the ArrayList
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");

        System.out.println("Original ArrayList: " + arrayList);

        // Empty the ArrayList using the clear() method
        arrayList.clear();

        System.out.println("ArrayList after clearing: " + arrayList);


        // Alternative: Create a new empty ArrayList (less efficient if you want to keep the same reference)
        arrayList = new ArrayList<>(); // This creates a brand new ArrayList object

        System.out.println("ArrayList after creating a new empty one : " + arrayList);

    }
}
