import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class FirstAndLastDayOfMonth {

    public static void main(String[] args) {
        // Get the current year and month (you can modify this to get input from the user)
        int year = LocalDate.now().getYear();
        int month = LocalDate.now().getMonthValue();


        // Using YearMonth
        YearMonth yearMonth = YearMonth.of(year, month);

        LocalDate firstDay = yearMonth.atDay(1);
        LocalDate lastDay = yearMonth.atEndOfMonth();

        // Format the dates for output (optional)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.println("First day of the month: " + firstDay.format(formatter));
        System.out.println("Last day of the month: " + lastDay.format(formatter));



        // Example with user input (basic, no error handling):
        if (args.length == 2) {
            try {
                year = Integer.parseInt(args[0]);
                month = Integer.parseInt(args[1]);

                yearMonth = YearMonth.of(year, month);
                firstDay = yearMonth.atDay(1);
                lastDay = yearMonth.atEndOfMonth();
                System.out.println("First day of the month: " + firstDay.format(formatter));
                System.out.println("Last day of the month: " + lastDay.format(formatter));

            } catch (NumberFormatException e) {
                System.err.println("Invalid input. Please provide year and month as integers.");
            }

        }  // End of user input example


    }
}
