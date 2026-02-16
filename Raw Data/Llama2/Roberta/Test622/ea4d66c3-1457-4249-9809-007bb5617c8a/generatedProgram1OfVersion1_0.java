public class LucasNumbers {

    public static void main(String[] args) {
        int n = 10; // Number of Lucas numbers to display

        int L0 = 2;
        int L1 = 1;

        System.out.print("First 10 Lucas numbers: ");

        if (n >= 1) {
            System.out.print(L0 + " ");
        }
        if (n >= 2) {
            System.out.print(L1 + " ");
        }

        for (int i = 2; i < n; i++) {
            int nextLucas = L0 + L1;
            System.out.print(nextLucas + " ");
            L0 = L1;
            L1 = nextLucas;
        }
        System.out.println(); // Add a newline for cleaner output

    }
}
