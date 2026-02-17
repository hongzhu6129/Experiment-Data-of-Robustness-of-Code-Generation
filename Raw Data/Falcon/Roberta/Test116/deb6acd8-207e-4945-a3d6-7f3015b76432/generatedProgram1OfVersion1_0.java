public class CreateArrayAfter10 {

    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 10, 11, 12, 13, 10, 14, 15};
        //int[] originalArray = {1, 2, 3}; // Test case: no 10 found
        //int[] originalArray = {1, 2, 3, 10}; // Test case: 10 is the last element

        int last10Index = -1;
        for (int i = 0; i < originalArray.length; i++) {
            if (originalArray[i] == 10) {
                last10Index = i;
            }
        }

        if (last10Index != -1 && last10Index < originalArray.length - 1) {
            int newArrayLength = originalArray.length - last10Index - 1;
            int[] newArray = new int[newArrayLength];
            for (int i = 0; i < newArrayLength; i++) {
                newArray[i] = originalArray[last10Index + 1 + i];
            }

            System.out.print("New array: ");
            for (int num : newArray) {
                System.out.print(num + " ");
            }
            System.out.println();

        } else {
            System.out.println("No elements after the last 10 found, or 10 not found.");
        }
    }
}
