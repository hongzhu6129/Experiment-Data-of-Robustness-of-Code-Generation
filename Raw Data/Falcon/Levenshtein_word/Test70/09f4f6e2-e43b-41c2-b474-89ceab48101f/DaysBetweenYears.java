import java.util.Scanner;

public class DaysBetweenYears {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first year: ");
        int year1 = scanner.nextInt();

        System.out.print("Enter the second year: ");
        int year2 = scanner.nextInt();

        int days = 0;
        if (year1 < year2) {
            for (int year = year1; year < year2; year++) {
                days += number_of_days(year);
            }
        } else if (year2 < year1) {
             for (int year = year2; year < year1; year++) {
                days += number_of_days(year);
            }
            days = -days; // Make negative since year2 is before year1
        } else {
            days = 0; // Same year, so zero days between them.
        }


        System.out.println("Number of days between " + year1 + " and " + year2 + ": " + days);
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
