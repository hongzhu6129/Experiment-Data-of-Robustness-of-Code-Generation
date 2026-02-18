import java.util.Arrays;

public class InsertElement {

    public static void main(String[] args) {
        // Sample array (you can modify this)
        String[] names = {"Bob", "Alice", "Charlie", "David"};

        // Element to insert at the beginning
        String newElement = "Eve";

        // Create a new array with one extra slot
        String[] newNames = new String[names.length + 1];

        // Insert the new element at the first position
        newNames[0] = newElement;

        // Copy the existing elements to the new array, starting from the second position
        System.arraycopy(names, 0, newNames, 1, names.length);


        // Print the updated array
        System.out.println("Updated array: " + Arrays.toString(newNames)); 
    }
}
