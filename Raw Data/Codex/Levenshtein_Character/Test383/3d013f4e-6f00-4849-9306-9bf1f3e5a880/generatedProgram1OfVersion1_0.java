import java.util.Scanner;

public class LargestOfFive {

    public static int findLargest(int num1, int num2, int num3, int num4, int num5) {
        int largest = num1;

        if (num2 > largest) {
            largest = num2;
        }
        if (num3 > largest) {
            largest = num3;
        }
        if (num4 > largest) {
            largest = num4;
        }
        if (num5 > largest) {
            largest = num5;
        }

        return largest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter five integers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        int num5 = scanner.nextInt();

        int largest = findLargest(num1, num2, num3, num4, num5);
        System.out.println("The largest number is: " + largest);
        scanner.close(); 
    }
}
