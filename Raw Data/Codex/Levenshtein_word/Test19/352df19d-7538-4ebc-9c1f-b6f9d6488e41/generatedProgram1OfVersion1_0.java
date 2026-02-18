import java.time.Period;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class PeriodAndDuration {

    public static void main(String[] args) {
        // Example usage of Period (date-based)
        LocalDate startDate = LocalDate.of(2023, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 2, 15);
        Period period = Period.between(startDate, endDate);

        System.out.println("Period between " + startDate + " and " + endDate + ": " + periodToYMD(period));


        // Example usage of Duration (time-based)
        LocalDateTime startTime = LocalDateTime.of(2024, 2, 15, 10, 0, 0);
        LocalDateTime endTime = LocalDateTime.of(2024, 2, 15, 12, 30, 0);
        Duration duration = Duration.between(startTime, endTime);

        System.out.println("Duration between " + startTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME) +
                " and " + endTime.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME) + ": " + duration);
        // Accessing duration components:
        long hours = duration.toHours();
        long minutes = duration.toMinutesPart(); // Since Java 9
        long seconds = duration.toSecondsPart(); // Since Java 9

        System.out.println(hours + " hours, " + minutes + " minutes, " + seconds + " seconds");

    }


    private static String periodToYMD(Period period) {
        return period.getYears() + " years, " + period.getMonths() + " months, " + period.getDays() + " days";
    }
}
