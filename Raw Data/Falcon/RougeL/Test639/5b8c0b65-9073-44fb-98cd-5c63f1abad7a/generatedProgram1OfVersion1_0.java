import java.util.Calendar;

public class MaxCalendarValues {

    public static void main(String[] args) {
        // Get a Calendar instance (default is current date/time)
        Calendar calendar = Calendar.getInstance();

        // Get maximum values
        int maxYear = calendar.getMaximum(Calendar.YEAR); //  No practical limit in current implementations
        int maxMonth = calendar.getMaximum(Calendar.MONTH); // Months are 0-indexed, so 11 (December) is the max
        int maxWeekOfYear = calendar.getMaximum(Calendar.WEEK_OF_YEAR);  // 52 or 53 depending on the year
        int maxDateOfMonth = calendar.getActualMaximum(Calendar.DAY_OF_MONTH); // Varies depending on the month and year


        System.out.println("Maximum Year: " + maxYear);
        System.out.println("Maximum Month: " + (maxMonth +1)); // Add 1 for human-readable month (1-12)
        System.out.println("Maximum Week of Year: " + maxWeekOfYear);
        System.out.println("Maximum Date of Month: " + maxDateOfMonth); 
    }
}
