import java.util.Calendar;

public class MaxValuesFromDate {

    public static void main(String[] args) {
        // Get the current date and time
        Calendar calendar = Calendar.getInstance();

        // Get the year
        int year = calendar.get(Calendar.YEAR);

        // Get the month (0-indexed, so add 1)
        int month = calendar.get(Calendar.MONTH) + 1;

        // Get the week of year
        int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);

        // Get the day of the month
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);

        // Print the values
        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Week of Year: " + weekOfYear);
        System.out.println("Day of Month: " + dayOfMonth);


        // Find the maximum value among year, month, week, and date
        int maxValue = Math.max(year, Math.max(month, Math.max(weekOfYear, dayOfMonth)));

        System.out.println("Maximum value: " + maxValue);
    }
}
