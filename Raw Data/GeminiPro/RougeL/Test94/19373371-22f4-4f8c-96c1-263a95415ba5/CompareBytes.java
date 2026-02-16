import java.util.Arrays;

public class CompareBytes {

    public static void main(String[] args) {
        // Create two byte arrays
        byte[] array1 = {1, 2, 3, 4, 5};
        byte[] array2 = {1, 2, 3, 4, 5};

        // Compare the two byte arrays
        boolean areEqual = Arrays.equals(array1, array2);

        // Print the result
        System.out.println("Are the two byte arrays equal? " + areEqual);
    }
}
