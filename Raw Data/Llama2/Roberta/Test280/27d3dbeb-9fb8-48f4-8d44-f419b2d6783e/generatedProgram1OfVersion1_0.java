import java.util.Calendar;
import java.util.GregorianCalendar;

public class DefaultCalendarInfo {

    public static void main(String[] args) {
        // Get a default calendar (GregorianCalendar is the default in most cases)
        Calendar calendar = new GregorianCalendar();

        // Extract and display calendar information
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1; // Month is 0-indexed
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR_OF_DAY); // 24-hour format
        int minute = calendar.get(Calendar.MINUTE);


        System.out.println("Current Date and Time:");
        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
        System.out.println("Hour: " + hour);
        System.out.println("Minute: " + minute);

    }
}
