import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveLeadingZerosFromIP {

    public static void main(String[] args) {
        String ipAddress = "001.255.010.000";
        String validatedIP = validate(ipAddress);
        System.out.println("Original IP: " + ipAddress);
        System.out.println("Validated IP: " + validatedIP);

        ipAddress = "255.0.1.2";
        validatedIP = validate(ipAddress);
        System.out.println("Original IP: " + ipAddress);
        System.out.println("Validated IP: " + validatedIP);


        ipAddress = "10.00.0.1";  // Example with single digit parts
        validatedIP = validate(ipAddress);
        System.out.println("Original IP: " + ipAddress);
        System.out.println("Validated IP: " + validatedIP);

        ipAddress = "0.0.0.0";  // Example with all zeros
        validatedIP = validate(ipAddress);
        System.out.println("Original IP: " + ipAddress);
        System.out.println("Validated IP: " + validatedIP);


    }

    public static String validate(String ip) {
        String[] parts = ip.split("\\.");
        return Arrays.stream(parts)
                .map(Integer::parseInt) // Convert to integer to remove leading zeros naturally
                .mapToObj(String::valueOf) // Convert back to string
                .collect(Collectors.joining("."));
    }
}
