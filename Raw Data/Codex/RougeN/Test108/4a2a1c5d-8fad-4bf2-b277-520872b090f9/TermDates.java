import java.time.LocalDate;
import java.time.Period;

public class TermDates {

    public static void main(String[] args) {
        // Define the start and end dates of the term
        LocalDate startDate = LocalDate.of(2023, 9, 1);
        LocalDate endDate = LocalDate.of(2024, 5, 31);

        // Calculate the period between the start and end dates
        Period period = Period.between(startDate, endDate);

        // Print the term dates in the specified format
        System.out.println("Term dates: " + startDate + " to " + endDate);
        System.out.println("Term length: " + period.getMonths() + " months, " + period.getDays() + " days");
    }
}
