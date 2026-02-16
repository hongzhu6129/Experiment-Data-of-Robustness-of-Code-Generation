import java.util.Calendar;
import java.util.GregorianCalendar;

public class MinimumValues {

    public static void main(String[] args) {
        // Get the current date and time.
        Calendar calendar = new GregorianCalendar();

        // Get the current year, month, week of year, and day of month.
        int currentYear = calendar.get(Calendar.YEAR);
        int currentMonth = calendar.get(Calendar.MONTH); // Month is 0-indexed (0 = January)
        int currentWeekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
        int currentDayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);

        // Set up a calendar for 1997.
        Calendar calendar1997 = new GregorianCalendar(1997, 0, 1); // January 1, 1997

        // Get the month, week of year, and day of month for 1997.
        int year1997 = calendar1997.get(Calendar.YEAR); 
        int month1997 = calendar1997.get(Calendar.MONTH);
        int weekOfYear1997 = calendar1997.get(Calendar.WEEK_OF_YEAR);
        int dayOfMonth1997 = calendar1997.get(Calendar.DAY_OF_MONTH);


        // Find minimums.  Note that month is 0-indexed.
        int minYear = Math.min(currentYear, year1997);
        int minMonth = Math.min(currentMonth, month1997);
        int minWeek = Math.min(currentWeekOfYear, weekOfYear1997);
        int minDay = Math.min(currentDayOfMonth, dayOfMonth1997);


        System.out.println("Minimum Year: " + minYear);
        System.out.println("Minimum Month (0-indexed): " + minMonth);
        System.out.println("Minimum Week of Year: " + minWeek);
        System.out.println("Minimum Day of Month: " + minDay);


    }
}
