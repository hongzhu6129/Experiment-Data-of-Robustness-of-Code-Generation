public class MissingNumber {

    public static int findMissingNumber(int[] arr) {
        int sum = 0;

        for (int num : arr) {
            sum += num;
        }

        int expectedSum = (arr.length * (arr.length + 1)) / 2;

        return expectedSum - sum;
    }

    public static void main(String[] args) {
        int[] arr1 = {0, 1, 2, 3, 5};
        int missingNumber1 = findMissingNumber(arr1);
        System.out.println("Missing number in arr1: " + missingNumber1);  // Output: 4

        int[] arr2 = {0, 1, 2, 3, 4, 6, 7, 8};
        int missingNumber2 = findMissingNumber(arr2);
        System.out.println("Missing number in arr2: " + missingNumber2);  // Output: 5

        int[] arr3 = {0};
        int missingNumber3 = findMissingNumber(arr3);
        System.out.println("Missing number in arr3: " + missingNumber3);  // Output: 1

        int[] arr4 = {};
        int missingNumber4 = findMissingNumber(arr4);
        System.out.println("Missing number in arr4: " + missingNumber4);  // Output: 0
    }
}
