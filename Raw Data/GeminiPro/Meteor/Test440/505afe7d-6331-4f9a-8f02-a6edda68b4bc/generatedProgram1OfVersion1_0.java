import java.util.Calendar;
import java.util.GregorianCalendar;

public class MaxCalendarValues {

    public static void main(String[] args) {
        // Get a default calendar (typically represents the current date and time in the default locale and time zone).
        Calendar calendar = new GregorianCalendar(); 

        // Get maximum values. Note:  Some of these may not be useful in practice.
        // For instance, the maximum WEEK_OF_YEAR might be 54 if a week starts on a particular day
        // and the year has a certain configuration.

        int maxYear = calendar.getMaximum(Calendar.YEAR);  //  Get the maximum value for the YEAR field.
        int maxMonth = calendar.getMaximum(Calendar.MONTH); //  Get the maximum value for the MONTH field (0-indexed, so 11 is December).
        int maxWeekOfYear = calendar.getMaximum(Calendar.WEEK_OF_YEAR); // Max week number in a year (can be 52, 53, or even 54)
        int maxDate = calendar.getMaximum(Calendar.DATE);  // Max day of the month (28, 29, 30, or 31 depending on month and year).
		int maxDayOfMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH); // Another way to get max day of the current month.
		int maxDayOfWeek = calendar.getMaximum(Calendar.DAY_OF_WEEK); // Maximum day of the week (typically 7 for Sunday, depending on locale)

        System.out.println("Maximum Year: " + maxYear);
        System.out.println("Maximum Month (0-indexed): " + maxMonth); // 0 represents January, 11 represents December.
        System.out.println("Maximum Week of Year: " + maxWeekOfYear); 
        System.out.println("Maximum Date: " + maxDate);
		System.out.println("Maximum Day of Month: " + maxDayOfMonth);
		System.out.println("Maximum Day of Week: " + maxDayOfWeek); 


    }
}
