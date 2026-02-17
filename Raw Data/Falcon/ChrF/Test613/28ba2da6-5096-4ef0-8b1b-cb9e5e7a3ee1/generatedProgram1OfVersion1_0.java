public class StringReplacement {

    public static void main(String[] args) {
        String inputString = "I love python and python coding.";
        String outputString = validate(inputString);
        System.out.println(outputString); 

        inputString = "python is a great language for python coding. python!";
        outputString = validate(inputString);
        System.out.println(outputString);
    }

    public static String validate(String input) {
        // Use replaceAll to replace all occurrences
        String output = input.replaceAll("python", "Java").replaceAll("coding", "coding in Java"); 
        return output;
    }
}
