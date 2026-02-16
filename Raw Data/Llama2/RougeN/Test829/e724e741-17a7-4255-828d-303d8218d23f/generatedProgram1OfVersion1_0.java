import java.util.Scanner;

public class DaysBetweenYears {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first year: ");
        int year1 = scanner.nextInt();

        System.out.print("Enter the second year: ");
        int year2 = scanner.nextInt();

        if (year1 > year2) {
            int temp = year1;
            year1 = year2;
            year2 = temp; // Ensure year1 is always smaller or equal
        }

        int totalDays = 0;
        for (int year = year1; year < year2; year++) {
            totalDays += number_of_days(year);
        }

        System.out.println("Number of days between " + year1 + " and " + year2 + ": " + totalDays);
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
