import java.util.Calendar;
import java.util.GregorianCalendar;

public class DefaultCalendarInfo {

    public static void main(String[] args) {

        // Get a default calendar instance (GregorianCalendar is a subclass of Calendar)
        Calendar calendar = new GregorianCalendar();


        // Get year, month, day, hour, and minute from the calendar
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH); // Note: Month is 0-indexed (0 = January, 1 = February, etc.)
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR_OF_DAY); // 24-hour format
        int minute = calendar.get(Calendar.MINUTE);

        // Display the information
        System.out.println("Year: " + year);
        System.out.println("Month: " + (month + 1)); // Add 1 to month for human-readable format (1 = January, 2 = February, etc.)
        System.out.println("Day: " + day);
        System.out.println("Hour: " + hour);
        System.out.println("Minute: " + minute);


    }
}
