import java.util.HashMap;
import java.util.Map;

public class CheckValueInMap {

    public static void main(String[] args) {

        // Create a sample map
        Map<String, Integer> studentScores = new HashMap<>();
        studentScores.put("Alice", 90);
        studentScores.put("Bob", 85);
        studentScores.put("Charlie", 95);

        // Value to search for
        int targetScore = 85;

        // Method 1: Using containsValue() -  most direct approach
        boolean containsValue = studentScores.containsValue(targetScore);
        System.out.println("Does the map contain the value " + targetScore + "? (using containsValue()): " + containsValue);

        // Method 2: Iterating and checking - illustrative for learning
        boolean found = false;
        for (int value : studentScores.values()) {
            if (value == targetScore) {
                found = true;
                break; // Exit the loop once the value is found
            }
        }
        System.out.println("Does the map contain the value " + targetScore + "? (using iteration): " + found);



        //  Example with a value that's NOT in the map
        targetScore = 100;
        containsValue = studentScores.containsValue(targetScore);
        System.out.println("Does the map contain the value " + targetScore + "? (using containsValue()): " + containsValue);


        // Important Note about containsValue() with different data types:
        Map<String, Double> studentGPAs = new HashMap<>();
        studentGPAs.put("Alice", 3.8);
        studentGPAs.put("Bob", 3.5);

        // Be cautious when using containsValue with floating-point types like Double
        // due to potential precision issues. Direct comparison might not be reliable.
        double targetGPA = 3.5;
        boolean containsGPA = studentGPAs.containsValue(targetGPA);
        System.out.println("Does the map contain the GPA " + targetGPA + "? " + containsGPA); // This will likely work


        double slightlyOffGPA = 3.5000000001; // A very slightly different value
        boolean containsSlightlyOffGPA = studentGPAs.containsValue(slightlyOffGPA);
        System.out.println("Does the map contain the slightly different GPA? " + containsSlightlyOffGPA); // Likely false



    }
}
