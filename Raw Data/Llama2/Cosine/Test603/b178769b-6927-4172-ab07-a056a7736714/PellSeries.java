public class PellSeries {

    public static void main(String[] args) {
        int n = 15; // Number of Pell numbers to print
        int a = 0, b = 1;

        System.out.println("First " + n + " numbers of the Pell series:");

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");

            int next = 2 * b + a;  // Calculate the next Pell number
            a = b;
            b = next;
        }
    }
}
