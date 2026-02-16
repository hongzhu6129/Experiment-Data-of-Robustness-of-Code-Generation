import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveLeadingZerosIP {

    public static void main(String[] args) {
        String ip1 = "001.123.010.000";
        String ip2 = "255.01.02.003";
        String ip3 = "192.168.0.1";

        System.out.println("Original IP: " + ip1 + ", Validated IP: " + validate(ip1));
        System.out.println("Original IP: " + ip2 + ", Validated IP: " + validate(ip2));
        System.out.println("Original IP: " + ip3 + ", Validated IP: " + validate(ip3));

    }

    public static String validate(String ip) {
        // Regular expression to split the IP address into parts
        Pattern pattern = Pattern.compile("\\.");
        String[] parts = pattern.split(ip);

        StringBuilder validatedIP = new StringBuilder();
        for (int i = 0; i < parts.length; i++) {
            try {
                // Parse each part as an integer to remove leading zeros
                int part = Integer.parseInt(parts[i]);
                validatedIP.append(part);
            } catch (NumberFormatException e) {
                // Handle invalid IP parts (e.g., non-numeric parts)
                return "Invalid IP Address"; 
            }

            // Add the dot separator back, except for the last part
            if (i < parts.length - 1) {
                validatedIP.append(".");
            }
        }
        return validatedIP.toString();
    }
}
