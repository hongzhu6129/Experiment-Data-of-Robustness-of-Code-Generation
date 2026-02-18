import java.util.Scanner;

public class MultiplicationTable {

    public static void printMultiplicationTable(int num) {
        if (num == 0) {
            System.out.println("Multiplication table of 0 is trivial (all results are 0).");
            return; // Or print a single line: 0 x 1 = 0
        }


        System.out.println("Multiplication table of " + num + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();


        printMultiplicationTable(number);

        scanner.close(); 
    }
}
