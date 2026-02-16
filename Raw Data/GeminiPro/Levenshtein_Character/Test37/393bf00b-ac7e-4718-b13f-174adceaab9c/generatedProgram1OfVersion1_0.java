import java.util.Scanner;

public class NPlusNNPlusNNN {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer (n): ");
        int n = scanner.nextInt();


        long result = calculateSum(n);

        System.out.println("Result: " + result);
        scanner.close();
    }

    public static long calculateSum(int n) {
        long nn = (long) n * 10 + n;
        long nnn = nn * 10 + n;
        return n + nn + nnn;
    }
}
