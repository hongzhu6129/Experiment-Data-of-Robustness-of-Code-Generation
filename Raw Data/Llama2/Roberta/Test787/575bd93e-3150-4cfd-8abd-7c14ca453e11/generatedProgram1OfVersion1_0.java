import java.util.Scanner;

public class PartDueDate {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the printed part due date
        String printedDate = scanner.nextLine();

        // Split the date into components
        String[] components = printedDate.split("\\.");

        // Convert the components to integers
        int year = Integer.parseInt(components[0]);
        int month = Integer.parseInt(components[1]);
        int day = Integer.parseInt(components[2]);

        // Add one to the day
        day++;

        // Check if the day is greater than the number of days in the month
        int numDaysInMonth = getNumDaysInMonth(month, year);
        if (day > numDaysInMonth) {
            // Increment the month and reset the day to 1
            month++;
            day = 1;

            // Check if the month is greater than 12
            if (month > 12) {
                // Increment the year and reset the month to 1
                year++;
                month = 1;
            }
        }

        // Format the next possible date
        String nextDate = String.format("%02d-%02d-%04d", day, month, year);

        // Print the next possible date
        System.out.println(nextDate);
    }

    private static int getNumDaysInMonth(int month, int year) {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 2:
                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return 30;
        }
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }
}
