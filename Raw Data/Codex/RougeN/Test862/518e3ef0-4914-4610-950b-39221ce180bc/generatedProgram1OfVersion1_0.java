import java.util.LinkedList;

public class LinkedListInsertion {

    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> militaryUnits = new LinkedList<>();

        // Insert elements at the beginning (first)
        militaryUnits.addFirst("Alpha Squad");
        militaryUnits.addFirst("Bravo Company");

        // Insert elements at the end (last)
        militaryUnits.addLast("Charlie Platoon");
        militaryUnits.addLast("Delta Team");


        // Print the LinkedList to verify the insertions
        System.out.println(militaryUnits); 
    }
}
