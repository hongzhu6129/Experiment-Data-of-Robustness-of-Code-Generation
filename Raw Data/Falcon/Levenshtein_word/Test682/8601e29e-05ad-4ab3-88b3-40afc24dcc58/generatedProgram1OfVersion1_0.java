import java.util.Calendar;

public class MaxDateParts {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        int currentYear = calendar.get(Calendar.YEAR);
        int currentMonth = calendar.get(Calendar.MONTH) + 1; // Month is 0-indexed
        int currentWeekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
        int currentDayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);


        // Find the maximum value among year, month, week, and date
        int max = currentYear;

        if (currentMonth > max) {
            max = currentMonth;
        }

        if (currentWeekOfYear > max) {
            max = currentWeekOfYear;
        }

        if (currentDayOfMonth > max) {
            max = currentDayOfMonth;
        }

        System.out.println("Current Year: " + currentYear);
        System.out.println("Current Month: " + currentMonth);
        System.out.println("Current Week of Year: " + currentWeekOfYear);
        System.out.println("Current Day of Month: " + currentDayOfMonth);

        System.out.println("Maximum Value: " + max);
    }
}
