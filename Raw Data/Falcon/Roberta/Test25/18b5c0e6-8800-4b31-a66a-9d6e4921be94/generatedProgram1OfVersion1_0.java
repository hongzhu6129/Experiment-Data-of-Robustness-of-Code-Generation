import java.util.Calendar;
import java.util.Date;

public class CreateDateWithCalendar {

    public static void main(String[] args) {

        // 1. Get a Calendar instance
        Calendar calendar = Calendar.getInstance();

        // 2. Optionally set specific date and time components (if you don't, it defaults to the current date and time)
        calendar.set(Calendar.YEAR, 2024);  // Example: Set the year
        calendar.set(Calendar.MONTH, Calendar.JANUARY); // Example: Set the month (0-indexed, January is 0)
        calendar.set(Calendar.DAY_OF_MONTH, 15); // Example: Set the day of the month

        // 3. Get the Date object from the Calendar instance
        Date date = calendar.getTime();

        // 4. Print the date (optional)
        System.out.println(date); 
    }
}
