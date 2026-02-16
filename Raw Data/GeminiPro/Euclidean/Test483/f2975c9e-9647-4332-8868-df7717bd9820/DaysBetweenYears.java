import java.util.Scanner;

public class DaysBetweenYears {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the starting year: ");
        int startYear = scanner.nextInt();

        System.out.print("Enter the ending year: ");
        int endYear = scanner.nextInt();

        if (startYear > endYear) {
            System.out.println("Invalid input: Starting year must be less than or equal to ending year.");
            return;
        }

        int totalDays = 0;
        for (int year = startYear; year < endYear; year++) {
            totalDays += number_of_days(year);
        }

        System.out.println("The total number of days between " + startYear + " and " + endYear + " is: " + totalDays);
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
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
