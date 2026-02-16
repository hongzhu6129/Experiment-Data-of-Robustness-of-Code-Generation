public class StringConcatenation {

    public static void main(String[] args) {
        String input1 = args[1];
        String input2 = args[2];

        System.out.println(concatenate(input1, input2));
    }

    public static String concatenate(String str1, String str2) {
        if (str1.length() == 0) {
            return str2;
        } else if (str2.length() == 0) {
            return str1;
        } else {
            return str1 + str2;
        }
    }
}
