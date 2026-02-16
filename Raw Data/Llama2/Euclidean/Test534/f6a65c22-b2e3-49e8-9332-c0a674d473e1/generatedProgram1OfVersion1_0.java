import java.util.Scanner;

public class RevenueCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer (n): ");
        int n = scanner.nextInt();

        if (n < 0 || n > 9) {  // Handle invalid input (outside 0-9)
            System.out.println("Invalid input. n must be between 0 and 9.");
            return;
        }


        long revenue = calculateRevenue(n);
        System.out.println("Revenue: " + revenue);

        scanner.close();
    }

    public static long calculateRevenue(int n) {
        int nn = n * 10 + n;
        int nnn = n * 100 + nn;
        return (long) n + nn + nnn;
    }
}
