import java.time.Year;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CurrentYearInfo {

    public static void main(String[] args) {
        // Method 1: Using java.time.Year (Java 8 and later) - preferred method
        int currentYear = Year.now().getValue();
        System.out.println("Current Year (using Year.now()): " + currentYear);
        boolean isLeapYear1 = Year.now().isLeap();
        System.out.println("Is it a leap year? (using Year.isLeap()): " + isLeapYear1);

        // Method 2: Using java.util.Calendar
        int year = Calendar.getInstance().get(Calendar.YEAR);
        System.out.println("Current Year (using Calendar): " + year);

        // Method 3: Using java.util.GregorianCalendar  (less efficient than Year or Calendar)
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        int yearGregorian = gregorianCalendar.get(Calendar.YEAR);
        System.out.println("Current Year (using GregorianCalendar): " + yearGregorian);
        boolean isLeapYear2 = gregorianCalendar.isLeapYear(yearGregorian);
        System.out.println("Is it a leap year? (using GregorianCalendar.isLeapYear()): " + isLeapYear2);



        // Example: Get information about a specific year (e.g., 2024)
        int specificYear = 2024;
        boolean isSpecificYearLeap = Year.of(specificYear).isLeap(); // Preferred for specific years
        System.out.println("Is " + specificYear + " a leap year?: " + isSpecificYearLeap);


        // Demonstrating manual leap year calculation (less efficient, use built-in methods):
        boolean isLeapManual = (specificYear % 4 == 0 && specificYear % 100 != 0) || (specificYear % 400 == 0);
        System.out.println("Is " + specificYear + " a leap year? (manual check): " + isLeapManual);


    }
}
