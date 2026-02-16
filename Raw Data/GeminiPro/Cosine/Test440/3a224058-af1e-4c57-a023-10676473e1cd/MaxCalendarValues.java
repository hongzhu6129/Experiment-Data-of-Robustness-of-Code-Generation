import java.util.Calendar;

public class MaxCalendarValues {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        int maxYear = calendar.getMaximum(Calendar.YEAR);
        int maxMonth = calendar.getMaximum(Calendar.MONTH); // Months are 0-indexed, so max is 11
        int maxWeekOfYear = calendar.getMaximum(Calendar.WEEK_OF_YEAR);
        int maxDate = calendar.getMaximum(Calendar.DATE); // Synonymous with DAY_OF_MONTH

        System.out.println("Maximum Year: " + maxYear);
        System.out.println("Maximum Month (0-indexed): " + maxMonth);
        System.out.println("Maximum Week of Year: " + maxWeekOfYear);
        System.out.println("Maximum Date (Day of Month): " + maxDate);


    }
}
