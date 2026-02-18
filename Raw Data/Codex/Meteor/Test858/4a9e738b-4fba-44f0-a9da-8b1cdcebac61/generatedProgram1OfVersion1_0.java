import java.util.Calendar;
import java.util.GregorianCalendar;

public class DefaultCalendarInfo {

    public static void main(String[] args) {

        // Get a default calendar instance (typically Gregorian in most locales)
        Calendar calendar = new GregorianCalendar(); 

        // Extract year, month, day, hour, and minute
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH); // Month is 0-indexed (0=January, 1=February, etc.)
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR_OF_DAY); // 24-hour format
        int minute = calendar.get(Calendar.MINUTE);

        // Display the information
        System.out.println("Current Date and Time:");
        System.out.println("Year: " + year);
        System.out.println("Month: " + (month + 1)); // Add 1 to month for user-friendly output (1-12)
        System.out.println("Day: " + day);
        System.out.println("Hour: " + hour);
        System.out.println("Minute: " + minute); 
    }
}
