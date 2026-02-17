import java.util.ArrayList;
import java.util.List;

public class StepArrayList {

    public static void main(String[] args) {
        // Example usage:
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);


        int step = 3;  // Step size

        System.out.println("Original ArrayList: " + numbers);
        System.out.println("Stepped ArrayList (step " + step + "): " + stepArrayList(numbers, step));

         numbers = new ArrayList<>(); // Demonstrating with an empty list
        System.out.println("Original ArrayList (empty): " + numbers);
        System.out.println("Stepped ArrayList (step " + step + "): " + stepArrayList(numbers, step));


        numbers.add(1); // Demonstrating with a list with one element
        System.out.println("Original ArrayList (one element): " + numbers);
        System.out.println("Stepped ArrayList (step " + step + "): " + stepArrayList(numbers, step));


        numbers.add(2);
        step = 1;  // Step size of 1
        System.out.println("Original ArrayList: " + numbers);
        System.out.println("Stepped ArrayList (step " + step + "): " + stepArrayList(numbers, step));


         numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8); // Immutable list example (Java 9+) - will return original list
        step = 2;
        System.out.println("Original List (immutable): " + numbers);
        System.out.println("Stepped List (step " + step + "): " + stepArrayList(numbers, step));
    }

    public static <T> List<T> stepArrayList(List<T> list, int step) {
        if (list == null || list.isEmpty() || step <= 0) {
            return new ArrayList<>(list); // Return copy to avoid modifying original if it's mutable.
        }
        
         if (step == 1) {
             return new ArrayList<>(list); //Return a copy since the original might be immutable.
         }

        List<T> steppedList = new ArrayList<>();
        for (int i = 0; i < list.size(); i += step) {
            steppedList.add(list.get(i));
        }
        return steppedList;
    }
}
