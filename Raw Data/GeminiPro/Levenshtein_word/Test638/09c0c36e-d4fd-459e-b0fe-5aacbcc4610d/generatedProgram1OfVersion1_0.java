import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveFirstElement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> elements = new ArrayList<>();

        System.out.println("Enter elements (enter 'done' to finish):");

        while (true) {
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            elements.add(input);
        }


        if (elements.isEmpty()) {
            System.out.println("List is empty. No element to remove.");
        } else {
            String removedElement = elements.remove(0); // Remove and retrieve the first element
            System.out.println("Removed element: " + removedElement);


            System.out.println("Updated list:");
            if (elements.isEmpty()) {
                System.out.println("List is now empty.");
            } else {
                for (String element : elements) {
                    System.out.println(element);
                }
            }

        }

        scanner.close(); 
    }
}
