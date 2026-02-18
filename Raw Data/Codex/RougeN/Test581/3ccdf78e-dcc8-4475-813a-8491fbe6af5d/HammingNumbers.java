public class HammingNumbers {

    public static void main(String[] args) {
        int count = 0;
        int n = 1;

        System.out.println("First twenty Hamming numbers:");

        while (count < 20) {
            if (isHamming(n)) {
                System.out.print(n + " ");
                count++;
            }
            n++;
        }
    }

    private static boolean isHamming(int n) {
        while (n % 2 == 0) {
            n /= 2;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        while (n % 5 == 0) {
            n /= 5;
        }
        return n == 1;
    }
}
