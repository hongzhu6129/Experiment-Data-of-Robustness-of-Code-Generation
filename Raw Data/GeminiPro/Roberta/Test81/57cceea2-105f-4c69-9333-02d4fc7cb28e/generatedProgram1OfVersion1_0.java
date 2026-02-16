public class EvenOddCounter {

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

        System.out.println("Even count: " + evenCount);
        System.out.println("Odd count: " + oddCount);


        // Example with user input (within main method limitations)
        // Note: This approach for user input is basic and has limitations. 
        // For robust input handling, separate methods and exception handling are recommended.
        if (args.length > 0) { // Check if any command-line arguments are provided
            int[] userArr = new int[args.length];
            try {
                for (int i = 0; i < args.length; i++) {
                    userArr[i] = Integer.parseInt(args[i]);
                }

                evenCount = 0; 
                oddCount = 0;

                for (int num : userArr) {
                    if (num % 2 == 0) {
                        evenCount++;
                    } else {
                        oddCount++;
                    }
                }
                System.out.println("Even count (user input): " + evenCount);
                System.out.println("Odd count (user input): " + oddCount);


            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please provide integers as command-line arguments.");
            }

        } // end of if args.length>0



    } //end of main method
}
