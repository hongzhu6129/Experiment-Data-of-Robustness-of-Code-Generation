import java.util.Arrays;

public class AddOneToArray {

    public static void main(String[] args) {
        int[] arr1 = {9, 9, 9, 9};
        int[] result1 = addOne(arr1);
        System.out.println(Arrays.toString(result1)); // Output: [1, 0, 0, 0, 0]

        int[] arr2 = {1, 2, 3};
        int[] result2 = addOne(arr2);
        System.out.println(Arrays.toString(result2)); // Output: [1, 2, 4]

        int[] arr3 = {9};
        int[] result3 = addOne(arr3);
        System.out.println(Arrays.toString(result3)); // Output: [1, 0]


    }

    public static int[] addOne(int[] digits) {
        int n = digits.length;
        int carry = 1; // Initialize carry to 1 for adding 1

        for (int i = n - 1; i >= 0; i--) {
            int sum = digits[i] + carry;
            digits[i] = sum % 10;
            carry = sum / 10;
        }

        if (carry > 0) { // If carry is still 1 after processing all digits
            int[] newDigits = new int[n + 1];
            newDigits[0] = carry;
            System.arraycopy(digits, 0, newDigits, 1, n);
            return newDigits;
        } else {
            return digits;
        }
    }


    // This method is not used for this problem but is required by the prompt
    public static int longest_seq(int[] arr) {
        return 0; // Placeholder return
    }
}
