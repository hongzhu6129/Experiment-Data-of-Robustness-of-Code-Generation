import java.util.Arrays;

public class CompareArrays {

    public static <T> boolean compare_Arrays(T[] arr1, T[] arr2) {
        if (arr1 == null || arr2 == null) {
            return arr1 == arr2; // Both null or one null and one not null
        }

        if (arr1.length != arr2.length) {
            return false;
        }

        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        Integer[] arr1 = {1, 2, 3, 4, 5};
        Integer[] arr2 = {1, 2, 3, 4, 5};
        Integer[] arr3 = {1, 2, 3, 4, 6};
        Integer[] arr4 = {1, 2, 3, 4};
        Integer[] arr5 = null;
        Integer[] arr6 = null;


        System.out.println("arr1 and arr2 are equal: " + compare_Arrays(arr1, arr2)); // true
        System.out.println("arr1 and arr3 are equal: " + compare_Arrays(arr1, arr3)); // false
        System.out.println("arr1 and arr4 are equal: " + compare_Arrays(arr1, arr4)); // false
        System.out.println("arr1 and arr5 are equal: " + compare_Arrays(arr1, arr5)); // false
        System.out.println("arr5 and arr6 are equal: " + compare_Arrays(arr5, arr6)); // true


        String[] strArr1 = {"apple", "banana", "orange"};
        String[] strArr2 = {"apple", "banana", "orange"};
        String[] strArr3 = {"apple", "banana", "grape"};

        System.out.println("strArr1 and strArr2 are equal: " + compare_Arrays(strArr1, strArr2)); // true
        System.out.println("strArr1 and strArr3 are equal: " + compare_Arrays(strArr1, strArr3)); // false
    }
}
