public class PellSeries {

    public static void main(String[] args) {
        int n = 15;
        int a = 0, b = 1;

        System.out.print("First " + n + " Pell numbers: ");

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");

            int next = 2 * b + a;  // Calculate the next Pell number
            a = b;
            b = next;
        }
        System.out.println(); // Add a newline for better output formatting
    }
}
