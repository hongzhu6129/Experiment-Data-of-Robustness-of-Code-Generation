public class FermatNumbers {

    public static void main(String[] args) {
        // Display the first 10 Fermat numbers
        System.out.println("The first 10 Fermat numbers are:");

        for (int n = 0; n < 10; n++) {
            // Calculate the Fermat number using Math.pow() and casting to long
            long fermatNumber = (long) (Math.pow(2, Math.pow(2, n)) + 1); 

            // Handle potential overflow for larger Fermat numbers (beyond n=4 with long)
            if (fermatNumber > 0) { // Check for overflow (result becomes negative)
                 System.out.println(fermatNumber);
            } else {
                System.out.println("F" + n + " (overflow)"); // Indicate overflow occurred
            }
        }
    }
}
