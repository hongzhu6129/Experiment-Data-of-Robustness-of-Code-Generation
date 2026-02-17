import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class DateComparison {

    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();

        // Calculate date 1 year ago
        LocalDate dateBefore1Year = currentDate.minus(Period.ofYears(1));

        // Calculate date 1 year from now
        LocalDate dateAfter1Year = currentDate.plus(Period.ofYears(1));

        // Format dates for output  (Optional, for better readability)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedCurrentDate = currentDate.format(formatter);
        String formattedDateBefore = dateBefore1Year.format(formatter);
        String formattedDateAfter = dateAfter1Year.format(formatter);


        System.out.println("Current Date: " + formattedCurrentDate);
        System.out.println("Date 1 year ago: " + formattedDateBefore);
        System.out.println("Date 1 year from now: " + formattedDateAfter);


        // Comparisons (Examples)

        // Is the current date after the date 1 year ago? (Should always be true)
        if (currentDate.isAfter(dateBefore1Year)) {
            System.out.println("Current date is after the date 1 year ago.");
        }

        // Is the current date before the date 1 year from now? (Should always be true)
        if (currentDate.isBefore(dateAfter1Year)) {
            System.out.println("Current date is before the date 1 year from now.");
        }


        // More comparison examples � adapt as needed:

        // Check if a date is equal to another
        if (currentDate.isEqual(LocalDate.parse("2024-08-16"))) { // Example date
            System.out.println("Current date is 2024-08-16");
        }

        // Calculate the difference between dates (in years, months, days)
        Period difference = Period.between(dateBefore1Year, currentDate);
        System.out.println("Difference between date 1 year ago and current date: " + difference.getYears() + " years, " + difference.getMonths() + " months, " + difference.getDays() + " days");


    }
}
