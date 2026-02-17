public class EvenOddCount {

    public static void main(String[] args) {
        // Example array of integers (you can modify this)
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int evenCount = 0;
        int oddCount = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Number of even elements: " + evenCount);
        System.out.println("Number of odd elements: " + oddCount);
    }
}
