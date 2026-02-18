import java.util.Scanner;

public class DaysBetweenYears {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the starting year: ");
        int startYear = scanner.nextInt();

        System.out.print("Enter the ending year: ");
        int endYear = scanner.nextInt();

        if (startYear > endYear) {
            System.out.println("Invalid input: Starting year cannot be greater than ending year.");
            return; // Exit if input is invalid
        }

        int totalDays = 0;
        for (int year = startYear; year < endYear; year++) {
            totalDays += number_of_days(year);
        }

        System.out.println("The number of days between " + startYear + " and " + endYear + " is: " + totalDays);
        scanner.close();
    }

    public static int number_of_days(int year) {
        if (is_Leap_Year(year)) {
            return 366;
        } else {
            return 365;
        }
    }

    public static boolean is_Leap_Year(int year) {
        // Leap year rules:
        // 1. Divisible by 4 but not by 100
        // 2. Divisible by 400

        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
