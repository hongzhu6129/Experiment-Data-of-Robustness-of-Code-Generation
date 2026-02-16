public class OddEvenRearrange {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            // Find an even number from the left
            while (arr[left] % 2 != 0 && left < right) {
                left++;
            }

            // Find an odd number from the right
            while (arr[right] % 2 == 0 && left < right) {
                right--;
            }

            // Swap the even and odd numbers
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }
        }


        // Print the rearranged array
        System.out.print("Rearranged array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();


         //Example with more mixed elements:
         int[] arr2 = {2,4,1,7,9,6,3,8,5,10};
         left = 0;
         right = arr2.length -1;
          while (left < right) {
            // Find an even number from the left
            while (arr2[left] % 2 != 0 && left < right) {
                left++;
            }

            // Find an odd number from the right
            while (arr2[right] % 2 == 0 && left < right) {
                right--;
            }

            // Swap the even and odd numbers
            if (left < right) {
                int temp = arr2[left];
                arr2[left] = arr2[right];
                arr2[right] = temp;
                left++;
                right--;
            }
        }
        System.out.print("Rearranged array 2: ");
        for (int num : arr2) {
            System.out.print(num + " ");
        }
        System.out.println();

    }
}
