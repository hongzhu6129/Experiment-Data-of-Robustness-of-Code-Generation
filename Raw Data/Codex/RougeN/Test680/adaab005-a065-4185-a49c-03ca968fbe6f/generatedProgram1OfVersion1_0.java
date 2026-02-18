import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class HolidayInfo {

    public static void main(String[] args) {
        // Example 1: New Year's Day (Fixed Date)
        LocalDate newYearsDay = LocalDate.of(2024, Month.JANUARY, 1);  // Adjust year as needed
        displayHolidayInfo("New Year's Day", newYearsDay.atStartOfDay());

        // Example 2: Christmas Day (Fixed Date)
        LocalDate christmasDay = LocalDate.of(2024, Month.DECEMBER, 25);  // Adjust year as needed
        displayHolidayInfo("Christmas Day", christmasDay.atStartOfDay());

        // Example 3: Thanksgiving (4th Thursday of November) - Requires a bit more logic
        int year = 2024; // Adjust year as needed
        LocalDate thanksgiving = getThanksgivingDate(year);
        displayHolidayInfo("Thanksgiving", thanksgiving.atStartOfDay());

    }


    private static LocalDate getThanksgivingDate(int year) {
        LocalDate november1st = LocalDate.of(year, Month.NOVEMBER, 1);
        int dayOfWeek = november1st.getDayOfWeek().getValue(); // 1=Monday, 7=Sunday

        int daysToAdd = (4 - (dayOfWeek % 7)) + 21; // Calculate days to 4th Thursday
        if (daysToAdd < 0) { 
            daysToAdd += 7;
        }


        return november1st.plusDays(daysToAdd);
    }


    private static void displayHolidayInfo(String holidayName, LocalDateTime holidayDateTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        System.out.println(holidayName + ": " + holidayDateTime.format(formatter));

        System.out.println("Year: " + holidayDateTime.getYear());
        System.out.println("Month: " + holidayDateTime.getMonth());
        System.out.println("Day: " + holidayDateTime.getDayOfMonth());
        System.out.println("Hour: " + holidayDateTime.getHour());
        System.out.println("Minute: " + holidayDateTime.getMinute());
        System.out.println("--------------------");
    }
}
