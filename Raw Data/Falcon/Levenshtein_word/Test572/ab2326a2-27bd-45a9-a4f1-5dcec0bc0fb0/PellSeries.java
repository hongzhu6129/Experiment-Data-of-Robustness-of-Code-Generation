public class PellSeries {

    public static void main(String[] args) {
        int n = 15; // Number of Pell numbers to print
        printPellSeries(n);
    }

    private static void printPellSeries(int n) {
        if (n <= 0) {
            return;
        }

        int a = 0;
        int b = 1;

        System.out.print(a + " " + b + " ");

        for (int i = 2; i < n; i++) {
            int nextPell = 2 * b + a;
            System.out.print(nextPell + " ");
            a = b;
            b = nextPell;
        }
        System.out.println(); // Add a newline for cleaner output
    }
}
