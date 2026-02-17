import java.util.Scanner;

public class MultiplicationTable {

    public static void printMultiplicationTable(int num) {
        System.out.println("Multiplication Table for " + num + ":");
        for (int i = 1; i <= 11; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        printMultiplicationTable(num);
        scanner.close(); 
    }
}
