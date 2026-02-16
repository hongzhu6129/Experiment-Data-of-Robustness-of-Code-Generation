// In-place partitioning (if signature change is allowed)
public static void partitionArray(int[] arr) {
    if (arr == null) return;

    int left = 0;
    int right = arr.length - 1;

    while (left < right) {
        while (left < right && arr[left] % 2 == 0) {
            left++;
        }
        while (left < right && arr[right] % 2 != 0) {
            right--;
        }
        if (left < right) {
            // Swap
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}
