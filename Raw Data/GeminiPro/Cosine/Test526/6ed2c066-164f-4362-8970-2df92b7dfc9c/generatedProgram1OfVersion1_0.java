public class FermatNumbers {

    public static void main(String[] args) {
        // Display the first 10 Fermat numbers.
        System.out.println("First 10 Fermat Numbers:");

        for (int n = 0; n < 10; n++) {
            // Calculate the Fermat number using Math.pow() and casting to long
            long fermatNumber = (long) (Math.pow(2, Math.pow(2, n)) + 1); 
            System.out.println(fermatNumber);
        }
    }
}
