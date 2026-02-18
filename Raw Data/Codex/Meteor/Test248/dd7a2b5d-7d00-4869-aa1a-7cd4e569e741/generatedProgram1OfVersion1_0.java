public class SeparateConsonantsVowels {

    public static void main(String[] args) {
        String inputString = "Hello World"; // Example input
        String result = validate(inputString);
        System.out.println(result); 

        inputString = "aeiou"; // Example input with only vowels
        result = validate(inputString);
        System.out.println(result);

        inputString = "bcdfgh"; // Example input with only consonants
        result = validate(inputString);
        System.out.println(result);        

        inputString = ""; // Example input with empty string
        result = validate(inputString);
        System.out.println(result); 

        inputString = "12345"; // Example input with numbers and symbols
        result = validate(inputString);
        System.out.println(result); 
    }

    public static String validate(String inputString) {
        if (inputString == null) {
            return "Invalid input: null";
        }

        StringBuilder vowels = new StringBuilder();
        StringBuilder consonants = new StringBuilder();

        inputString = inputString.toLowerCase();  // Handle both uppercase and lowercase

        for (char c : inputString.toCharArray()) {
            if (Character.isLetter(c)) { // Only process letters 
                if ("aeiou".indexOf(c) != -1) {
                    vowels.append(c);
                } else {
                    consonants.append(c);
                }
            }
        }

        return "Vowels: " + vowels.toString() + ", Consonants: " + consonants.toString();
    }
}
