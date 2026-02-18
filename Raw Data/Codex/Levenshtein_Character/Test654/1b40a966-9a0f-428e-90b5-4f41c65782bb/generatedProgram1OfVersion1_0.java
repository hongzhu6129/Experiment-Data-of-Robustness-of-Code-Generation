import java.util.Calendar;
import java.util.GregorianCalendar;

public class MinimumCalendarValues {

    public static void main(String[] args) {
        // Get the current date and time using the default calendar (GregorianCalendar)
        Calendar calendar = new GregorianCalendar();

        // Get the minimum values for different fields
        int minYear = calendar.getActualMinimum(Calendar.YEAR);
        int minMonth = calendar.getActualMinimum(Calendar.MONTH); // Months are 0-indexed (0 = January)
        int minWeekOfYear = calendar.getActualMinimum(Calendar.WEEK_OF_YEAR);
        int minDayOfMonth = calendar.getActualMinimum(Calendar.DAY_OF_MONTH); // Day of the month (1-31)

        // Print the minimum values
        System.out.println("Minimum Year: " + minYear);
        System.out.println("Minimum Month (0-indexed): " + minMonth);
        System.out.println("Minimum Week of Year: " + minWeekOfYear);
        System.out.println("Minimum Day of Month: " + minDayOfMonth);


        // Demonstrating how to set the calendar to the minimum values (optional):
        calendar.set(Calendar.YEAR, minYear);
        calendar.set(Calendar.MONTH, minMonth);
        calendar.set(Calendar.DAY_OF_MONTH, minDayOfMonth);


        System.out.println("Date set to minimum values: " + calendar.getTime()); // Print the resulting date



    }
}
