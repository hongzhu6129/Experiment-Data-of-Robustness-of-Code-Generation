import java.util.Arrays;

public class MoveLowerCase {

    public static void main(String[] args) {
        String input = "HeLlOwoRlD";
        String result = validate(input);
        System.out.println(result); // Output: elloHLoOWrDl
        
        input = "PROGRAMMING";
        result = validate(input);
        System.out.println(result); // Output: PROGRAMMING (no lowercase)
        
        input = "hello";
        result = validate(input);
        System.out.println(result); // Output: hello (all lowercase)
    }

    public static String validate(String word) {
        char[] charArray = word.toCharArray();
        int lowerCaseIndex = 0;

        for (int i = 0; i < charArray.length; i++) {
            if (Character.isLowerCase(charArray[i])) {
                // Swap current lowercase char with the char at lowerCaseIndex
                char temp = charArray[i];
                charArray[i] = charArray[lowerCaseIndex];
                charArray[lowerCaseIndex] = temp;
                lowerCaseIndex++; 
            }
        }

        return new String(charArray);
    }
}
