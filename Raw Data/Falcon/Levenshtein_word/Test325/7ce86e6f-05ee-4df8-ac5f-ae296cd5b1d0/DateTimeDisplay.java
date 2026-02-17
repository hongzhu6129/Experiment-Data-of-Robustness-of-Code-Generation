import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeDisplay {

    public static void main(String[] args) {
        displayCurrentPreviousTime();
    }

    public static void displayCurrentPreviousTime() {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime previousTime = now.minus(1, ChronoUnit.HOURS); // One hour before

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss.SSS");

        System.out.println("Now: " + now.format(formatter));
        System.out.println("Previous Time (1 hour ago): " + previousTime.format(formatter));

    }
}
