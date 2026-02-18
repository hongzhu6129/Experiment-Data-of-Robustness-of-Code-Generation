import java.util.Calendar;

public class MaxCalendarValues {

    public static void main(String[] args) {
        // Get a default calendar instance
        Calendar calendar = Calendar.getInstance();

        // Get maximum values
        int maxYear = calendar.getMaximum(Calendar.YEAR);
        int maxMonth = calendar.getMaximum(Calendar.MONTH); // Months are 0-indexed (0-11)
        int maxWeekOfYear = calendar.getMaximum(Calendar.WEEK_OF_YEAR);
        int maxDate = calendar.getMaximum(Calendar.DAY_OF_MONTH);


        System.out.println("Maximum Year: " + maxYear);
        System.out.println("Maximum Month: " + (maxMonth + 1)); // Add 1 for human-readable format (1-12)
        System.out.println("Maximum Week of Year: " + maxWeekOfYear);
        System.out.println("Maximum Date: " + maxDate); 

    }
}
