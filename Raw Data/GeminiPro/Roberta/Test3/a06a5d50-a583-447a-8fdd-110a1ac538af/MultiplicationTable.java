import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Input a number: ");
        int num = input.nextInt();

        printMultiplicationTable(num);

        input.close(); 
    }

    public static void printMultiplicationTable(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
