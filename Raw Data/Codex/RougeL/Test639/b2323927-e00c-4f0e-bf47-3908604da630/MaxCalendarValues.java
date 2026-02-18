import java.util.Calendar;

public class MaxCalendarValues {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1; // Month is 0-indexed, so add 1
        int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
        int dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH);


        int maxVal = year;

        if (month > maxVal) {
            maxVal = month;
        }
        if (weekOfYear > maxVal) {
            maxVal = weekOfYear;
        }
        if (dayOfMonth > maxVal) {
            maxVal = dayOfMonth;
        }


        System.out.println("Current Date Information:");
        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Week of Year: " + weekOfYear);
        System.out.println("Day of Month: " + dayOfMonth);

        System.out.println("\nMaximum Value: " + maxVal);


    }
}
