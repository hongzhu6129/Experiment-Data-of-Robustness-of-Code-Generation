public class SecondsConverter {

    public static String secondsToHMS(int totalSeconds) {
        if (totalSeconds < 0) {
            return "Invalid input: Seconds must be non-negative.";
        }

        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(secondsToHMS(3661));   // Output: 01:01:01
        System.out.println(secondsToHMS(7200));   // Output: 02:00:00
        System.out.println(secondsToHMS(60));     // Output: 00:01:00
        System.out.println(secondsToHMS(5));      // Output: 00:00:05
        System.out.println(secondsToHMS(0));      // Output: 00:00:00
        System.out.println(secondsToHMS(-5));     // Output: Invalid input: Seconds must be non-negative.
        System.out.println(secondsToHMS(86400)); // Output: 24:00:00  (A full day)
        System.out.println(secondsToHMS(Integer.MAX_VALUE)); // Handles large numbers


    }
}
