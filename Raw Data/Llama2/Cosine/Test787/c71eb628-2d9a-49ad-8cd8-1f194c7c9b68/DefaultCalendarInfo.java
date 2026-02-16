import java.util.Calendar;
import java.util.GregorianCalendar;

public class DefaultCalendarInfo {

    public static void main(String[] args) {

        // Get an instance of the default calendar (GregorianCalendar)
        Calendar calendar = new GregorianCalendar();

        // Get year, month, day, hour, and minute
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH); // Month is 0-indexed (0 = January, 1 = February, etc.)
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
        int hourOfDay = calendar.get(Calendar.HOUR_OF_DAY); // 24-hour format
        int minute = calendar.get(Calendar.MINUTE);

        // Display the information
        System.out.println("Year: " + year);
        System.out.println("Month: " + (month + 1)); // Add 1 to display month in a user-friendly way (1-12)
        System.out.println("Day: " + dayOfMonth);
        System.out.println("Hour: " + hourOfDay);
        System.out.println("Minute: " + minute); 
    }
}
