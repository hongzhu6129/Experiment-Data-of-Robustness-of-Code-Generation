import java.util.LinkedList;

public class RemoveFirstElement {

    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> languages = new LinkedList<>();

        // Add elements to the LinkedList
        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("JavaScript");

        // Print the original LinkedList
        System.out.println("Original LinkedList: " + languages);

        // Check if the list is empty before attempting to remove
        if (!languages.isEmpty()) {
            // Retrieve and remove the first element using poll()
            String firstElement = languages.poll(); 

            // Print the removed element
            System.out.println("Removed element: " + firstElement);

            // Print the updated LinkedList
            System.out.println("Updated LinkedList: " + languages);
        } else {
            System.out.println("The LinkedList is empty.");
        }


        //Example using removeFirst() (alternative, throws exception if empty)
         LinkedList<String> frameworks = new LinkedList<>();
        frameworks.add("Spring");
        frameworks.add("React");

        System.out.println("\nOriginal Frameworks LinkedList: " + frameworks);
        try{
            String firstFramework = frameworks.removeFirst(); // Throws NoSuchElementException if empty
            System.out.println("Removed Framework: "+ firstFramework);
            System.out.println("Updated Frameworks LinkedList: "+ frameworks);
        } catch (java.util.NoSuchElementException e) {
            System.out.println("Cannot remove from an empty LinkedList.");
        }


    }
}
