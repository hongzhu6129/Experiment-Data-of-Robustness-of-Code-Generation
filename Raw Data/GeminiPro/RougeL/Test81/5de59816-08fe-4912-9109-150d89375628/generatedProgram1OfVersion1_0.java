public class CountEvenOdd {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Example array

        int evenCount = 0;
        int oddCount = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Number of even elements: " + evenCount);
        System.out.println("Number of odd elements: " + oddCount);


        // Example with user input (within main method limitations):
        // For simplicity, we'll use a fixed-size array and assume valid integer input.
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int[] userArr = new int[5];  // Array size 5 for demonstration

        System.out.println("Enter 5 integers:");

        for(int i=0; i<5; i++) {
            userArr[i] = scanner.nextInt();
        }

        evenCount = 0;
        oddCount = 0;

        for(int num : userArr) {
            if(num % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Number of even elements (user input): " + evenCount);
        System.out.println("Number of odd elements (user input): " + oddCount);
        scanner.close();


    }
}
