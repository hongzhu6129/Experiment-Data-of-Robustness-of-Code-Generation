import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.TemporalAdjusters;

public class LastDayOfMonth {

    public static void main(String[] args) {

        // Get the current date
        LocalDate currentDate = LocalDate.now();

        // Calculate the last day of the current month
        LocalDate lastDayOfCurrentMonth = currentDate.with(TemporalAdjusters.lastDayOfMonth());

        // Print the last day of the current month
        System.out.println("Last day of the current month: " + lastDayOfCurrentMonth);


        // Example with a specific month (e.g., October)  
        LocalDate dateInOctober = LocalDate.of(2024, Month.OCTOBER, 15); // Arbitrary day in October
        LocalDate lastDayOfOctober = dateInOctober.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("Last day of October 2024: " + lastDayOfOctober);


        // Example getting input from the user (for a more interactive program - you would need to handle potential exceptions)
        // This is just a basic illustration and a full implementation would require more robust input validation.
        if (args.length > 0) {  // Check if user provided an argument
            try {
                int monthInput = Integer.parseInt(args[0]); 
                if (monthInput >= 1 && monthInput <= 12) {
                    LocalDate date = LocalDate.of(currentDate.getYear(), monthInput, 1); // Day 1 of the specified month
                    LocalDate lastDay = date.with(TemporalAdjusters.lastDayOfMonth());
                    System.out.println("Last day of month " + monthInput + " in " + currentDate.getYear() + ": " + lastDay);
                } else {
                    System.out.println("Invalid month input.  Please enter a number between 1 and 12.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid month number.");
            }
        }




    }
}
