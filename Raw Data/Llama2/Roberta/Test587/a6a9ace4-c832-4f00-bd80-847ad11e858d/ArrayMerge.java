public class ArrayMerge {

    public static void main(String[] args) {
        int[] arr1 = {1, 2};
        int[] arr2 = {3, 4};

        int[] newArr = new int[2];

        newArr[0] = arr1[0];
        newArr[1] = arr2[arr2.length - 1];


        System.out.print("[");
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i]);
            if (i < newArr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]"); 
    }
}
