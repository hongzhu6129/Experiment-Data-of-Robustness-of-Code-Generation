import java.util.Calendar;

public class MaxCalendarValues {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        // Get the maximum values for year, month, week of year, and day of month
        int maxYear = calendar.getMaximum(Calendar.YEAR);
        int maxMonth = calendar.getMaximum(Calendar.MONTH); // Months are 0-indexed, so max is 11
        int maxWeekOfYear = calendar.getMaximum(Calendar.WEEK_OF_YEAR);
        int maxDayOfMonth = calendar.getMaximum(Calendar.DAY_OF_MONTH);

        // Print the maximum values
        System.out.println("Maximum Year: " + maxYear);
        System.out.println("Maximum Month (0-indexed): " + maxMonth);
        System.out.println("Maximum Week of Year: " + maxWeekOfYear);
        System.out.println("Maximum Day of Month: " + maxDayOfMonth);

        // To get the actual maximum month number (1-12), add 1:
        System.out.println("Maximum Month (1-indexed): " + (maxMonth + 1));


        // Getting the maximum values for the CURRENT year and month:
        int maxDayOfCurrentMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        int maxWeekOfCurrentYear = calendar.getActualMaximum(Calendar.WEEK_OF_YEAR);


        System.out.println("Maximum Day of the Current Month: " + maxDayOfCurrentMonth);
        System.out.println("Maximum Week of the Current Year: " + maxWeekOfCurrentYear);
    }
}
