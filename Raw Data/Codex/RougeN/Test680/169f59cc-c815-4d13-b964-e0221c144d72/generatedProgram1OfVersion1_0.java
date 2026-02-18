import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarInfo {

    public static void main(String[] args) {
        // Get a default calendar (GregorianCalendar)
        Calendar calendar = new GregorianCalendar();

        // Get and display calendar information
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH); // Month is 0-indexed (0-11)
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR_OF_DAY); // 24-hour format
        int minute = calendar.get(Calendar.MINUTE);

        System.out.println("Current Date and Time:");
        System.out.println("Year: " + year);
        System.out.println("Month: " + (month + 1)); // Add 1 for user-friendly output (1-12)
        System.out.println("Day: " + day);
        System.out.println("Hour: " + hour);
        System.out.println("Minute: " + minute); 
    }
}
