import java.util.Arrays;

public class HexArrayCopy {

    public static void main(String[] args) {
        int[] hexArray = {0x12, 0x34, 0x56, 0x78, 0x9A, 0xBC, 0xDE, 0xF0};

        // Copy the hexArray into a new array
        int[] copyHexArray = Arrays.copyOf(hexArray, hexArray.length);

        // Print the original and copied arrays
        System.out.println("Original Hex Array: " + Arrays.toString(hexArray));
        System.out.println("Copied Hex Array: " + Arrays.toString(copyHexArray));
    }
}
