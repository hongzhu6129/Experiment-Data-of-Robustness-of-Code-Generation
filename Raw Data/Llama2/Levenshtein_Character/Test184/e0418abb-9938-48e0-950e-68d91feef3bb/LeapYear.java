public class LeapYear {

    public static void main(String[] args) {
        // Get the year from command-line arguments.  Handle potential errors.
        if (args.length != 1) {
            System.out.println("Usage: java LeapYear <year>");
            return; // Exit if no year is provided or too many arguments
        }

        try {
            int year = Integer.parseInt(args[0]);

            // Leap year rules:
            // 1. Divisible by 4
            // 2. Not divisible by 100 unless also divisible by 400

            boolean isLeap = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);


            if (isLeap) {
                System.out.println(year + " is a leap year.");
            } else {
                System.out.println(year + " is not a leap year.");
            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid input: Please enter a valid year (integer).");
        }
    }
}
