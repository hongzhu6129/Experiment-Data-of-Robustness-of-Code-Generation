public class FermatNumbers {

    public static void main(String[] args) {
        System.out.println("First 10 Fermat Numbers:");

        for (int n = 0; n < 10; n++) {
            long fermatNumber = (long) Math.pow(2, Math.pow(2, n)) + 1;  // Calculate Fermat number

            if (fermatNumber > 0) { //check for overflow
                System.out.println(fermatNumber);
            } else {
                System.out.println("Fermat number for n = " + n + " is too large to represent as a long.");
            }
        }
    }
}
