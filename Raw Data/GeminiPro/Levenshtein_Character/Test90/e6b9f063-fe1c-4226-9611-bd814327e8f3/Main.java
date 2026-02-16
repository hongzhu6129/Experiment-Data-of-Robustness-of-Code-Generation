public class Main {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 10, 30, 10, 40, 10};
        System.out.println("Does 10 exceed 20 in arr1? " + does10Exceed20(arr1)); // Output: false

        int[] arr2 = {1, 2, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10}; // 25 tens
        System.out.println("Does 10 exceed 20 in arr2? " + does10Exceed20(arr2));  // Output: true


        int[] arr3 = {1, 2, 3, 4, 5};
        System.out.println("Does 10 exceed 20 in arr3? " + does10Exceed20(arr3)); // Output: false


    }

    public static boolean does10Exceed20(int[] arr) {
        int count = 0;
        for (int num : arr) {
            if (num == 10) {
                count++;
            }
        }
        return count > 20; //Check if the count of 10 is greater than 20.
    }
}
