public class LeapYear {

    public static void main(String[] args) {
        int year = 2024; // Replace with the year you want to check

        boolean isLeap = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0)
                    isLeap = true;
                else
                    isLeap = false;
            } else
                isLeap = true;
        } else {
            isLeap = false;
        }

        if (isLeap)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");


        // Alternative, more concise approach using boolean logic:
        boolean isLeapConcise = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        if (isLeapConcise)
            System.out.println(year + " is a leap year (concise).");
        else
            System.out.println(year + " is not a leap year (concise).");


        //  To get input from command line arguments:
        if (args.length > 0) {
            try {
                int yearArg = Integer.parseInt(args[0]);
                boolean isLeapArg = (yearArg % 4 == 0 && yearArg % 100 != 0) || (yearArg % 400 == 0);
                if (isLeapArg)
                    System.out.println(yearArg + " is a leap year (from argument).");
                else
                    System.out.println(yearArg + " is not a leap year (from argument).");

            } catch (NumberFormatException e) {
                System.err.println("Invalid input: Please provide a valid year as a command-line argument.");
            }
        }


    }
}
