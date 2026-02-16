import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveLeadingZerosIP {

    public static void main(String[] args) {
        String ipAddress = "001.010.000.255";
        String validatedIP = validate(ipAddress);
        System.out.println("Original IP: " + ipAddress);
        System.out.println("Validated IP: " + validatedIP);


        ipAddress = "255.255.255.255";
        validatedIP = validate(ipAddress);
        System.out.println("Original IP: " + ipAddress);
        System.out.println("Validated IP: " + validatedIP);

         ipAddress = "0.0.0.0";
        validatedIP = validate(ipAddress);
        System.out.println("Original IP: " + ipAddress);
        System.out.println("Validated IP: " + validatedIP);

          ipAddress = "0255.0255.0255.0255"; //Invalid IP but demonstrates leading zero removal
        validatedIP = validate(ipAddress);
        System.out.println("Original IP: " + ipAddress);
        System.out.println("Validated IP: " + validatedIP);


    }

    public static String validate(String ip) {
        String[] parts = ip.split("\\.");

        if (parts.length != 4) {
            return "Invalid IP"; // Or throw an exception for better error handling
        }

        try {
            String[] validatedParts = Arrays.stream(parts)
                    .map(part -> String.valueOf(Integer.parseInt(part))) //Parse to int and back to String to remove leading zeros
                    .toArray(String[]::new);


            return String.join(".", validatedParts);
        } catch (NumberFormatException e) {
            return "Invalid IP"; // Or throw the exception for more detailed error handling
        }

    }
}
