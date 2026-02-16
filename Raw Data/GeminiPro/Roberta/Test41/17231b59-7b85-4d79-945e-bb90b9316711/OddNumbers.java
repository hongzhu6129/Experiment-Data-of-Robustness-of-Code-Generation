public class OddNumbers {

    public static void printOddNumbers(int start, int end) {
        if (start < 1 || end < 1 || start > end) {
            System.out.println("Invalid input range.");
            return;
        }

        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        printOddNumbers(1, 99); 
    }
}
