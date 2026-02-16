import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class CurrentLocalTime {

    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss"); // You can customize the format
        String formattedTime = currentTime.format(formatter);
        System.out.println("Current Local Time: " + formattedTime); 
    }
}
