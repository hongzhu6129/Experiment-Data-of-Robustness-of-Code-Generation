import java.util.Calendar;
import java.util.GregorianCalendar;

public class MinimumDateValues {

    public static void main(String[] args) {

        // Get a default calendar instance (GregorianCalendar)
        Calendar calendar = new GregorianCalendar();

        // Get minimum values
        int minYear = calendar.getMinimum(Calendar.YEAR);
        int minMonth = calendar.getMinimum(Calendar.MONTH); // Note: Month is 0-indexed (January = 0)
        int minWeekOfYear = calendar.getMinimum(Calendar.WEEK_OF_YEAR);
        int minDayOfMonth = calendar.getMinimum(Calendar.DAY_OF_MONTH); // Same as DAY_OF_WEEK_IN_MONTH

        // Display the results
        System.out.println("Minimum Year: " + minYear);
        System.out.println("Minimum Month (0-indexed): " + minMonth);
        System.out.println("Minimum Week of Year: " + minWeekOfYear);
        System.out.println("Minimum Day of Month: " + minDayOfMonth);


    }
}
