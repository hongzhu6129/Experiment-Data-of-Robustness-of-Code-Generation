import java.util.Calendar;
import java.util.GregorianCalendar;

public class MinimumDateComponents {

    public static void main(String[] args) {
        // Get the current date and time.
        Calendar calendar = new GregorianCalendar();

        // Set all fields to their minimum values.
        calendar.set(Calendar.YEAR, calendar.getActualMinimum(Calendar.YEAR));
        calendar.set(Calendar.MONTH, calendar.getActualMinimum(Calendar.MONTH));
        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMinimum(Calendar.DAY_OF_MONTH));
        calendar.set(Calendar.WEEK_OF_YEAR, calendar.getActualMinimum(Calendar.WEEK_OF_YEAR)); // Note: Week of year depends on locale and calendar settings.
        calendar.set(Calendar.DAY_OF_WEEK, calendar.getActualMinimum(Calendar.DAY_OF_WEEK)); // Note: Day of week depends on locale and calendar settings.

        // For HOUR_OF_DAY, MINUTE, SECOND, and MILLISECOND, we explicitly set to 0 for clarity.  Using getActualMinimum() might also work depending on your specific needs.
        calendar.set(Calendar.HOUR_OF_DAY, 0);  // 24-hour clock (0-23)
        calendar.set(Calendar.MINUTE, 0);
        calendar.set(Calendar.SECOND, 0);
        calendar.set(Calendar.MILLISECOND, 0);



        // Print the minimum date components.
        System.out.println("Minimum Date Components:");
        System.out.println("Year: " + calendar.get(Calendar.YEAR));
        System.out.println("Month: " + (calendar.get(Calendar.MONTH) + 1)); // Month is 0-indexed
        System.out.println("Day of Month: " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("Week of Year: " + calendar.get(Calendar.WEEK_OF_YEAR));  // Output might vary
        System.out.println("Day of Week: " + calendar.get(Calendar.DAY_OF_WEEK));    // Output might vary (e.g., Sunday=1)
        System.out.println("Hour: "+ calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("Minute: "+ calendar.get(Calendar.MINUTE));
        System.out.println("Second: "+ calendar.get(Calendar.SECOND));



        //Alternatively to print the full date you can use:
        System.out.println("Full Minimum Date: " + calendar.getTime()); // getTime() gives a Date object



    }
}
