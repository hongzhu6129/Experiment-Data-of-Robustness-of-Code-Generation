import java.util.HashSet;

public class AppendToHashSet {

    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> hashSet = new HashSet<>();

        // Add some initial elements
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");

        // Element to append
        String elementToAppend = "Grape";

        // Append the element.  HashSet's add() method effectively appends if the element isn't already present.
        hashSet.add(elementToAppend);


        // Print the updated HashSet � demonstrating the appended element
        System.out.println("Updated HashSet: " + hashSet);


        // Example with an Integer HashSet
         HashSet<Integer> numbers = new HashSet<>();
         numbers.add(10);
         numbers.add(20);
         numbers.add(30);

         int numberToAppend = 40;
         numbers.add(numberToAppend);

         System.out.println("Updated Integer HashSet: " + numbers);



    }
}
