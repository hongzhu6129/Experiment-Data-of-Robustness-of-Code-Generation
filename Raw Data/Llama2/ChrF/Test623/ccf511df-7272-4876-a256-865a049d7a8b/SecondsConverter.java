import java.util.Scanner;

public class SecondsConverter {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of seconds: ");
        int totalSeconds = input.nextInt();

        int hours = totalSeconds / 3600;
        int remainingSeconds = totalSeconds % 3600;
        int minutes = remainingSeconds / 60;
        int seconds = remainingSeconds % 60;

        System.out.println(totalSeconds + " seconds is equal to " + hours + " hours, " + minutes + " minutes, and " + seconds + " seconds.");

        input.close(); 
    }
}
