public class PellSeries {

    public static void main(String[] args) {
        int n = 15; // Number of Pell numbers to print
        int a = 0;
        int b = 1;

        System.out.print("First 15 Pell numbers: ");

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");

            int next = 2 * b + a;
            a = b;
            b = next;
        }
        System.out.println(); // Add a newline for better formatting
    }
}
