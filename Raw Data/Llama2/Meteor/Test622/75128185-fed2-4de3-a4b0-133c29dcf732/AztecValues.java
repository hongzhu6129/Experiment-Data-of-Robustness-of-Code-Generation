import java.util.HashMap;
import java.util.Map;

public class AztecValues {

    public static void main(String[] args) {
        Map<Integer, String> aztecValues = new HashMap<>();
        aztecValues.put(1, "A");
        aztecValues.put(2, "B");
        aztecValues.put(3, "C");
        aztecValues.put(4, "D");
        aztecValues.put(5, "E");
        aztecValues.put(6, "F");
        aztecValues.put(7, "G");
        aztecValues.put(8, "H");
        aztecValues.put(9, "I");
        aztecValues.put(10, "J");
        aztecValues.put(11, "K");
        aztecValues.put(12, "L");
        aztecValues.put(13, "M");
        aztecValues.put(14, "N");
        aztecValues.put(15, "O");
        aztecValues.put(16, "P");
        aztecValues.put(17, "Q");
        aztecValues.put(18, "R");
        aztecValues.put(19, "S");
        aztecValues.put(20, "T");

        // Test cases
        System.out.println(getAztecValue(1)); // Output: A
        System.out.println(getAztecValue(10)); // Output: J
        System.out.println(getAztecValue(20)); // Output: T
        System.out.println(getAztecValue(0)); // Output: Invalid input
        System.out.println(getAztecValue(21)); // Output: Invalid input
    }

    public static String getAztecValue(int number) {
        if (number <= 0 || number > 20) {
            return "Invalid input";
        }
        return aztecValues.get(number);
    }
}
