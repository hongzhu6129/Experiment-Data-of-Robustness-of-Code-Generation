import java.util.Calendar;
import java.util.GregorianCalendar;

public class MinimumValues {

    public static void main(String[] args) {
        // Get the current date and time
        Calendar calendar = new GregorianCalendar();

        // Get the minimum values
        int minYear = calendar.getActualMinimum(Calendar.YEAR);
        int minMonth = calendar.getActualMinimum(Calendar.MONTH);
        int minDayOfWeek = calendar.getActualMinimum(Calendar.DAY_OF_WEEK); // Sunday (1)
        int minDate = calendar.getActualMinimum(Calendar.DATE); // 1

        // Print the minimum values
        System.out.println("Minimum Year: " + minYear); //  1
        System.out.println("Minimum Month: " + (minMonth +1)); // January (1), displayed as 1 because months are 0-indexed. We add 1 for user readability.
        System.out.println("Minimum Day of Week (Sunday=1): " + minDayOfWeek); // Sunday (1)
        System.out.println("Minimum Date: " + minDate); // 1

          //If you specifically need the minimum DAY_OF_WEEK that represents Thursday:
        // There isn't a direct way to get the "minimum Thursday". The minimum DAY_OF_WEEK is always Sunday (1). 
        // If you needed to work with a Thursday, you would typically set the calendar to a known Thursday using set(DAY_OF_WEEK, Calendar.THURSDAY) and then perform calculations.
         calendar.set(Calendar.DAY_OF_WEEK, Calendar.THURSDAY);
         System.out.println("Example of setting day to Thursday: " + calendar.getTime());

    }
}
