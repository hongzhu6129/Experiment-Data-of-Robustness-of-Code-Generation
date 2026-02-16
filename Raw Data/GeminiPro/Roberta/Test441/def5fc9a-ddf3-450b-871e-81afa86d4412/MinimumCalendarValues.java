import java.util.Calendar;

public class MinimumCalendarValues {

    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        int minYear = calendar.getActualMinimum(Calendar.YEAR);
        int minMonth = calendar.getActualMinimum(Calendar.MONTH);
        int minWeekOfYear = calendar.getActualMinimum(Calendar.WEEK_OF_YEAR);
        int minDayOfMonth = calendar.getActualMinimum(Calendar.DAY_OF_MONTH);
       
        System.out.println("Minimum Year: " + minYear);
        System.out.println("Minimum Month: " + (minMonth + 1)); // Month is 0-indexed
        System.out.println("Minimum Week of Year: " + minWeekOfYear);
        System.out.println("Minimum Day of Month: " + minDayOfMonth); 
    }
}
