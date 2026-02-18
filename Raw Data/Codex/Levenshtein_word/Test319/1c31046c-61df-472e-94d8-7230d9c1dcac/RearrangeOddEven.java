public class RearrangeOddEven {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10}; // Example array

        int oddIndex = 0;
        int evenIndex = arr.length - 1;

        while (oddIndex < evenIndex) {
            if (arr[oddIndex] % 2 == 0) { // Current element is even
                if (arr[evenIndex] % 2 != 0) { // Element at the end is odd
                    // Swap
                    int temp = arr[oddIndex];
                    arr[oddIndex] = arr[evenIndex];
                    arr[evenIndex] = temp;
                    oddIndex++;
                    evenIndex--;
                } else { // Element at the end is also even
                    evenIndex--; // Move evenIndex towards the beginning
                }
            } else {  // Current element is odd
                oddIndex++; // Move oddIndex towards the end
            }
        }


        // Print the rearranged array
        System.out.print("Rearranged array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();


        //Another example to demonstrate  it works with arrays that initially have odds at the end and evens at the beginning.
         int[] arr2 = {2, 4, 6, 8, 1, 3, 5, 7};


         oddIndex = 0;
         evenIndex = arr2.length - 1;

        while (oddIndex < evenIndex) {
            if (arr2[oddIndex] % 2 == 0) { 
                if (arr2[evenIndex] % 2 != 0) { 
                    int temp = arr2[oddIndex];
                    arr2[oddIndex] = arr2[evenIndex];
                    arr2[evenIndex] = temp;
                    oddIndex++;
                    evenIndex--;
                } else { 
                    evenIndex--; 
                }
            } else {  
                oddIndex++;
            }
        }


        System.out.print("Rearranged array 2: ");
        for (int num : arr2) {
            System.out.print(num + " ");
        }
        System.out.println();



    }
}
