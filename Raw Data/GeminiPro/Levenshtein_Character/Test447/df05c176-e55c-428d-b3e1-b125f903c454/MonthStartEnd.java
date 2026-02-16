import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class MonthStartEnd {

    public static void main(String[] args) {
        // Get the current year and month (you can change these values)
        int year = LocalDate.now().getYear();
        int month = LocalDate.now().getMonthValue();

        // Alternatively, get year and month from command-line arguments 
        if (args.length == 2) {
            try {
                year = Integer.parseInt(args[0]);
                month = Integer.parseInt(args[1]);
            } catch (NumberFormatException e) {
                System.err.println("Invalid year or month format. Using current date.");
            }
        }


        YearMonth yearMonth = YearMonth.of(year, month);

        LocalDate firstDay = yearMonth.atDay(1);
        LocalDate lastDay = yearMonth.atEndOfMonth();

        // Format the dates for output (optional, but recommended)
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.println("First day of the month: " + firstDay.format(formatter));
        System.out.println("Last day of the month: " + lastDay.format(formatter));

    }
}
