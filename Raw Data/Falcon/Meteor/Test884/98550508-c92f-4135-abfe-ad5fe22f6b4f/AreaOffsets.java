import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AreaOffsets {

    public static void main(String[] args) {
        // Example usage:
        String area1 = "Area[x=10,y=20,width=30,height=40]";
        String area2 = "Area[  x = 5 ,  y= 12, width = 15  ,height=22 ]"; // With extra spaces
        String area3 = "Area[x=-5, y=0, width=10, height=5]"; // Negative x-offset

        System.out.println("Area 1 offsets: " + formatOffset(extractOffset(area1, "x")) + ", " 
                           + formatOffset(extractOffset(area1, "y")) + ", "
                           + formatOffset(extractOffset(area1, "width")) + ", "
                           + formatOffset(extractOffset(area1, "height")));


        System.out.println("Area 2 offsets: " + formatOffset(extractOffset(area2, "x")) + ", " 
                           + formatOffset(extractOffset(area2, "y")) + ", "
                           + formatOffset(extractOffset(area2, "width")) + ", "
                           + formatOffset(extractOffset(area2, "height")));

        System.out.println("Area 3 offsets: " + formatOffset(extractOffset(area3, "x")) + ", " 
                           + formatOffset(extractOffset(area3, "y")) + ", "
                           + formatOffset(extractOffset(area3, "width")) + ", "
                           + formatOffset(extractOffset(area3, "height")));


    }


    private static int extractOffset(String areaString, String offsetName) {
        // Use regular expression to extract the offset value.
        // Handles spaces and negative numbers.
        Pattern pattern = Pattern.compile(offsetName + "\\s*=\\s*(-?\\d+)");
        Matcher matcher = pattern.matcher(areaString);

        if (matcher.find()) {
            return Integer.parseInt(matcher.group(1));
        } else {
            // Handle cases where the offset is not found (e.g., invalid input)
            System.err.println("Error: Offset '" + offsetName + "' not found in string: " + areaString);
            return 0; // Or throw an exception if appropriate.
        }
    }



    private static String formatOffset(int offset) {
        return String.valueOf(offset); // Simply convert to String
    }
}
