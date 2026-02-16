public class EvenOddCounter {

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


        // Example with hardcoded array within main method if you absolutely CANNOT create a separate method
        int[] numbers2 =  {22, 33, 44, 55, 66, 77, 88, 99, 100, 1};
        int evenCount2 = 0;
        int oddCount2 = 0;

        for(int num : numbers2) {
            if(num % 2 == 0) {
                evenCount2++;
            } else {
                oddCount2++;
            }
        }

        System.out.println("Even numbers (second array): " + evenCount2);
        System.out.println("Odd numbers (second array): " + oddCount2);
    }
}
