import java.util.*;

public class RemoveDuplicates {

    public static void main(String[] args) {
        // Create a list of strings
        List<String> inputList = new ArrayList<>();
        inputList.add("Apple");
        inputList.add("Banana");
        inputList.add("Orange");
        inputList.add("Apple"); // Duplicate
        inputList.add("Grape");
        inputList.add("Orange"); // Duplicate

        // Create a new list to store the unique strings
        List<String> uniqueList = new ArrayList<>();

        // Iterate over the input list
        for (String str : inputList) {
            // Check if the string is already in the unique list
            if (!uniqueList.contains(str)) {
                // If not, add it to the unique list
                uniqueList.add(str);
            }
        }

        // Print the unique list
        System.out.println(uniqueList);
    }
}
