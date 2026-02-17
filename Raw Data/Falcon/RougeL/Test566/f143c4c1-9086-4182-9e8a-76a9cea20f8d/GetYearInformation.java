import java.time.Year;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class GetYearInformation {

    public static void main(String[] args) {
        // Method 1: Using java.time.Year (Java 8 and later)
        int currentYear = Year.now().getValue();
        System.out.println("Current Year (using java.time.Year): " + currentYear);
        boolean isLeapYear = Year.isLeap(currentYear);
        System.out.println("Is current year a leap year? " + isLeapYear);


        // Method 2: Using java.util.Calendar (older versions - but still valid)
        Calendar calendar = new GregorianCalendar();  // Or Calendar.getInstance()
        int year = calendar.get(Calendar.YEAR);
        System.out.println("Current Year (using java.util.Calendar): " + year);

        // Check for leap year using Calendar
        boolean isLeap = calendar.getActualMaximum(Calendar.DAY_OF_YEAR) > 365;  // A leap year has 366 days.
        System.out.println("Is current year a leap year? " + isLeap);



        // Example with a given year (using java.time.Year):
        int givenYear = 2024; 
        boolean isGivenYearLeap = Year.isLeap(givenYear);
        System.out.println("Is " + givenYear + " a leap year? " + isGivenYearLeap); 
    }
}
