import java.util.Arrays;

public class DivideString {

    public static void main(String[] args) {
        String str = "ABCDEFGHIJ";
        int n = 3;

        // Divide the string into n equal parts
        String[] parts = divideString(str, n);

        // Print the divided parts
        System.out.println(Arrays.toString(parts));
    }

    public static String[] divideString(String str, int n) {
        // Check if the string can be divided into n equal parts
        if (str.length() % n != 0) {
            throw new IllegalArgumentException("The string cannot be divided into " + n + " equal parts");
        }

        // Calculate the length of each part
        int partLength = str.length() / n;

        // Create an array to store the divided parts
        String[] parts = new String[n];

        // Divide the string into parts
        for (int i = 0; i < n; i++) {
            parts[i] = str.substring(i * partLength, (i + 1) * partLength);
        }

        // Return the divided parts
        return parts;
    }
}
