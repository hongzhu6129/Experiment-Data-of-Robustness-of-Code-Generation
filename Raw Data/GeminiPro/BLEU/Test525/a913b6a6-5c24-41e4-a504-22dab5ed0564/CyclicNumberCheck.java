public class CyclicNumberCheck {

    public static void main(String[] args) {
        int num = 142857; // Example cyclic number.  You can change this to test other numbers.

        if (isCyclic(num)) {
            System.out.println(num + " is a cyclic number.");
        } else {
            System.out.println(num + " is not a cyclic number.");
        }
    }

    private static boolean isCyclic(int num) {
        String numStr = String.valueOf(num);
        int n = numStr.length();

        for (int i = 2; i <= n; i++) {
            int multiple = num * i;
            String multipleStr = String.valueOf(multiple);

            if (multipleStr.length() != n) {
                return false; // Multiples must have same number of digits
            }
            if (!containsSameDigits(numStr, multipleStr)) {
                return false; // Multiples must contain the same digits in a cyclic permutation
            }
        }

        return true;
    }



    private static boolean containsSameDigits(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        String concatenatedS1 = s1 + s1; 

        return concatenatedS1.contains(s2);  // Check if s2 is a rotated version of s1
    }
}
