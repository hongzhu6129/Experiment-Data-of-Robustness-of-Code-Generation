import java.util.Calendar;
import java.util.GregorianCalendar;

public class MinCalendarValues {

    public static void main(String[] args) {

        // Get a default calendar instance (typically Gregorian)
        Calendar calendar = new GregorianCalendar();

        // Get the "change date" fields.  Interpreting this to mean the minimal values
        // representable for year, month, week of year, and day of month
        // as returned by the Calendar's getMinimum() method.

        int minYear = calendar.getMinimum(Calendar.YEAR);
        int minMonth = calendar.getMinimum(Calendar.MONTH);
        int minWeekOfYear = calendar.getMinimum(Calendar.WEEK_OF_YEAR);
        int minDayOfMonth = calendar.getMinimum(Calendar.DAY_OF_MONTH);


        System.out.println("Minimum Year: " + minYear);
        System.out.println("Minimum Month: " + minMonth);
        System.out.println("Minimum Week of Year: " + minWeekOfYear);
        System.out.println("Minimum Day of Month: " + minDayOfMonth);


    }
}
