import java.util.LinkedList;

public class InsertAtFrontLinkedList {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> days = new LinkedList<>();

        // Add some initial elements (optional)
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");

        // Element to insert at the front
        String newDay = "Monday";

        // Insert the element at the front
        days.addFirst(newDay);

        // Print the updated LinkedList
        System.out.println("Updated LinkedList: " + days);
    }
}
