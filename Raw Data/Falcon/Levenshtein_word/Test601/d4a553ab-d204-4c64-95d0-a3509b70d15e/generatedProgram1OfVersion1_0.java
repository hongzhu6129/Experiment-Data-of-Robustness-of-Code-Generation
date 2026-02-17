public class CheckG {

    public static void main(String[] args) {
        String inputString = "programming";
        String result = validate(inputString);
        System.out.println(result);

        inputString = "hello";
        result = validate(inputString);
        System.out.println(result);


        inputString = "bigger";
        result = validate(inputString);
        System.out.println(result);

        inputString = ""; // Empty string
        result = validate(inputString);
        System.out.println(result);

         inputString = null; // Null string
        result = validate(inputString);
        System.out.println(result);

    }

    public static String validate(String str) {
        if (str == null || str.isEmpty()) {
            return "String is empty or null";
        }
        if (str.contains("g")) {
            return "Found 'g'";
        } else {
            return "Did not find 'g'";
        }
    }
}
