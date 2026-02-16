import java.util.Calendar;
import java.util.GregorianCalendar;

public class MaxDateValues {

    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar(); // Creates a default calendar (current date/time)

        // Get the maximum values for year, month, week of year, and day of month
        int maxYear = calendar.getMaximum(Calendar.YEAR);
        int maxMonth = calendar.getMaximum(Calendar.MONTH); // Months are 0-indexed (0-11)
        int maxWeekOfYear = calendar.getMaximum(Calendar.WEEK_OF_YEAR);
        int maxDayOfMonth = calendar.getMaximum(Calendar.DAY_OF_MONTH);


        System.out.println("Maximum Year: " + maxYear);
        System.out.println("Maximum Month: " + (maxMonth + 1)); // Add 1 to make it 1-indexed (1-12)
        System.out.println("Maximum Week of Year: " + maxWeekOfYear);
        System.out.println("Maximum Day of Month: " + maxDayOfMonth);


        // Example of getting maximum value for a specific date:
        calendar.set(2024, 1, 1); // February 1st, 2024 (Leap year)
        maxDayOfMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH); // Get the max for that month/year
        System.out.println("Maximum Day of Month in Feb 2024: " + maxDayOfMonth);

    }
}
