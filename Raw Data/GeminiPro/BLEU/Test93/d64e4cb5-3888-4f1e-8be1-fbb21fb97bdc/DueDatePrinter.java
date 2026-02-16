import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DueDatePrinter {

    public static void main(String[] args) {
        String dueDateString1 = "2023-03-08";
        String dueDateString2 = "2023-03-08T10:15:30";

        try {
            Date dueDate1 = new SimpleDateFormat("yyyy-MM-dd").parse(dueDateString1);
            Date dueDate2 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss").parse(dueDateString2);

            System.out.println("Due Date 1: " + dueDate1);
            System.out.println("Due Date 2: " + dueDate2);
        } catch (ParseException e) {
            System.out.println("Invalid due date format.");
        }
    }
}
