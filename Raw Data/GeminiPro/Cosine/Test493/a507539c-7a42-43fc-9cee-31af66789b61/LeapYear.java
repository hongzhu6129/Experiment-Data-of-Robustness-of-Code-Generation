import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        if (is_LeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
        scanner.close();
    }

    public static boolean is_LeapYear(int year) {
        // Leap year rules:
        // 1. Divisible by 4 but not by 100, OR
        // 2. Divisible by 400.
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
