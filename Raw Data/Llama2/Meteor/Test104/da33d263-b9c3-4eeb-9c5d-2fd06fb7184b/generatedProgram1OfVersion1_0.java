import java.util.Scanner;

public class ScalarPlace {

    public static void printScalarPlaces(int number) {
        if (number == 0) {
            System.out.println("Scalar places of 0: 0");
            return;
        }

        int temp = Math.abs(number); // Handle negative numbers
        int place = 1;

        System.out.print("Scalar places of " + number + ": ");

        while (temp > 0 && place <= 10) {  // Limit to ten places
            int digit = temp % 10;
            System.out.print(digit * place + " ");
            temp /= 10;
            place *= 10;
        }
        System.out.println(); // Newline for clarity
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        printScalarPlaces(num);
        scanner.close(); 
    }
}
