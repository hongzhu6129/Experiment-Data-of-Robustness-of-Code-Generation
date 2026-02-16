public class CountEvenOdd {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Example array

        int evenCount = 0;
        int oddCount = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even numbers count: " + evenCount);
        System.out.println("Odd numbers count: " + oddCount);


        // Example with user input (within main method limitations) - less robust
        // Requires command-line arguments for the array elements.  Error-prone.
        /*
        int evenCountInput = 0;
        int oddCountInput = 0;

        for (String arg : args) {  // Args come in as Strings!
            try {
                int num = Integer.parseInt(arg); // Must convert to int.
                if (num % 2 == 0) {
                    evenCountInput++;
                } else {
                    oddCountInput++;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + arg + " (Not an integer)");
            }
        }

        System.out.println("Even numbers count (from input): " + evenCountInput);
        System.out.println("Odd numbers count (from input): " + oddCountInput);
        */

    }
}
