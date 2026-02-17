public class FermatNumbers {

    public static void main(String[] args) {
        System.out.println("First 10 Fermat Numbers:");

        for (int n = 0; n < 10; n++) {
            // Calculate the Fermat number using Math.pow() and casting to long
            long fermatNumber = (long) (Math.pow(2, Math.pow(2, n)) + 1);

            // Handle potential overflow for larger Fermat numbers
            if (fermatNumber > 0) {  // Check for overflow (negative values indicate overflow)
                System.out.println(fermatNumber);
            } else {
                System.out.println("Fermat number for n = " + n + " is too large to represent as a long.");
            }
        }
    }
}
