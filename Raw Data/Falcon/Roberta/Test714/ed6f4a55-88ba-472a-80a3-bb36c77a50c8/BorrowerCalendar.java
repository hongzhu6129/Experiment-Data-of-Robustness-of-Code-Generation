import java.util.Calendar;
import java.util.GregorianCalendar;

public class BorrowerCalendar {

    public static void main(String[] args) {
        // Get the current date and time
        Calendar calendar = new GregorianCalendar();

        // Extract information from the calendar
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1; // Month is 0-indexed, so add 1
        int day = calendar.get(Calendar.DAY_OF_MONTH);
        int hour = calendar.get(Calendar.HOUR_OF_DAY); // 24-hour format
        int minute = calendar.get(Calendar.MINUTE);


        // Display the information
        System.out.println("Borrower's Calendar Information:");
        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
        System.out.println("Hour: " + hour);
        System.out.println("Minute: " + minute);
    }
}
