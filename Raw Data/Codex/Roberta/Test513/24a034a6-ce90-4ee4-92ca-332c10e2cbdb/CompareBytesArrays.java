import java.util.Arrays;

public class CompareBytesArrays {

    public static void main(String[] args) {
        // Test cases
        byte[] arr1 = {1, 2, 3};
        byte[] arr2 = {1, 2, 3};
        byte[] arr3 = {1, 2, 4};
        byte[] arr4 = {1, 2};
        byte[] arr5 = {};

        // Expected results
        boolean expected1 = true;
        boolean expected2 = true;
        boolean expected3 = false;
        boolean expected4 = false;
        boolean expected5 = false;

        // Actual results
        boolean actual1 = Arrays.equals(arr1, arr2);
        boolean actual2 = Arrays.equals(arr2, arr3);
        boolean actual3 = Arrays.equals(arr3, arr4);
        boolean actual4 = Arrays.equals(arr4, arr5);
        boolean actual5 = Arrays.equals(arr5, arr1);

        // Assertions
        assert actual1 == expected1;
        assert actual2 == expected2;
        assert actual3 == expected3;
        assert actual4 == expected4;
        assert actual5 == expected5;
    }
}
