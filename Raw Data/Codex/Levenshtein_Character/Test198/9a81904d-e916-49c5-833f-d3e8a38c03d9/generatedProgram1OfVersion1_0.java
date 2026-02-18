import java.util.ArrayList;
import java.util.List;

public class InsertAtFirst {

    public static void main(String[] args) {
        // Create an ArrayList of strings (e.g., representing days of the week)
        List<String> days = new ArrayList<>();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");

        // Element to insert at the beginning
        String newDay = "Sunday";

        // Insert the new element at the first position (index 0)
        days.add(0, newDay);  // add() method with index inserts at a specific position

        // Print the updated ArrayList
        System.out.println(days); 
    }
}
