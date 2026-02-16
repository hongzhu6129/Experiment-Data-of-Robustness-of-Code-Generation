import java.util.TreeSet;

public class TreeSetFloor {

    public static void main(String[] args) {
        // Create a TreeSet of Integer
        TreeSet<Integer> numbers = new TreeSet<>();

        // Add elements to the TreeSet
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Element to find the floor for
        int element = 35;

        // Find the floor of the element
        Integer floor = numbers.floor(element);

        // Print the floor element
        if (floor != null) {
            System.out.println("The floor of " + element + " is: " + floor);
        } else {
            System.out.println("There is no element less than or equal to " + element + " in the TreeSet.");
        }


        // Example with another value where no lower value exists
        element = 5;
        floor = numbers.floor(element);
        if (floor != null) {
            System.out.println("The floor of " + element + " is: " + floor);
        } else {
            System.out.println("There is no element less than or equal to " + element + " in the TreeSet.");
        }


        //Example with String TreeSet
         TreeSet<String> strings = new TreeSet<>();
         strings.add("apple");
         strings.add("banana");
         strings.add("orange");
         String strElement = "grape";

         String strFloor = strings.floor(strElement);
         if (strFloor != null) {
             System.out.println("The floor of \"" + strElement + "\" is: \"" + strFloor + "\"");
         } else {
             System.out.println("There is no element less than or equal to \"" + strElement + "\" in the TreeSet.");
         }



    }
}
