import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListMilitaryTime {

    public static void main(String[] args) {
        // Create a LinkedList of strings (representing elements)
        LinkedList<String> elements = new LinkedList<>();

        // Add some sample elements
        elements.add("Alpha");
        elements.add("Bravo");
        elements.add("Charlie");
        elements.add("Delta");
        elements.add("Echo");


        // Display elements with their "military time" (index as if starting from 0000)
        ListIterator<String> iterator = elements.listIterator();
        while (iterator.hasNext()) {
            int index = iterator.nextIndex();
            String element = iterator.next();
            String formattedIndex = String.format("%04d", index); // Format index with leading zeros

            System.out.println(formattedIndex + ": " + element);
        }



    }
}
