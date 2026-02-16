import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.TemporalAdjusters;

public class HolidayInfo {

    public static void main(String[] args) {
        // Example 1: New Year's Day (January 1st)
        LocalDate newYearsDay = LocalDate.of(LocalDate.now().getYear(), Month.JANUARY, 1);
        displayHolidayInfo("New Year's Day", newYearsDay.atStartOfDay());

        // Example 2: Christmas Day (December 25th)
        LocalDate christmasDay = LocalDate.of(LocalDate.now().getYear(), Month.DECEMBER, 25);
        displayHolidayInfo("Christmas Day", christmasDay.atStartOfDay());

        // Example 3: Labor Day (First Monday of September)
        LocalDate laborDay = LocalDate.of(LocalDate.now().getYear(), Month.SEPTEMBER, 1)
                .with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));
        displayHolidayInfo("Labor Day", laborDay.atStartOfDay());



        // Example 4: Thanksgiving (Fourth Thursday of November)
        LocalDate thanksgiving = LocalDate.of(LocalDate.now().getYear(), Month.NOVEMBER, 1)
                .with(TemporalAdjusters.dayOfWeekInMonth(4, DayOfWeek.THURSDAY));
        displayHolidayInfo("Thanksgiving", thanksgiving.atStartOfDay());

         // Example 5: Memorial day (Last Monday of May)
        LocalDate memorialDay = LocalDate.of(LocalDate.now().getYear(), Month.MAY, 1)
                .with(TemporalAdjusters.lastInMonth(DayOfWeek.MONDAY));

        displayHolidayInfo("Memorial Day", memorialDay.atStartOfDay());


    }

    public static void displayHolidayInfo(String holidayName, LocalDateTime holidayDate) {
        System.out.println(holidayName + ":");
        System.out.println("Year: " + holidayDate.getYear());
        System.out.println("Month: " + holidayDate.getMonth());
        System.out.println("Day: " + holidayDate.getDayOfMonth());
        System.out.println("Hour: " + holidayDate.getHour()); // Will be 0 as we use atStartOfDay()
        System.out.println("Minute: " + holidayDate.getMinute()); // Will be 0 as we use atStartOfDay()
        System.out.println("--------------------");
    }
}
