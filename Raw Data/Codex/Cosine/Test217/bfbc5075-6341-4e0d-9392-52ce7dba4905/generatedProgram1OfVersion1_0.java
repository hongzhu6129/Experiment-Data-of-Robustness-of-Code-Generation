import java.util.Calendar;

public class MaxCalendarValues {

    public static void main(String[] args) {
        // Get an instance of the default calendar
        Calendar calendar = Calendar.getInstance();

        // Set the calendar to the previous date
        calendar.add(Calendar.DATE, -1); // Decrement by one day

        // Get the maximum values for year, month, week of year, and day of month
        int maxYear = calendar.getActualMaximum(Calendar.YEAR);
        int maxMonth = calendar.getActualMaximum(Calendar.MONTH); 
        int maxWeekOfYear = calendar.getActualMaximum(Calendar.WEEK_OF_YEAR);
        int maxDayOfMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);


        System.out.println("Maximum Year: " + maxYear);
        System.out.println("Maximum Month: " + (maxMonth + 1)); // Month is 0-indexed, so add 1
        System.out.println("Maximum Week of Year: " + maxWeekOfYear);
        System.out.println("Maximum Day of Month (for the previous date's month): " + maxDayOfMonth);


    }
}
