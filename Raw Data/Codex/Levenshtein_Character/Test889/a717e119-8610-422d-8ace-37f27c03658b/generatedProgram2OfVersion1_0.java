import java.util.Scanner;

public class DecimalToHexadecimal {

    public static String function(int decimal) {
        return Long.toHexString(decimal); // Using Long.toHexString() to handle negatives correctly.
    }

    // ... (rest of the code is the same)
}
