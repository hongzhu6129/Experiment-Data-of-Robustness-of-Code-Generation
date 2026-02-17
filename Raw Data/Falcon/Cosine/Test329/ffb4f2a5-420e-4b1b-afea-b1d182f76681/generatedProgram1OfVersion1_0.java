import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ShoppingListToArray {

    public static void main(String[] args) {
        String filePath = "shopping_list.txt"; // Replace with your file path
        String[] shoppingArray = readShoppingListToArray(filePath);

        if (shoppingArray != null) {
            System.out.println("Shopping List Array:");
            System.out.println(Arrays.toString(shoppingArray)); 
        }
    }


    private static String[] readShoppingListToArray(String filePath) {
        List<String> shoppingList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                shoppingList.add(line.trim()); // Remove leading/trailing whitespace
            }

        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            return null; // Indicate an error
        }

        // Convert List<String> to String[]
        return shoppingList.toArray(new String[0]);
    }
}
