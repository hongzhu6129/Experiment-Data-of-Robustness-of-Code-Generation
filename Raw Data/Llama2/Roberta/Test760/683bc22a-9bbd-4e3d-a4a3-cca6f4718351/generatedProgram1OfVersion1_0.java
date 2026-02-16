import java.util.Calendar;
import java.util.GregorianCalendar;

public class MinimumCalendarValues {

    public static void main(String[] args) {
        // Get the current date and time
        Calendar calendar = new GregorianCalendar();

        // Calculate the previous date (subtract one day)
        calendar.add(Calendar.DAY_OF_MONTH, -1);

        // Get minimum values for year, month, week of year, and day of month
        int minYear = calendar.getActualMinimum(Calendar.YEAR);
        int minMonth = calendar.getActualMinimum(Calendar.MONTH);
        int minWeekOfYear = calendar.getActualMinimum(Calendar.WEEK_OF_YEAR);
        int minDayOfMonth = calendar.getActualMinimum(Calendar.DAY_OF_MONTH);


        System.out.println("Minimum Year: " + minYear);
        System.out.println("Minimum Month: " + minMonth); // Month starts from 0 (January)
        System.out.println("Minimum Week of Year: " + minWeekOfYear);
        System.out.println("Minimum Day of Month: " + minDayOfMonth);


        //  Demonstrating how to get the previous day's actual values (for context/comparison)
        int previousYear = calendar.get(Calendar.YEAR);
        int previousMonth = calendar.get(Calendar.MONTH);  // January is 0
        int previousWeekOfYear = calendar.get(Calendar.WEEK_OF_YEAR); // Note:  Week of year can be tricky across years.
        int previousDayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);

        System.out.println("\nPrevious Day's Values (For Comparison):");
        System.out.println("Previous Year: " + previousYear);
        System.out.println("Previous Month: " + (previousMonth));  // Adding 1 for user readability
        System.out.println("Previous Week of Year: " + previousWeekOfYear);
        System.out.println("Previous Day of Month: " + previousDayOfMonth);
    }
}
