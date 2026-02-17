import java.util.Arrays;

public class StringToByteArray {

    public static void main(String[] args) {
        String str = "Hello World";
        byte[] bytes = str.getBytes();
        System.out.println(Arrays.toString(bytes)); // Output: [72, 101, 108, 108, 111, 32, 87, 111, 114, 108, 100]

        // Corner cases
        str = "";
        bytes = str.getBytes();
        System.out.println(Arrays.toString(bytes)); // Output: []

        str = null;
        bytes = str.getBytes();
        System.out.println(Arrays.toString(bytes)); // Output: []
    }
}
