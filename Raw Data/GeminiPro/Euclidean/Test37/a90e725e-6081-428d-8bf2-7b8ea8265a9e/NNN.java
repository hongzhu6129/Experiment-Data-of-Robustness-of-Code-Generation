import java.util.Scanner;

public class NNN {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a non-zero integer n: ");
        int n = scanner.nextInt();

        if (n == 0) {
            System.out.println("Input must be a non-zero integer.");
            return; // Exit if n is zero
        }

        int nn = n * 10 + n;
        int nnn = n * 100 + nn;
        int result = n + nn + nnn;


        System.out.println("n + nn + nnn = " + result);
        scanner.close();


    }
}
