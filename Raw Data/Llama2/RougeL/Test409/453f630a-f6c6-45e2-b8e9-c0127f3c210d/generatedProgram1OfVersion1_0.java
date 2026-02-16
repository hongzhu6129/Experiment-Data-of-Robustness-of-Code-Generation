import java.util.Arrays;

public class ByteArrayToString {

    public static void main(String[] args) {
        // Create a byte array
        byte[] bytes = {72, 101, 108, 108, 111, 44, 32, 119, 111, 114, 108, 100, 33};

        // Convert the byte array to a string
        String str = new String(bytes);

        // Print the string
        System.out.println(str);
    }
}
