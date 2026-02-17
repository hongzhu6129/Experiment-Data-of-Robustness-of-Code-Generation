import java.util.Scanner;

public class DaysInMonth {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a month (1-12): ");
        int month = input.nextInt();

        System.out.print("Enter a year: ");
        int year = input.nextInt();

        int daysInMonth;

        switch (month) {
            case 1: // January
            case 3: // March
            case 5: // May
            case 7: // July
            case 8: // August
            case 10: // October
            case 12: // December
                daysInMonth = 31;
                break;
            case 4: // April
            case 6: // June
            case 9: // September
            case 11: // November
                daysInMonth = 30;
                break;
            case 2: // February
                if (((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)) {
                    daysInMonth = 29; // Leap year
                } else {
                    daysInMonth = 28;
                }
                break;
            default:
                System.out.println("Invalid month.");
                return; // Exit the program if the month is invalid
        }

        System.out.println("Number of days in the specified month: " + daysInMonth);

        input.close();//close the scanner
    }
}
