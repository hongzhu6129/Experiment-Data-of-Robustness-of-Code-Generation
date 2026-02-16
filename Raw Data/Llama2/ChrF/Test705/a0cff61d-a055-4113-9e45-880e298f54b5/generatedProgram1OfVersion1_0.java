import java.time.Year;
import java.util.Calendar;
import java.time.LocalDate;

public class GetYearInfo {

    public static void main(String[] args) {
        // Using Java 8's Year class (preferred)
        int currentYear = Year.now().getValue();
        System.out.println("Current Year (using Year.now()): " + currentYear);

        // Using Calendar (older approach)
        int yearFromCalendar = Calendar.getInstance().get(Calendar.YEAR);
        System.out.println("Current Year (using Calendar): " + yearFromCalendar);


        // Getting info for a specific year (example: 2024 - Leap Year check) 
        int specificYear = 2024;
        Year specificYearObj = Year.of(specificYear);
        boolean isLeap = specificYearObj.isLeap();

        System.out.println("Is " + specificYear + " a leap year? " + isLeap);


        // Get current date and year (LocalDate)
        LocalDate currentDate = LocalDate.now();
        int currentYearLocalDate = currentDate.getYear();
        System.out.println("Current Date (using LocalDate): " + currentDate);
        System.out.println("Current Year (using LocalDate): " + currentYearLocalDate);
    }
}
