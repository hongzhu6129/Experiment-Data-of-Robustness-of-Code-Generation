import java.util.Calendar;

public class MaxCalendarValues {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        // Get maximum values
        int maxYear = calendar.getMaximum(Calendar.YEAR); // Effectively no limit (Integer.MAX_VALUE)
        int maxMonth = calendar.getMaximum(Calendar.MONTH); // Months are 0-indexed, so 11 (December)
        int maxWeekOfYear = calendar.getMaximum(Calendar.WEEK_OF_YEAR);  // Depends on the year and locale (52 or 53)
        int maxDayOfMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH); // Depends on the current month and year


        // Output results
        System.out.println("Maximum Year: " + maxYear);
        System.out.println("Maximum Month (0-indexed): " + maxMonth); // Remember, January is 0.
        System.out.println("Maximum Week of Year: " + maxWeekOfYear);
        System.out.println("Maximum Day of Month: " + maxDayOfMonth);


        // Example showing how to get the last day of the current month more efficiently
        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
        System.out.println("Last day of the current month: " + calendar.getTime());
    }
}
