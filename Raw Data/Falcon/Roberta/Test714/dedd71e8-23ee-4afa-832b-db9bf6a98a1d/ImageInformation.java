import java.util.Calendar;
import java.util.GregorianCalendar;

public class ImageInformation {

    public static void main(String[] args) {
        // Get a default calendar instance (typically Gregorian in most locales)
        Calendar calendar = new GregorianCalendar(); 

        // Extract information about the current date and time from the calendar
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1; // Month is 0-indexed, so add 1
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR_OF_DAY); // 24-hour format
        int minute = calendar.get(Calendar.MINUTE);


        // Print the extracted information (formatted as you desire)
        System.out.println("Image Information (from default calendar):");
        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
        System.out.println("Hour: " + hour);
        System.out.println("Minute: " + minute); 

    }
}
