import java.util.Scanner;

public class CountFactors {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        if (num < 0) {
            num = -num; // Handle negative numbers
        }


        int factorCount = function(num);


        System.out.println("Number of factors of " + num + ": " + factorCount);

        scanner.close(); // Close the scanner
    }



    static int function(int num) {  // Separate function to improve readability
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        return count;
    }
}
