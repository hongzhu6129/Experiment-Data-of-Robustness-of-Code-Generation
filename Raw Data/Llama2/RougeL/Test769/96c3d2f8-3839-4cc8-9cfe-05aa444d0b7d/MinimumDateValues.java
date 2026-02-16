import java.util.Calendar;
import java.util.GregorianCalendar;

public class MinimumDateValues {

    public static void main(String[] args) {
        // Get the current date and time using the default calendar
        Calendar calendar = new GregorianCalendar();

        // Get the minimum values for year, month, week of year, and day of month
        int minYear = calendar.getActualMinimum(Calendar.YEAR);
        int minMonth = calendar.getActualMinimum(Calendar.MONTH); // Month starts from 0 (January)
        int minWeekOfYear = calendar.getActualMinimum(Calendar.WEEK_OF_YEAR);
        int minDayOfMonth = calendar.getActualMinimum(Calendar.DAY_OF_MONTH);



        System.out.println("Minimum Year: " + minYear);
        System.out.println("Minimum Month (0-indexed): " + minMonth);
        System.out.println("Minimum Week of Year: " + minWeekOfYear);
        System.out.println("Minimum Day of Month: " + minDayOfMonth);


    }
}
