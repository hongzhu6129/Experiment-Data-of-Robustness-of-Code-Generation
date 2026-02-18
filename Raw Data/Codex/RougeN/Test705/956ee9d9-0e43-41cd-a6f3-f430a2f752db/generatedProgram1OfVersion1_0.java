import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class TwoWeeksPrior {

    public static void main(String[] args) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Calculate the date 2 weeks ago
        LocalDate twoWeeksAgo = currentDate.minusWeeks(2);

        // Format the date for output (e.g., "yyyy-MM-dd")
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = twoWeeksAgo.format(formatter);

        // Print the date from 2 weeks ago
        System.out.println("The date 2 weeks ago was: " + formattedDate);


        // Example of handling command-line arguments (optional)
        if (args.length > 0) {
            try {
                // Attempt to parse the first argument as a date
                 currentDate = LocalDate.parse(args[0], formatter); 
                 twoWeeksAgo = currentDate.minusWeeks(2);
                 formattedDate = twoWeeksAgo.format(formatter);
                System.out.println("2 weeks before " + args[0] + " was: " + formattedDate);


            } catch (java.time.format.DateTimeParseException e) {
                System.err.println("Invalid date format. Please use yyyy-MM-dd.  Using current date instead.");
            }
        }


    }
}
