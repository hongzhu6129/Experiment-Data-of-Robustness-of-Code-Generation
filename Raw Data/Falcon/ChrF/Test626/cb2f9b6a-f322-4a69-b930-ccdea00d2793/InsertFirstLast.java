import java.util.LinkedList;
import java.util.List;

public class InsertFirstLast {

    public static void main(String[] args) {
        // Create a LinkedList
        List<String> list = new LinkedList<>();

        // Insert elements at the beginning
        list.add(0, "Apple"); // Inserts "Apple" at index 0 (beginning)
        list.add(0, "Banana"); // Inserts "Banana" at index 0 (beginning), shifting "Apple"

        // Insert elements at the end
        list.add("Orange");  // Appends "Orange" to the end
        list.add("Grape"); // Appends "Grape" to the end


        // Print the list to verify
        System.out.println(list); // Output: [Banana, Apple, Orange, Grape]


        //Another more concise example
        List<Integer> numbers = new LinkedList<>();

        numbers.add(0,1);
        numbers.add(0,2);
        numbers.add(3);
        numbers.add(4);
        System.out.println(numbers); //output [2,1,3,4]


    }
}
