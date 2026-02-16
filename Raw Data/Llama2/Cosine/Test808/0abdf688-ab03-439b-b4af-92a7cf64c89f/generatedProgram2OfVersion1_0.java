class Solution {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 7, 8, 9, 5};
       // ... other test cases

        // Example with inline logic within main (less readable but meets the constraint)
        System.out.println(arr1.length > 0 && arr2.length > 0 && arr1[0] == arr2[0] && arr1[arr1.length - 1] == arr2[arr2.length - 1]);

        // ... other test cases similarly inlined
    }
}
