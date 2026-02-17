public class PellSeries {

    public static void main(String[] args) {
        int a = 0;
        int b = 1;

        System.out.print("First 15 Pell numbers: ");

        // Print the first two Pell numbers (0 and 1)
        System.out.print(a + " " + b + " ");

        // Calculate and print the remaining 13 Pell numbers
        for (int i = 2; i < 15; i++) {
            int nextPell = 2 * b + a;
            System.out.print(nextPell + " ");
            a = b;
            b = nextPell;
        }
    }
}
