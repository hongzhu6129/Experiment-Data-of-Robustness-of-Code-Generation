import java.util.Calendar;
import java.util.GregorianCalendar;

public class MaxCalendarValues {

    public static void main(String[] args) {
        // Create a default calendar instance (typically represents the current date and time)
        Calendar calendar = new GregorianCalendar(); 

        // Get maximum values
        int maxYear = calendar.getMaximum(Calendar.YEAR);
        int maxMonth = calendar.getMaximum(Calendar.MONTH); // 0-indexed, so 11 represents December
        int maxWeekOfYear = calendar.getMaximum(Calendar.WEEK_OF_YEAR); 
        int maxDate = calendar.getMaximum(Calendar.DAY_OF_MONTH); // Day of the month (1-31)


        System.out.println("Maximum Year: " + maxYear);
        System.out.println("Maximum Month (0-indexed): " + maxMonth);
        System.out.println("Maximum Week of Year: " + maxWeekOfYear);
        System.out.println("Maximum Date (Day of Month): " + maxDate); 
    }
}
