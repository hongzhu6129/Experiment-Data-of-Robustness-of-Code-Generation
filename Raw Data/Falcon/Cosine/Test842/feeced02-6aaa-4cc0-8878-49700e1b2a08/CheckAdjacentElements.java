public class CheckAdjacentElements {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 10, 10, 3, 4};
        int[] arr2 = {1, 2, 20, 20, 3, 4};
        int[] arr3 = {1, 2, 10, 10, 20, 20};
        int[] arr4 = {1, 2, 10, 3, 20, 4};

        System.out.println("arr1: " + checkArray(arr1)); // true
        System.out.println("arr2: " + checkArray(arr2)); // true
        System.out.println("arr3: " + checkArray(arr3)); // false
        System.out.println("arr4: " + checkArray(arr4)); // false

    }

    public static boolean checkArray(int[] arr) {
        boolean hasAdjacent10 = false;
        boolean hasAdjacent20 = false;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 10 && arr[i + 1] == 10) {
                hasAdjacent10 = true;
            }
            if (arr[i] == 20 && arr[i + 1] == 20) {
                hasAdjacent20 = true;
            }
        }

        return (hasAdjacent10 ^ hasAdjacent20); // XOR - only one should be true

    }
}
