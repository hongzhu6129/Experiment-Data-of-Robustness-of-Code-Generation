import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("input first number: ");
        int num1 = input.nextInt();

        System.out.print("input second number: ");
        int num2 = input.nextInt();

        System.out.print("input third number: ");
        int num3 = input.nextInt();

        System.out.print("input fourth number: ");
        int num4 = input.nextInt();

        if (num1 == num2 && num2 == num3 && num3 == num4) {
            System.out.println("equal");
        } else {
            System.out.println("numbers are not equal!");
        }

        input.close(); 
    }
}
