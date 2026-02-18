import java.util.Calendar;
import java.util.Date;

public class CreateDateWithCalendar {

    public static void main(String[] args) {

        // 1. Get a Calendar instance
        Calendar calendar = Calendar.getInstance();

        // 2. Optionally set specific date and time components
        // For example, to set the date to January 1, 2024:
        calendar.set(Calendar.YEAR, 2024);
        calendar.set(Calendar.MONTH, Calendar.JANUARY); // Month is 0-indexed (0 = January)
        calendar.set(Calendar.DAY_OF_MONTH, 1);


        // You can also set the time:
        calendar.set(Calendar.HOUR_OF_DAY, 10);  // 24-hour clock
        calendar.set(Calendar.MINUTE, 30);
        calendar.set(Calendar.SECOND, 0);


        // 3. Get the Date object from the Calendar
        Date date = calendar.getTime();


        // 4. Print the date (optional)
        System.out.println(date); 

    }
}
