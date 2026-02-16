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

        System.out.println("Even numbers: " + evenCount);
        System.out.println("Odd numbers: " + oddCount);

        // Example with a different array:
        int[] numbers2 = {11, 12, 13, 14, 15, 16};
        evenCount = 0; 
        oddCount = 0;

         for (int number : numbers2) {
            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even numbers (second array): " + evenCount);
        System.out.println("Odd numbers (second array): " + oddCount);


        // Example with an empty array:
         int[] numbers3 = {};
        evenCount = 0; 
        oddCount = 0;

         for (int number : numbers3) {
            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even numbers (empty array): " + evenCount);
        System.out.println("Odd numbers (empty array): " + oddCount);
    }
}
