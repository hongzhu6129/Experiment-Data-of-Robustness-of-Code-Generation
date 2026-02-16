public class RotateArray {

    public static void main(String[] args) {
        int[] originalArray = {20, 30, 40};

        // Rotate the array to the left
        int[] rotatedArray = new int[originalArray.length];
        for (int i = 0; i < originalArray.length; i++) {
            rotatedArray[i] = originalArray[(i + 1) % originalArray.length]; 
        }


        // Print the rotated array
        System.out.print("Rotated Array: [");
        for (int i = 0; i < rotatedArray.length; i++) {
            System.out.print(rotatedArray[i]);
            if (i < rotatedArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
