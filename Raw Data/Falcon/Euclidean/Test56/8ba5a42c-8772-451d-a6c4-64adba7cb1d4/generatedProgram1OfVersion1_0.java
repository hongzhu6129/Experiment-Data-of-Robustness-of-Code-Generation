public class CombineFirstLast {

    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "world";

        System.out.println(function(str1, str2)); // Output: hld

        str1 = "";
        str2 = "Java";

        System.out.println(function(str1, str2)); // Output: #Ja

        str1 = "Python";
        str2 = "";

        System.out.println(function(str1, str2)); // Output: Pn#

        str1 = "";
        str2 = "";

        System.out.println(function(str1, str2)); // Output: ##

        str1 = "a";
        str2 = "b";

        System.out.println(function(str1, str2)); // Output: ab


    }

    public static String function(String str1, String str2) {
        char first1 = '#';
        char last1 = '#';
        char first2 = '#';
        char last2 = '#';


        if (str1.length() > 0) {
            first1 = str1.charAt(0);
            last1 = str1.charAt(str1.length() - 1);
        }

        if (str2.length() > 0) {

            first2 = str2.charAt(0);

            last2 = str2.charAt(str2.length() - 1);
        }

         return "" + first1 + last2; // Using "" + to efficiently convert chars to String



    }
}
