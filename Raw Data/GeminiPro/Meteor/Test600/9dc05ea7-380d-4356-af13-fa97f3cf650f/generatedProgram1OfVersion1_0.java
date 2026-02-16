import java.util.LinkedList;

public class CheckLinkedListEmpty {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> names = new LinkedList<>();

        // Check if the LinkedList is empty using isEmpty()
        if (names.isEmpty()) {
            System.out.println("The LinkedList is empty.");
        } else {
            System.out.println("The LinkedList is not empty.");
        }


        // Add some names to the LinkedList
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Check again if the LinkedList is empty
        if (names.isEmpty()) {
            System.out.println("The LinkedList is empty.");
        } else {
            System.out.println("The LinkedList is not empty.");
        }


         // An alternative way to check (using size()):
        if (names.size() == 0) {
            System.out.println("The LinkedList is empty (using size()).");
        } else {
            System.out.println("The LinkedList is not empty (using size()).");
        }
    }
}
