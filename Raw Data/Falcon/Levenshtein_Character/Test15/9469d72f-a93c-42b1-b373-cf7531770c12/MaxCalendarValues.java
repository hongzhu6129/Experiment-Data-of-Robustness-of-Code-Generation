import java.util.Calendar;

public class MaxCalendarValues {

    public static void main(String[] args) {
        // Get the current date and time
        Calendar calendar = Calendar.getInstance();

        // Get the maximum values for year, month, week of year, and day of month
        int maxYear = calendar.getActualMaximum(Calendar.YEAR);
        int maxMonth = calendar.getActualMaximum(Calendar.MONTH);  // Months are 0-indexed (0-11)
        int maxWeekOfYear = calendar.getActualMaximum(Calendar.WEEK_OF_YEAR);
        int maxDayOfMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);



        System.out.println("Maximum Year: " + maxYear);
        System.out.println("Maximum Month (0-indexed): " + maxMonth);  // Output will be 11
        System.out.println("Maximum Week of Year: " + maxWeekOfYear);
        System.out.println("Maximum Day of Month: " + maxDayOfMonth);


    }
}
