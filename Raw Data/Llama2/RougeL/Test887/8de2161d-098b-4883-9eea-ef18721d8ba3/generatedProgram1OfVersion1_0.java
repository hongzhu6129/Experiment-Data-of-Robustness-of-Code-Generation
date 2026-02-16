public class SecondsConverter {

    public static void main(String[] args) {

        // Test cases (including corner cases)
        int[] secondsInputs = {0, 1, 59, 60, 61, 3599, 3600, 3601, 86399, 86400, 86401, Integer.MAX_VALUE};

        for (int seconds : secondsInputs) {
            int originalSeconds = seconds; // Keep a copy for output

            int hours = seconds / 3600;
            seconds = seconds % 3600;

            int minutes = seconds / 60;
            seconds = seconds % 60;


            System.out.println(originalSeconds + " seconds = " + hours + " hours, " + minutes + " minutes, " + seconds + " seconds");
        }


    }
}
