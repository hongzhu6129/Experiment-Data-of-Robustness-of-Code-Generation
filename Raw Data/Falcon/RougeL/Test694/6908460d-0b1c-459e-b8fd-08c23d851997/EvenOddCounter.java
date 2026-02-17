public class EvenOddCounter {

    public static void main(String[] args) {

        // Example array of integers
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Initialize counters for even and odd numbers
        int evenCount = 0;
        int oddCount = 0;

        // Iterate through the array and count even and odd numbers
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenCount++; // Increment even count if the number is even
            } else {
                oddCount++; // Increment odd count if the number is odd
            }
        }


        // Print the counts of even and odd numbers
        System.out.println("Even numbers count: " + evenCount);
        System.out.println("Odd numbers count: " + oddCount);

        // Example with an empty array
         int[] emptyArray = {};
         evenCount = 0;
         oddCount = 0;

        for (int number : emptyArray) {
            if (number % 2 == 0) {
                evenCount++; 
            } else {
                oddCount++; 
            }
        }

        System.out.println("\nFor an empty array:");
        System.out.println("Even numbers count: " + evenCount);
        System.out.println("Odd numbers count: " + oddCount);



        // Example with an array containing only even numbers
        int[] evenNumbersArray = {2, 4, 6, 8, 10};
        evenCount = 0;
        oddCount = 0;

        for (int number : evenNumbersArray) {
            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("\nFor an array with only even numbers:");
        System.out.println("Even numbers count: " + evenCount);
        System.out.println("Odd numbers count: " + oddCount);



        //Example with an array containing only odd numbers

        int[] oddNumbersArray = {1,3,5,7,9};
        evenCount = 0;
        oddCount = 0;

        for (int number : oddNumbersArray) {
            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("\nFor an array with only odd numbers:");
        System.out.println("Even numbers count: " + evenCount);
        System.out.println("Odd numbers count: " + oddCount);
    }
}
