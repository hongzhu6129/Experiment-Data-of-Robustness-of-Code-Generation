import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class GetTimeInfo {

    public static void main(String[] args) {
        // Get the current date and time
        LocalDateTime now = LocalDateTime.now();

        // Or create a specific date and time
        // LocalDateTime specificTime = LocalDateTime.of(2024, 10, 26, 10, 30, 45);


        // --- Display various time information ---

        System.out.println("Current Date and Time: " + now);

        // Format the output using DateTimeFormatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("Formatted Date and Time: " + now.format(formatter));


        // Get specific components of the date and time
        int year = now.getYear();
        int month = now.getMonthValue(); // 1-12
        int day = now.getDayOfMonth();
        int hour = now.getHour();
        int minute = now.getMinute();
        int second = now.getSecond();
        int nanosecond = now.getNano(); // Nanoseconds

        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
        System.out.println("Hour: " + hour);
        System.out.println("Minute: " + minute);
        System.out.println("Second: " + second);
        System.out.println("Nanosecond: " + nanosecond);



        // Day of the week (e.g., MONDAY)
        System.out.println("Day of the week: " + now.getDayOfWeek());

        // Day of the year (1-365/366)
        System.out.println("Day of the year: " + now.getDayOfYear());


        // --- Working with Time only ---
        LocalTime currentTime = LocalTime.now();

        // Get the hour (0-23)
        int currentHour = currentTime.getHour();

        // Get the hour using ChronoField (another way)
        int currentHourChrono = currentTime.get(ChronoField.HOUR_OF_DAY);


        System.out.println("Current hour: " + currentHour);
        System.out.println("Current hour (using ChronoField): " + currentHourChrono);


        // ---  Example of formatting time ---
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("hh:mm:ss a"); // 12-hour format with AM/PM
        System.out.println("Formatted Time (12-hour): " + currentTime.format(timeFormatter));


    }
}
