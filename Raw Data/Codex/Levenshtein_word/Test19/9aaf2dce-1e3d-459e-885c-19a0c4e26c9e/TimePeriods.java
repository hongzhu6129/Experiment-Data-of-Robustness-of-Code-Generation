import java.time.Duration;
import java.time.Period;
import java.time.format.DateTimeParseException;

public class TimePeriods {

    public static void main(String[] args) {
        // Example usage of Period
        Period period = Period.of(1, 2, 3); // 1 year, 2 months, 3 days
        System.out.println("Period: " + periodToYMD(period));

        Period period2 = Period.parse("P2Y3M5D"); // Parse from string
        System.out.println("Period2: " + periodToYMD(period2));


        try {
            Period invalidPeriod = Period.parse("P2YM5D"); // Invalid format - will throw exception
        } catch (DateTimeParseException e) {
            System.out.println("Invalid period format: " + e.getMessage());
        }

        // Example usage of Duration
        Duration duration = Duration.ofDays(3); // 3 days
        System.out.println("Duration: " + duration);

        Duration duration2 = Duration.ofHours(48); // 48 hours (2 days)
        System.out.println("Duration2: " + duration2);

        Duration duration3 = Duration.parse("PT1H30M"); // 1 hour 30 minutes
        System.out.println("Duration3: " + duration3);



        try {
            Duration invalidDuration = Duration.parse("P1H30M"); // Invalid format - will throw exception
        } catch (DateTimeParseException e) {
            System.out.println("Invalid duration format: " + e.getMessage());
        }
    }


    private static String periodToYMD(Period period) {
        return period.getYears() + " years, " + period.getMonths() + " months, " + period.getDays() + " days";
    }
}
