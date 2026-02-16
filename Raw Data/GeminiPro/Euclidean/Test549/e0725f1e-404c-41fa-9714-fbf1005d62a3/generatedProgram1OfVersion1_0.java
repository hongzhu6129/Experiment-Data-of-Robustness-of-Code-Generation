import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReadFileToArray {

    public static void main(String[] args) {
        String filePath = "shopping_list.txt"; // Replace with your file path
        String[] shoppingListArray = readFileToArray(filePath);

        if (shoppingListArray != null) {
            System.out.println("Shopping List:");
            for (String item : shoppingListArray) {
                System.out.println(item);
            }
        } else {
            System.err.println("Error reading the file.");
        }
    }

    private static String[] readFileToArray(String filePath) {
        List<String> shoppingList = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                shoppingList.add(line.trim()); // Trim whitespace from each line
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
            return null; // Indicate an error
        }


        return shoppingList.toArray(new String[0]); // Convert List to array
    }
}

