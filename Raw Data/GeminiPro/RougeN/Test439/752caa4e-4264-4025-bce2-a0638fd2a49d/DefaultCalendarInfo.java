import java.util.Calendar;
import java.util.GregorianCalendar;

public class DefaultCalendarInfo {

    public static void main(String[] args) {

        // Get a default calendar instance (typically Gregorian in most locales)
        Calendar calendar = new GregorianCalendar(); 

        // Get and display calendar information
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH); // Month is 0-indexed (0-11)
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
        int hourOfDay = calendar.get(Calendar.HOUR_OF_DAY); // 24-hour format
        int minute = calendar.get(Calendar.MINUTE);


        System.out.println("Year: " + year);
        System.out.println("Month: " + (month + 1)); // Add 1 for 1-12 display
        System.out.println("Day of Month: " + dayOfMonth);
        System.out.println("Hour (24-hour format): " + hourOfDay);
        System.out.println("Minute: " + minute);

    }
}
