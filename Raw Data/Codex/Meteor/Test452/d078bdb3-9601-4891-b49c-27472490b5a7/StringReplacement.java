public class StringReplacement {

    public static void main(String[] args) {
        String inputString = "I love Python and I am learning Python code.";
        String modifiedString = validate(inputString);
        System.out.println(modifiedString);

        inputString = "Python is a great language for code.";
        modifiedString = validate(inputString);
        System.out.println(modifiedString);


        inputString = "I'm coding in Python.";  // Example demonstrating multiple replacements
        modifiedString = validate(inputString);
        System.out.println(modifiedString);

    }

    public static String validate(String inputString) {
        String replacedString = inputString.replace("Python", "Java");
        replacedString = replacedString.replace("code", "coding");
        return replacedString;

    }
}
