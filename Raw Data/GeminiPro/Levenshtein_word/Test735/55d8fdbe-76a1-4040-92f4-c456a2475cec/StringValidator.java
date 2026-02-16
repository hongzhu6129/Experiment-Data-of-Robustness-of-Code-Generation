import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringValidator {

    public static void main(String[] args) {
        String testString1 = "HelloWorld123";
        String testString2 = "HelloWorld!";
        String testString3 = "12345";
        String testString4 = "hello";

        System.out.println("\"" + testString1 + "\" is valid: " + validate(testString1));
        System.out.println("\"" + testString2 + "\" is valid: " + validate(testString2));
        System.out.println("\"" + testString3 + "\" is valid: " + validate(testString3));
        System.out.println("\"" + testString4 + "\" is valid: " + validate(testString4));
    }

    public static boolean validate(String str) {
        // Regular expression to match only a-z, A-Z, and 0-9
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9]+$"); // + means one or more characters
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();


        // Alternatively, you can use a loop and Character.isLetterOrDigit:
        //  if (str == null || str.isEmpty()) {  // Handle null or empty strings as needed
        //      return false; // Or true, depending on your requirements.
        //  }
        //  for (int i = 0; i < str.length(); i++) {
        //      if (!Character.isLetterOrDigit(str.charAt(i))) {
        //          return false;
        //      }
        //  }
        //  return true; 
    }
}
