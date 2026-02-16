import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class LastWeekend {

    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        YearMonth thisMonth = YearMonth.of(today.getYear(), today.getMonth());
        LocalDate lastDayOfMonth = thisMonth.atEndOfMonth();

        LocalDate saturday = null;
        LocalDate sunday = null;


        //Find the last Saturday
        for (LocalDate date = lastDayOfMonth; date.getDayOfMonth() >=1; date = date.minusDays(1)) {
            if (date.getDayOfWeek() == DayOfWeek.SATURDAY) {
                saturday = date;
                break;
            }
        }

        //Find the last Sunday (it will be either the same day as Saturday or the day before).
         for (LocalDate date = lastDayOfMonth; date.getDayOfMonth() >= 1; date = date.minusDays(1)) {
            if (date.getDayOfWeek() == DayOfWeek.SUNDAY) {
                sunday = date;
                break;
            }
        }


        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        System.out.println("Last weekend of the month:");
        System.out.println("Saturday: " + saturday.format(formatter));
        System.out.println("Sunday: " + sunday.format(formatter));


    }
}
