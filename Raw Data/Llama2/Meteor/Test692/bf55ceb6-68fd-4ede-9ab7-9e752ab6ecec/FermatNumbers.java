public class FermatNumbers {

    public static void main(String[] args) {
        displayFirst10FermatNumbers();
    }

    private static void displayFirst10FermatNumbers() {
        System.out.println("First 10 Fermat Numbers:");
        for (int n = 0; n < 10; n++) {
            // Calculate Fermat number using Math.pow() and explicit type casting for large numbers
            long fermatNumber = (long) (Math.pow(2, Math.pow(2, n)) + 1);
            
            // Check for overflow (if the number becomes negative, it has overflowed)
            if (fermatNumber < 0) {
                System.out.println("F(" + n + ") = Overflow");
            } else {
                System.out.println("F(" + n + ") = " + fermatNumber);
            }
        }
    }
}
