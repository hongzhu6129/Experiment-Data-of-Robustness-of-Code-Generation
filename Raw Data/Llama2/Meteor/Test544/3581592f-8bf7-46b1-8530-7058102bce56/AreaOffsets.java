import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AreaOffsets {

    public static void main(String[] args) {
        // Example usage:
        String offset1 = formatOffset(1234);
        String offset2 = formatOffset(-567);
        String offset3 = formatOffset(0);
        String offset4 = formatOffset(12);
        String offset5 = formatOffset(-1);

        System.out.println("Offset 1: " + offset1); // Output: Offset 1: +01234
        System.out.println("Offset 2: " + offset2); // Output: Offset 2: -00567
        System.out.println("Offset 3: " + offset3); // Output: Offset 3: +00000
        System.out.println("Offset 4: " + offset4); // Output: Offset 4: +00012
        System.out.println("Offset 5: " + offset5); // Output: Offset 5: -00001


        // Demonstrating extraction (you would typically get this from user input or a file)
        String inputString = "The offsets are +01234 and -00567.";
        extractOffsets(inputString);

    }

    private static String formatOffset(int offset) {
        String sign = offset >= 0 ? "+" : "-";
        String formattedOffset = String.format("%s%05d", sign, Math.abs(offset));
        return formattedOffset;

    }


    //Helper function to demonstrate extraction of offsets from a string (not part of the original problem)
    private static void extractOffsets(String input) {
        Pattern pattern = Pattern.compile("[+-]\\d{5}"); // Regular expression to match the format
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            String extractedOffset = matcher.group();
            System.out.println("Extracted Offset: " + extractedOffset);
            try {
                int offsetValue = Integer.parseInt(extractedOffset); // Convert to integer if needed

                System.out.println("Extracted offset value: " + offsetValue);
            } catch (NumberFormatException e) {
                System.err.println("Error converting offset to integer: " + extractedOffset);
            }
        }

    }
}
