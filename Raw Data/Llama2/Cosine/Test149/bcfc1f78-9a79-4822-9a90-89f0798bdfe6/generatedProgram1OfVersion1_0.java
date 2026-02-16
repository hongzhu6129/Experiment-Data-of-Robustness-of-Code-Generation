import java.util.Calendar;
import java.util.GregorianCalendar;

public class MaxCalendarValues {

    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar(); // Use GregorianCalendar for specific fields

        int currentYear = calendar.get(Calendar.YEAR);
        int currentMonth = calendar.get(Calendar.MONTH) + 1; // Month is 0-indexed
        int currentWeekOfYear = calendar.get(Calendar.WEEK_OF_YEAR); 
        int currentDayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);

        // Find the maximum values (these are effectively constants for GregorianCalendar)

        int maxYear = calendar.getMaximum(Calendar.YEAR); // Typically very large
        int maxMonth = calendar.getMaximum(Calendar.MONTH) + 1; // 12
        int maxWeekOfYear = calendar.getMaximum(Calendar.WEEK_OF_YEAR); // 52 or 53 depending on year
        int maxDayOfMonth = calendar.getMaximum(Calendar.DAY_OF_MONTH); // Varies by month, 28-31


        System.out.println("Current Date Information:");
        System.out.println("Year: " + currentYear);
        System.out.println("Month: " + currentMonth);
        System.out.println("Week of Year: " + currentWeekOfYear);
        System.out.println("Day of Month: " + currentDayOfMonth);

        System.out.println("\nMaximum Possible Values:");
        System.out.println("Max Year: " + maxYear);
        System.out.println("Max Month: " + maxMonth);
        System.out.println("Max Week of Year: " + maxWeekOfYear);
        System.out.println("Max Day of Month (for current month): " + maxDayOfMonth);

        // If you need the absolute maximum day of the month (31):
        calendar.set(Calendar.MONTH, Calendar.JANUARY);  // Months where max day is 31 will give correct value
        // calendar.set(Calendar.MONTH, Calendar.FEBRUARY);  // February max is 28 or 29. Incorrect for absolute max.
        int absoluteMaxDayOfMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println("Absolute Max Day of Month (across all months): " + absoluteMaxDayOfMonth);



    }
}
