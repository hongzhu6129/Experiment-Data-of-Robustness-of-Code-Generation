public class PellSeries {

    public static void main(String[] args) {
        int n = 15;
        long[] pellNumbers = new long[n];

        pellNumbers[0] = 0;
        pellNumbers[1] = 1;

        System.out.println("First " + n + " Pell numbers:");

        System.out.print(pellNumbers[0] + " ");
        System.out.print(pellNumbers[1] + " ");

        for (int i = 2; i < n; i++) {
            pellNumbers[i] = 2 * pellNumbers[i - 1] + pellNumbers[i - 2];
            System.out.print(pellNumbers[i] + " ");
        }
    }
}
