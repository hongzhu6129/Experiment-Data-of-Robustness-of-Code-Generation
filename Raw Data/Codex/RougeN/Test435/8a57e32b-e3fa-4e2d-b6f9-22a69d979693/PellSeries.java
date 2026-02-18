public class PellSeries {

    public static void main(String[] args) {
        int n = 15;
        int[] pellNumbers = new int[n];

        pellNumbers[0] = 0;
        pellNumbers[1] = 1;

        for (int i = 2; i < n; i++) {
            pellNumbers[i] = 2 * pellNumbers[i - 1] + pellNumbers[i - 2];
        }

        System.out.println("The first 15 Pell numbers are:");
        for (int i = 0; i < n; i++) {
            System.out.print(pellNumbers[i] + " ");
        }
    }
}
