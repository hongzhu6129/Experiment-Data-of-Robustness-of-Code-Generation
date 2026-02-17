public class PellSeries {

    public static void main(String[] args) {
        int n = 15; // Number of Pell numbers to print
        long[] pellNumbers = new long[n];

        pellNumbers[0] = 0;
        if (n > 1) {
            pellNumbers[1] = 1;
        }

        for (int i = 2; i < n; i++) {
            pellNumbers[i] = 2 * pellNumbers[i - 1] + pellNumbers[i - 2];
        }

        System.out.println("The first " + n + " Pell numbers are:");
        for (int i = 0; i < n; i++) {
            System.out.print(pellNumbers[i] + " ");
        }
        System.out.println(); // Add a newline at the end
    }
}
