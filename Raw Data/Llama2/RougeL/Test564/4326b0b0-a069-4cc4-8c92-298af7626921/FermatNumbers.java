public class FermatNumbers {

    public static void main(String[] args) {
        displayFirst10FermatNumbers();
    }

    private static void displayFirst10FermatNumbers() {
        System.out.println("First 10 Fermat Numbers:");
        for (int n = 0; n < 10; n++) {
            long fermatNumber = calculateFermatNumber(n);
            System.out.println(fermatNumber);
        }
    }

    private static long calculateFermatNumber(int n) {
        return (long) (Math.pow(2, Math.pow(2, n)) + 1);
    }
}
