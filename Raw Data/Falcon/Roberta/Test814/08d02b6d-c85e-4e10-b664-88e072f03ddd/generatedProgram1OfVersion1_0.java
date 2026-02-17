import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class DateDifference {

    public static void main(String[] args) {
        // Example dates (you can change these)
        LocalDate date1 = LocalDate.of(2022, 5, 15);
        LocalDate date2 = LocalDate.of(2024, 10, 22);

        // Calculate the difference using Period
        Period period = Period.between(date1, date2);
        int years = period.getYears();
        int months = period.getMonths();
        int days = period.getDays();


        // Calculate total difference in days using ChronoUnit
        long totalDays = ChronoUnit.DAYS.between(date1, date2);

        System.out.println("Difference using Period:");
        System.out.println("Years: " + years);
        System.out.println("Months: " + months);
        System.out.println("Days: " + days);

        System.out.println("\nTotal difference in days: " + totalDays);



         // Example demonstrating handling different date order
        LocalDate date3 = LocalDate.of(2024, 10, 22);
        LocalDate date4 = LocalDate.of(2022, 5, 15);


        Period period2 = Period.between(date4, date3); // Correct order
        long totalDays2 = ChronoUnit.DAYS.between(date4, date3);

        System.out.println("\nDifference between " + date4 + " and " + date3 + ":");
        System.out.println("Years: " + period2.getYears());
        System.out.println("Months: " + period2.getMonths());
        System.out.println("Days: " + period2.getDays());
        System.out.println("Total Days: " + totalDays2);



    }
}
