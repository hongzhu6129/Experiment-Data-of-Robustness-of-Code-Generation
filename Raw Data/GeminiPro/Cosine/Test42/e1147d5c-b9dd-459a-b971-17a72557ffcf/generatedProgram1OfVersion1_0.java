import java.util.Scanner;

public class EvenOddChecker {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        scanner.close(); 
    }
}
