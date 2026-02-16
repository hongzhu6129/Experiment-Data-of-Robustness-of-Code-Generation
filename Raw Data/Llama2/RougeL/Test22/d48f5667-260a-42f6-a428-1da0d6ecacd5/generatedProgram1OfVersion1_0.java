import java.util.Arrays;

public class SortIntArray {

    public static void sort(int[] arr) {
        Arrays.sort(arr);
    }

    public static void main(String[] args) {
        // The error "invalid literal for int() with base 10: 'computer'" 
        // arises when you try to convert a non-numeric string (like "computer") 
        // into an integer using Integer.parseInt() or similar methods.

        // Demonstrate the issue and how to avoid it:

        String[] strings = {"123", "456", "computer", "789"};
        int[] numbers = new int[strings.length];  // Initialize to accommodate all *potential* numbers.
        int validNumbersCount = 0;


        for (String str : strings) {
            try {
                int num = Integer.parseInt(str);
                numbers[validNumbersCount++] = num; // Add only if parsing succeeds

            } catch (NumberFormatException e) {
                System.out.println("Error: Cannot convert \"" + str + "\" to an integer.");
                // Handle the error appropriately.  Here, we just print a message
                // and skip the invalid string.
            }
        }



        // Resize the array to avoid empty space at the end (Optional, but better practice)
        int[] finalNumbers = new int[validNumbersCount];
        System.arraycopy(numbers, 0, finalNumbers, 0, validNumbersCount);

        //Now sort the final array of valid integers
        sort(finalNumbers);

        System.out.println("Sorted valid integers:");
        for (int num : finalNumbers) {
            System.out.println(num);
        }

         // Alternatively, to completely avoid resizing, use a list to store ints then convert to array:
        /*
        import java.util.ArrayList;
        import java.util.List;

        // ...inside main...

        List<Integer> numberList = new ArrayList<>();
        for (String str : strings) {
           try{
               int num = Integer.parseInt(str);
               numberList.add(num);
           } catch (NumberFormatException ex) {
                System.out.println("Error: Cannot convert \"" + str + "\" to an integer.");
           }
        }

        int[] finalNumbersList = numberList.stream().mapToInt(Integer::intValue).toArray();
        sort(finalNumbersList);
        System.out.println("Sorted valid integers (List approach):");
        for(int num : finalNumbersList) {
           System.out.println(num);
        }
        */
    }
}
