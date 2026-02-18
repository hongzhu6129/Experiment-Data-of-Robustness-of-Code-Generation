import java.util.ArrayList;
import java.util.Collections;

public class SwapArrayList {

    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println("Original ArrayList: " + numbers);

        // Swap elements at index 1 and 3
        int index1 = 1;
        int index2 = 3;
        swapElements(numbers, index1, index2);

        System.out.println("ArrayList after swapping: " + numbers);


        // Example with potential IndexOutOfBoundsException:
        ArrayList<String> strings = new ArrayList<>();
        strings.add("A");
        strings.add("B");


         try {
            swapElementsString(strings, 0, 2); // Trying to access index 2 which is out of bounds
         } catch (IndexOutOfBoundsException e) {
              System.err.println("Caught IndexOutOfBoundsException: " + e.getMessage());
         }
           System.out.println("ArrayList after attempted out of bounds swap: " + strings);


        // Demonstrate swapping with Collections.swap
        ArrayList<Character> chars = new ArrayList<>();
        chars.add('X');
        chars.add('Y');
        chars.add('Z');
        System.out.println("Original char ArrayList: " + chars);
         Collections.swap(chars,0,2);
         System.out.println("Char ArrayList after Collections.swap: " + chars);


    }


    private static <T> void swapElements(ArrayList<T> list, int index1, int index2) {
        //Robust handling of potential IndexOutOfBoundsExceptions
         try {
            T temp = list.get(index1);
            list.set(index1, list.get(index2));
            list.set(index2, temp);

         } catch (IndexOutOfBoundsException e) {
             System.err.println("Caught IndexOutOfBoundsException: " + e.getMessage());
         }


    }


       private static void swapElementsString(ArrayList<String> list, int index1, int index2) {
           // Example without exception handling - for demonstration with the try/catch block
           String temp = list.get(index1);
           list.set(index1, list.get(index2));
           list.set(index2, temp);
       }


}
