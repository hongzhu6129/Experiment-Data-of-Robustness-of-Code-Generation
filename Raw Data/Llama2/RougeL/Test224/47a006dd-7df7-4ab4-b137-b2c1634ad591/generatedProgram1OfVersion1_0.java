public class PellSeries {

    public static void main(String[] args) {
        int n = 15;
        int[] pell = new int[n];
        pell[0] = 0;
        pell[1] = 1;

        System.out.print("First " + n + " Pell numbers: ");
        System.out.print(pell[0] + " " + pell[1] + " ");

        for (int i = 2; i < n; i++) {
            pell[i] = 2 * pell[i - 1] + pell[i - 2];
            System.out.print(pell[i] + " ");
        }
    }
}
