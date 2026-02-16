import java.util.Calendar;
import java.util.GregorianCalendar;

public class MinimumCalendarValues {

    public static void main(String[] args) {
        // Get a default calendar instance (GregorianCalendar)
        Calendar calendar = new GregorianCalendar();

        // Get minimum values for year, month, week of year, day of month
        int minYear = calendar.getMinimum(Calendar.YEAR);
        int minMonth = calendar.getMinimum(Calendar.MONTH);
        int minWeekOfYear = calendar.getMinimum(Calendar.WEEK_OF_YEAR);
        int minDayOfMonth = calendar.getMinimum(Calendar.DAY_OF_MONTH);

        // Output the results
        System.out.println("Minimum Year: " + minYear);
        System.out.println("Minimum Month: " + minMonth); // Note: Month is 0-based (January=0)
        System.out.println("Minimum Week of Year: " + minWeekOfYear);
        System.out.println("Minimum Day of Month: " + minDayOfMonth);
    }
}

