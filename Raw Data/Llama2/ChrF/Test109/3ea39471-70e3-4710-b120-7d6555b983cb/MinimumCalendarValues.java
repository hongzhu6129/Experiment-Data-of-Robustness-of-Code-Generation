import java.util.Calendar;
import java.util.GregorianCalendar;

public class MinimumCalendarValues {

    public static void main(String[] args) {
        // Get the current date and time using the default calendar.
        Calendar calendar = new GregorianCalendar();

        // Get the minimum values for different fields.
        int minYear = calendar.getMinimum(Calendar.YEAR);
        int minEra = calendar.getMinimum(Calendar.ERA); // Not directly year, but related.  Could be BC/AD equivalent
        int minWeekOfYear = calendar.getMinimum(Calendar.WEEK_OF_YEAR); 
        int minDayOfMonth = calendar.getMinimum(Calendar.DAY_OF_MONTH); // Day of the month


        System.out.println("Minimum Year: " + minYear);
        System.out.println("Minimum Era: " + minEra);
        System.out.println("Minimum Week of Year: " + minWeekOfYear);
        System.out.println("Minimum Day of Month: " + minDayOfMonth);

         // Demonstration of minimum earlier date (not directly retrievable as a "minimum").
        Calendar earliestDate = new GregorianCalendar();
        earliestDate.setTimeInMillis(Long.MIN_VALUE);  // Set to the absolute earliest representable date/time

        System.out.println("Earliest Representable Date: " + earliestDate.getTime());



    }
}
