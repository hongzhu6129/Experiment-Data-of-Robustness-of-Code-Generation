public class AntiprismNumbers {

    public static void main(String[] args) {
        displayFirst50AntiprismNumbers();
    }

    public static int getPentagonalNumber(int n) {
        return n * (3 * n - 1) / 2;
    }

    public static void displayFirst50AntiprismNumbers() {
        for (int i = 1; i <= 50; i++) {
            int antiprismNumber = i * (2 * i - 1) ; //Formula for antiprism numbers
            System.out.println(antiprismNumber);
        }
    }
}
