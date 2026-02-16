public class StringCombination {

    public static void main(String[] args) {
        String str1 = "Python";
        String str2 = "Tutorial";

        String short_string;
        String long_string;

        if (str1.length() < str2.length()) {
            short_string = str1;
            long_string = str2;
        } else if (str1.length() > str2.length()) {
            short_string = str2;
            long_string = str1;
        } else {
            System.out.println("Strings must have different lengths.");
            return; // Exit if lengths are equal
        }

        String combined_string = short_string + long_string + short_string;
        System.out.println(combined_string);


    }
}
