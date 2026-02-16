import java.util.LinkedList;

public class LinkedListInsertion {

    public static void main(String[] args) {
        // Create a LinkedList of Strings
        LinkedList<String> forms = new LinkedList<>();

        // Insert at the beginning (first position)
        forms.addFirst("Form A");
        forms.addFirst("Form B"); // New first element

        // Insert at the end (last position)
        forms.addLast("Form C");
        forms.addLast("Form D"); // New last element


        // Print the LinkedList to verify the insertions
        System.out.println(forms); // Output: [Form B, Form A, Form C, Form D]
    }
}
