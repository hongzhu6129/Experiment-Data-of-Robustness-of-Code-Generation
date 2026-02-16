public class LeapYearChecker {

    public static void main(String[] args) {
        // Get the year from command-line arguments.  Handle potential errors.
        if (args.length != 1) {
            System.out.println("Usage: java LeapYearChecker <year>");
            return; // Exit if no year is provided
        }

        try {
            int year = Integer.parseInt(args[0]);
            checkLeapYear(year);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: Please enter a valid year (integer).");
        }
    }


    private static void checkLeapYear(int year) {
        boolean isLeapYear;

        // Leap year rules:
        // 1. Divisible by 4 but not by 100, OR
        // 2. Divisible by 400.
        isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
