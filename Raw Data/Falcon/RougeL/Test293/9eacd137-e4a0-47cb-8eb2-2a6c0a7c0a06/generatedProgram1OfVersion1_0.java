import java.util.ArrayList;

public class PrintArrayListElementsWithPosition {

    public static void main(String[] args) {
        // Create an ArrayList of strings
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");
        fruits.add("Grape");

        // Print elements with their positions
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println("Element at position " + i + ": " + fruits.get(i));
        }

       // Alternative using enhanced for loop with a separate index counter
        int index = 0;
        for (String fruit : fruits) {
            System.out.println("Element at position " + index + ": " + fruit);
            index++;
        }

    }
}
