import java.util.Scanner;

public class CyclicNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        int num = scanner.nextInt();
        scanner.close();

        if (isCyclic(num)) {
            System.out.println("It is a cyclic number.");
        } else {
            System.out.println("It is not a cyclic number.");
        }
    }


    private static boolean isCyclic(int num) {
        String numStr = String.valueOf(num);
        int n = numStr.length();

        for (int i = 2; i <= n; i++) {
            int product = num * i;
            String productStr = String.valueOf(product);

            if (productStr.length() != n || !containsSameDigits(numStr, productStr)) {
                return false;
            }

        }
        return true;
    }
    

    private static boolean containsSameDigits(String str1, String str2) {
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        java.util.Arrays.sort(arr1);
        java.util.Arrays.sort(arr2);
        return new String(arr1).equals(new String(arr2));
    }
}
