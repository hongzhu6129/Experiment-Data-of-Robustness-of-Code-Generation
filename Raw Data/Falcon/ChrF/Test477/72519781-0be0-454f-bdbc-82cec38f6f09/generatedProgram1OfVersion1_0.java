import java.util.Arrays;

public class LargestOfThree {

    public static void main(String[] args) {
        // Example usage:
        int[] arr1 = {10, 20, 30, 40, 50, 60};
        findLargestOfThree(arr1); // Output: 60

        int[] arr2 = {5, 2, 8, 1, 9, 4};
        findLargestOfThree(arr2); // Output: 9

        int[] arr3 = {1, 1, 1, 1, 1, 10};
        findLargestOfThree(arr3); //Output 10

        int[] arr4 = {}; //Empty array
        findLargestOfThree(arr4); // Output: Array is empty


        int[] arr5 = {1, 2, 3, 4, 5}; //Odd length array
        findLargestOfThree(arr5); //Output: Array must have even length


    }

    public static void findLargestOfThree(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("Array is empty");
            return;
        }

        if(arr.length % 2 != 0){
            System.out.println("Array must have even length");
            return;
        }

        int first = arr[0];
        int middle = arr[arr.length / 2 -1 ]; // Middle element for arrays of even length
        int last = arr[arr.length - 1];



        int largest = first;

        if (middle > largest) {
            largest = middle;
        }

        if (last > largest) {
            largest = last;
        }

        System.out.println(largest);
    }
}
