import java.util.Calendar;
import java.util.GregorianCalendar;

public class MinimumValues {

    public static void main(String[] args) {

        // Get the current date and time
        Calendar currentDate = new GregorianCalendar();

        // Create a calendar representing 1997, January 1st (minimum values we're interested in)
        Calendar minDate = new GregorianCalendar(1997, Calendar.JANUARY, 1);

        // Get the minimum values
        int minYear = 1997; // Already specified as the minimum
        int minMonth = Math.min(currentDate.get(Calendar.MONTH), minDate.get(Calendar.MONTH));
        int minWeekOfYear = Math.min(currentDate.get(Calendar.WEEK_OF_YEAR), minDate.get(Calendar.WEEK_OF_YEAR)); // Caution: Week of year can be tricky due to calendar systems and locale
        int minDayOfMonth = Math.min(currentDate.get(Calendar.DAY_OF_MONTH), minDate.get(Calendar.DAY_OF_MONTH));


        System.out.println("Minimum Year: " + minYear);
        System.out.println("Minimum Month (0-indexed): " + minMonth);  // Months are 0-indexed (January=0)
        System.out.println("Minimum Week of Year: " + minWeekOfYear); // Be cautious about week of year interpretation
        System.out.println("Minimum Day of Month: " + minDayOfMonth);



    }
}
