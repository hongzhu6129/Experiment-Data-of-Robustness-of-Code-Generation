public class PellSeries {

    public static void main(String[] args) {
        int n = 15;
        int a = 0;
        int b = 1;

        System.out.print("First " + n + " Pell numbers: ");

        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int temp = a;
            a = b;
            b = 2 * b + temp;
        }
    }
}
