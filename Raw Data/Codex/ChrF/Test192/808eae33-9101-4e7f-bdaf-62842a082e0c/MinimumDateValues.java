import java.util.Calendar;
import java.util.GregorianCalendar;

public class MinimumDateValues {

    public static void main(String[] args) {
        // Get the current date and time
        Calendar calendar = new GregorianCalendar();

        // Get minimum values for year, month, week of year, and day of month
        int minYear = calendar.getActualMinimum(Calendar.YEAR);
        int minMonth = calendar.getActualMinimum(Calendar.MONTH); // Month is 0-indexed (0 = January)
        int minWeekOfYear = calendar.getActualMinimum(Calendar.WEEK_OF_YEAR);
        int minDayOfMonth = calendar.getActualMinimum(Calendar.DAY_OF_MONTH);

        // Output the results
        System.out.println("Minimum Year: " + minYear);
        System.out.println("Minimum Month (0-indexed): " + minMonth); // January is 0
        System.out.println("Minimum Week of Year: " + minWeekOfYear); 
        System.out.println("Minimum Day of Month: " + minDayOfMonth);


        // Demonstrate how to set the calendar to minimum values (for illustration)
        calendar.set(Calendar.YEAR, minYear); // Sets the calendar's date to minimum values
        calendar.set(Calendar.MONTH, minMonth);  
        calendar.set(Calendar.DAY_OF_MONTH, minDayOfMonth);

        System.out.println("Date set to minimums: " + calendar.getTime()); // Shows the effect

    }
}
