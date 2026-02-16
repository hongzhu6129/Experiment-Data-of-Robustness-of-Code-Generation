import java.util.Arrays;

public class CheckTen {

    public static void main(String[] args) {
        int[] array1 = {10, -20, 0, 30, 40, 60, 10};
        int[] array2 = {1, -20, 0, 30, 40, 60, 10};
        int[] array3 = {10, -20, 0, 30, 40, 60, 1};
        int[] array4 = {1, -20, 0, 30, 40, 60, 1};
        int[] array5 = {10}; //Invalid - less than 2 elements

        System.out.println(checkTen(array1)); // true
        System.out.println(checkTen(array2)); // true
        System.out.println(checkTen(array3)); // true
        System.out.println(checkTen(array4)); // false
       // System.out.println(checkTen(array5)); // ArrayIndexOutOfBoundsException (handled below)



    }

    public static boolean checkTen(int[] array) {
        if (array.length < 2) {
           //Throwing an exception is arguably better practice than returning a boolean in this invalid input case
            throw new IllegalArgumentException("Array length must be greater than or equal to 2.");
           // return false;  //Alternative: return false;
        }
        return array[0] == 10 || array[array.length - 1] == 10;
    }
}
