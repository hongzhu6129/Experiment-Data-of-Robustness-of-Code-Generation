public class EvenOddCounter {

    public static void main(String[] args) {
        // Example array (you can change this)
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int evenCount = 0;
        int oddCount = 0;

        // Iterate through the array and count even and odd numbers
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // Print the results
        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);


         // Example 2:  Handling an empty array gracefully
        int[] emptyArray = {};

        evenCount = 0;
        oddCount = 0;

        for (int num : emptyArray) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("\nHandling Empty Array:");
        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);


        // Example 3: Array with all even numbers
        int[] allEven = {2, 4, 6, 8, 10};

        evenCount = 0;
        oddCount = 0;
        for (int num : allEven) {
             if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("\nAll Even Array:");
        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);



         // Example 4: Array with all odd numbers
        int[] allOdd = {1, 3, 5, 7, 9};

        evenCount = 0;
        oddCount = 0;
        for (int num : allOdd) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("\nAll Odd Array:");
        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);


    }
}
