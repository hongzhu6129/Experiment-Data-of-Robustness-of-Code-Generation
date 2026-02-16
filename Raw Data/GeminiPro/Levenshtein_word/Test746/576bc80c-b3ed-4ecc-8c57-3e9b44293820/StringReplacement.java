public class StringReplacement {

    public static void main(String[] args) {
        String inputString = "I love python and python coding.";
        String outputString = validate(inputString);
        System.out.println(outputString); 

        inputString = "python is popular.";
        outputString = validate(inputString);
        System.out.println(outputString);
    }

    public static String validate(String input) {
        // Use replaceAll to replace all occurrences
        return input.replaceAll("python", "Java").replaceAll("coding", "coding"); 
    }
}
