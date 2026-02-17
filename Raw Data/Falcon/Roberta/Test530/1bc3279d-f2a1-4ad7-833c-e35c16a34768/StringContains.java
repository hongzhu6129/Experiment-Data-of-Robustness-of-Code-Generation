public class StringContains {

    public static void main(String[] args) {
        String mainString = "This is a test string.";
        String subString1 = "test";
        String subString2 = "xyz";

        System.out.println("\"" + mainString + "\" contains \"" + subString1 + "\": " + is_present(mainString, subString1)); // Output: true
        System.out.println("\"" + mainString + "\" contains \"" + subString2 + "\": " + is_present(mainString, subString2)); // Output: false


        // Additional test cases (optional):
        System.out.println("\"" + mainString + "\" contains \"" + "This" + "\": " + is_present(mainString, "This")); //true
        System.out.println("\"" + mainString + "\" contains \"" + "string." + "\": " + is_present(mainString,"string."));//true
        System.out.println("\"" + mainString + "\" contains \"" + " " + "\": " + is_present(mainString," ")); //true
        System.out.println("\"" + "" + "\" contains \"" + "" + "\": " + is_present("","")); //true (empty string contains empty string)
        System.out.println("\"" + "hello" + "\" contains \"" + "world" + "\": " + is_present("hello","world")); //false

    }

    public static boolean is_present(String mainStr, String subStr) {
        return mainStr.contains(subStr); 
    }
}
