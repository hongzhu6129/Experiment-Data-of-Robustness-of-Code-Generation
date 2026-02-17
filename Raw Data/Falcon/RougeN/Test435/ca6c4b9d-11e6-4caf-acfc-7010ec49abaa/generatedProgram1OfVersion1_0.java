public class PellSeries {

    public static void main(String[] args) {
        int p0 = 0;
        int p1 = 1;

        System.out.print("First 15 Pell numbers: ");

        // Print the first two Pell numbers
        System.out.print(p0 + " " + p1 + " ");

        // Calculate and print the remaining Pell numbers
        for (int i = 2; i < 15; i++) {
            int p2 = 2 * p1 + p0;
            System.out.print(p2 + " ");
            p0 = p1;
            p1 = p2;
        }
    }
}
