import java.util.Calendar;
import java.util.GregorianCalendar;

public class MinimumCalendarValues {

    public static void main(String[] args) {
        // Create a default calendar instance (GregorianCalendar is the default)
        Calendar calendar = new GregorianCalendar();

        // Get the minimum values for various fields
        int minYear = calendar.getMinimum(Calendar.YEAR);
        int minMonth = calendar.getMinimum(Calendar.MONTH);
        int minWeekOfYear = calendar.getMinimum(Calendar.WEEK_OF_YEAR); // Note: Week of year is locale-dependent
        int minDayOfMonth = calendar.getMinimum(Calendar.DAY_OF_MONTH);  // Same as DAY_OF_MONTH
        int minDayOfWeek = calendar.getMinimum(Calendar.DAY_OF_WEEK); // Day of week (Sunday=1, ..., Saturday=7)

        // Print the minimum values
        System.out.println("Minimum Year: " + minYear);
        System.out.println("Minimum Month: " + minMonth); // 0-indexed (January=0)
        System.out.println("Minimum Week of Year: " + minWeekOfYear); 
        System.out.println("Minimum Day of Month: " + minDayOfMonth);
        System.out.println("Minimum Day of Week: " + minDayOfWeek);



        // Demonstrating changing the date and then getting minimum values (which don't change)
        calendar.set(Calendar.YEAR, 2024);
        calendar.set(Calendar.MONTH, Calendar.DECEMBER);
        calendar.set(Calendar.DAY_OF_MONTH, 31);

        minYear = calendar.getMinimum(Calendar.YEAR);
        minMonth = calendar.getMinimum(Calendar.MONTH);
        minDayOfMonth = calendar.getMinimum(Calendar.DAY_OF_MONTH);


        System.out.println("\nAfter changing the date:");
        System.out.println("Minimum Year: " + minYear);
        System.out.println("Minimum Month: " + minMonth);
        System.out.println("Minimum Day of Month: " + minDayOfMonth);  // Still 1 even though the date is 31st
    }
}
