public class PellSeries {

    public static void main(String[] args) {
        int n = 15; // Number of Pell numbers to print

        if (n >= 1) {
            System.out.print(0 + " "); // Print the first Pell number
        }
        if (n >= 2) {
            System.out.print(1 + " "); // Print the second Pell number
        }

        int a = 0;
        int b = 1;

        for (int i = 3; i <= n; i++) {
            int nextPell = 2 * b + a;
            System.out.print(nextPell + " ");
            a = b;
            b = nextPell;
        }
         System.out.println(); // Add a newline for cleaner output
    }
}
