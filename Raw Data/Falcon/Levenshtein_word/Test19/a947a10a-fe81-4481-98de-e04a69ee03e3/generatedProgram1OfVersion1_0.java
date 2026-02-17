import java.time.Period;
import java.time.Duration;
import java.time.format.DateTimeParseException;

public class PeriodAndDuration {

    public static void main(String[] args) {
        // Examples of Period (Date-based)
        Period period1 = Period.ofYears(2);
        Period period2 = Period.ofMonths(6);
        Period period3 = Period.ofWeeks(3); // Note: weeks are converted to days
        Period period4 = Period.of(1, 2, 3); // 1 year, 2 months, 3 days

        System.out.println("Period 1: " + periodToYMD(period1));
        System.out.println("Period 2: " + periodToYMD(period2));
        System.out.println("Period 3: " + periodToYMD(period3));
        System.out.println("Period 4: " + periodToYMD(period4));



        // Examples of Duration (Time-based)
        Duration duration1 = Duration.ofDays(1);
        Duration duration2 = Duration.ofHours(12);
        Duration duration3 = Duration.ofMinutes(30);
        Duration duration4 = Duration.ofSeconds(15);
        Duration duration5 = Duration.ofMillis(500);
        Duration duration6 = Duration.ofNanos(1000000); // 1 millisecond = 1,000,000 nanoseconds


        System.out.println("Duration 1: " + duration1);
        System.out.println("Duration 2: " + duration2);
        System.out.println("Duration 3: " + duration3);
        System.out.println("Duration 4: " + duration4);
        System.out.println("Duration 5: " + duration5);
        System.out.println("Duration 6: " + duration6);



        // Example of parsing a Period (handle exceptions)
        String periodString = "P1Y2M3D";
        try {
            Period parsedPeriod = Period.parse(periodString);
            System.out.println("Parsed Period: " + periodToYMD(parsedPeriod));
        } catch (DateTimeParseException e) {
            System.err.println("Invalid Period format: " + e.getMessage());
        }

         // Example of parsing a Duration (handle exceptions)
         String durationString = "PT1H2M3S"; // 1 hour, 2 minutes, 3 seconds
        try {
            Duration parsedDuration = Duration.parse(durationString);
            System.out.println("Parsed Duration: " + parsedDuration);
        } catch (DateTimeParseException e) {
            System.err.println("Invalid Duration format: " + e.getMessage());
        }

    }

    private static String periodToYMD(Period period) {
        return period.getYears() + " years, " +
               period.getMonths() + " months, " +
               period.getDays() + " days";
    }
}
