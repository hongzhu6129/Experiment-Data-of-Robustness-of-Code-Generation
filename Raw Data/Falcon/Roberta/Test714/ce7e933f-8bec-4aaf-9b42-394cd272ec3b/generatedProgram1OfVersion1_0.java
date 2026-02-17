import java.util.Calendar;
import java.util.GregorianCalendar;

public class GetCalendarDetails {

    public static void main(String[] args) {
        // Create a default calendar instance (current date and time)
        Calendar calendar = new GregorianCalendar();


        // Get and display year, month, day, hour, and minute
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH); // Month is 0-indexed (0 = January, 1 = February, etc.)
        int day = calendar.get(Calendar.DAY_OF_MONTH); 
        int hour = calendar.get(Calendar.HOUR_OF_DAY); // 24-hour format
        int minute = calendar.get(Calendar.MINUTE);


        System.out.println("Year: " + year);
        System.out.println("Month: " + (month + 1)); // Add 1 to display month in the usual 1-12 format
        System.out.println("Day: " + day);
        System.out.println("Hour: " + hour);
        System.out.println("Minute: " + minute);



        // Example to set a specific date and time (optional):
        // calendar.set(2024, 11, 25, 10, 30); // December 25, 2024, 10:30 AM

        // Get and display after setting a specific date/time (optional)
       /* year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH); 
        day = calendar.get(Calendar.DAY_OF_MONTH); 
        hour = calendar.get(Calendar.HOUR_OF_DAY);
        minute = calendar.get(Calendar.MINUTE);


        System.out.println("\nAfter setting a specific date:"); // Add 1 to get the usual 1-12 month format
        System.out.println("Year: " + year);
        System.out.println("Month: " + (month+1));
        System.out.println("Day: " + day);
        System.out.println("Hour: " + hour);
        System.out.println("Minute: " + minute);
        */

    }
}
