import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.time.format.DateTimeFormatter;

public class GetDayAndPreviousFridays {

    public static void main(String[] args) {
        // Get today's date
        LocalDate today = LocalDate.now();

        // Format and print today's date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy");
        System.out.println("Today is: " + today.format(formatter));


        // Get the last 3 Fridays (including today if it's Friday)
        System.out.println("\nLast 3 Fridays (including today if applicable):");
        for (int i = 0; i < 3; i++) {
            LocalDate previousFriday = today.with(TemporalAdjusters.previousOrSame(DayOfWeek.FRIDAY));
            System.out.println(previousFriday.format(formatter));
            today = today.minusDays(1); // Move back a day to find earlier Fridays
        }

        // Alternatively, get the next 3 Fridays (including today if it's Friday)

        // Reset today's date
        today = LocalDate.now();

        System.out.println("\nNext 3 Fridays (including today if applicable):");
        for (int i = 0; i < 3; i++) {
            LocalDate nextFriday = today.with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY));
            System.out.println(nextFriday.format(formatter));
            today = today.plusDays(1); // Move forward a day
        }


    }
}
