import java.util.Calendar;
import java.util.GregorianCalendar;

public class MinimumCalendarValues {

    public static void main(String[] args) {
        // Get a Calendar instance (default is current time)
        Calendar calendar = new GregorianCalendar();

        // Go to the previous date/time
        calendar.add(Calendar.DATE, -1); // or any other field like YEAR, MONTH, WEEK_OF_YEAR

        // Get minimum values using getMinimum()
        int minYear = calendar.getMinimum(Calendar.YEAR);
        int minMonth = calendar.getMinimum(Calendar.MONTH); 
        int minWeekOfYear = calendar.getMinimum(Calendar.WEEK_OF_YEAR); // Note: Week of year is rarely used for "minimum"
        int minDayOfMonth = calendar.getMinimum(Calendar.DAY_OF_MONTH);
        int minDayOfWeek = calendar.getMinimum(Calendar.DAY_OF_WEEK); // Day of week (Sunday=1)


        System.out.println("Minimum Year: " + minYear);
        System.out.println("Minimum Month: " + minMonth);  // Month is 0-indexed (0=January)
        System.out.println("Minimum Week of Year: " + minWeekOfYear); // Often 1, but check documentation
        System.out.println("Minimum Day of Month: " + minDayOfMonth); // Always 1
        System.out.println("Minimum Day of Week: " + minDayOfWeek); // Usually Sunday=1 (depending on locale)

    }
}
