import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class LastWeekend {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        LocalDate lastDayOfMonth = today.with(TemporalAdjusters.lastDayOfMonth());

        // Find the last Saturday
        LocalDate lastSaturday = lastDayOfMonth;
        while (lastSaturday.getDayOfWeek() != DayOfWeek.SATURDAY) {
            lastSaturday = lastSaturday.minusDays(1);
        }

        // Find the last Sunday (which will be the day after the last Saturday)
        LocalDate lastSunday = lastSaturday.plusDays(1);

        System.out.println("Last weekend of the month:");
        System.out.println("Saturday: " + lastSaturday);
        System.out.println("Sunday: " + lastSunday);


    }
}
