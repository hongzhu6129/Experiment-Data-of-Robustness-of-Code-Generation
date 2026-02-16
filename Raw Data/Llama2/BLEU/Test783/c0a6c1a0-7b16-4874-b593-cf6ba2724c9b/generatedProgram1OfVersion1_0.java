import java.util.Scanner;

public class StringExclusion {

    public String excludeHash(String inputString) {
        if (inputString == null || inputString.isEmpty()) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == '#') {
                // Remove left adjacent character if it exists
                if (i > 0) {
                  int leftIndex =  result.length()-1;
                    if(leftIndex>=0){ //avoid index out of bounds in case # is at the beginning
                        result.deleteCharAt(leftIndex);
                    }

                }

                // Skip the '#' character

                // Remove right adjacent character if it exists
                if (i < inputString.length() - 1) {
                    i++; // Skip the next character
                }
            } else {
                result.append(inputString.charAt(i));
            }
        }
        return result.toString();
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        StringExclusion stringExclusion = new StringExclusion();
        String result = stringExclusion.excludeHash(inputString);

        System.out.println("Result: " + result);
        scanner.close();
    }
}
