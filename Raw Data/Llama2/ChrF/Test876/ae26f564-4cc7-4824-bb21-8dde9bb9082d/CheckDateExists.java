import java.util.Calendar;
import java.util.Date;

public class CheckDateExists {

    public static void main(String[] args) {
        // Create a Calendar instance
        Calendar calendar = Calendar.getInstance();

        // Set the date to a specific date (e.g., February 30th, 2024 - this date doesn't exist)
        calendar.set(Calendar.YEAR, 2024);
        calendar.set(Calendar.MONTH, Calendar.FEBRUARY); // February is month 1 (0-indexed)
        calendar.set(Calendar.DAY_OF_MONTH, 30); 

        // Get the date
        Date date = calendar.getTime();

        // Print the date (Note: Java automatically adjusts invalid dates)
        System.out.println("Initial date set to (invalid): February 30th, 2024");
        System.out.println("Actual date created: " + date);


        // Demonstrate with a valid date:
        calendar.set(Calendar.YEAR, 2024);
        calendar.set(Calendar.MONTH, Calendar.MARCH); // March is month 2
        calendar.set(Calendar.DAY_OF_MONTH, 1);

        date = calendar.getTime();
        System.out.println("\nInitial date set to (valid): March 1st, 2024");
        System.out.println("Actual date created: " + date);



        //  Check if a specific date exists within a certain range (more robust method)

        int yearToCheck = 2024;
        int monthToCheck = 2; // February
        int dayToCheck = 29;

        // Check if the year is a leap year
        boolean isLeapYear = (yearToCheck % 4 == 0 && yearToCheck % 100 != 0) || (yearToCheck % 400 == 0);

        // Check if the day exists in the specified month
        boolean dateExists = false;
        if (monthToCheck >= 1 && monthToCheck <= 12) {
            int maxDays = 31; 
            if(monthToCheck == 2) {
                maxDays = isLeapYear ? 29 : 28;
            } else if (monthToCheck == 4 || monthToCheck == 6 || monthToCheck == 9 || monthToCheck == 11) {
                maxDays = 30;
            }
            dateExists = (dayToCheck >=1 && dayToCheck <= maxDays);
        }

        System.out.println("\nChecking if " + yearToCheck + "/" + monthToCheck + "/" + dayToCheck + " exists:");
        System.out.println("Date exists: " + dateExists);



    }
}
