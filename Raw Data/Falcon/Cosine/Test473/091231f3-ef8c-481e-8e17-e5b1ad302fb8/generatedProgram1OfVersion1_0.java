public class Aznable {

    private static int aznable(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(aznable(5)); // 120
        System.out.println(aznable(10)); // 3628800
    }
}
