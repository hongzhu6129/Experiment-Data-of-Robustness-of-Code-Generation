public class CompareStrings {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "world";
        String str3 = "hello";

        // Compare str1 and str2
        int comparisonResult1 = str1.compareTo(str2);
        if (comparisonResult1 == 0) {
            System.out.println(str1 + " and " + str2 + " are lexicographically equal.");
        } else if (comparisonResult1 < 0) {
            System.out.println(str1 + " is lexicographically less than " + str2 + ".");
        } else {
            System.out.println(str1 + " is lexicographically greater than " + str2 + ".");
        }

        // Compare str1 and str3
        int comparisonResult2 = str1.compareTo(str3);
        if (comparisonResult2 == 0) {
            System.out.println(str1 + " and " + str3 + " are lexicographically equal.");
        } else if (comparisonResult2 < 0) {
            System.out.println(str1 + " is lexicographically less than " + str3 + ".");
        } else {
            System.out.println(str1 + " is lexicographically greater than " + str3 + ".");
        }


        //Alternative approach using equals() for direct equality check:

        if (str1.equals(str2)) {
            System.out.println(str1 + " and " + str2 + " are lexicographically equal (using equals()).");
        } else {
            System.out.println(str1 + " and " + str2 + " are not lexicographically equal (using equals()).");
        }

        if (str1.equals(str3)) {
            System.out.println(str1 + " and " + str3 + " are lexicographically equal (using equals()).");
        } else {
            System.out.println(str1 + " and " + str3 + " are not lexicographically equal (using equals()).");
        }


    }
}
