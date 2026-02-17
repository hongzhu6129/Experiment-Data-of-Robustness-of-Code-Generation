import java.util.Scanner;

public class NNN {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer (n): ");
        int n = input.nextInt();

        long result = calculateNNN(n);

        System.out.println("n + nn + nnn = " + result);
        input.close();
    }

    public static long calculateNNN(int n) {
        long nn = (long) n * 10 + n;
        long nnn = nn * 10 + n;
        return (long) n + nn + nnn;
    }
}
