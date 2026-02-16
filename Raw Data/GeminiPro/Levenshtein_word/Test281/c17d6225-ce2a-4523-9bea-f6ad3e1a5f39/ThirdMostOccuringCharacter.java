import java.util.Scanner;

public class ThirdMostOccuringCharacter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string from the user.
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();

        // Find the third most occurring character in the string.
        char thirdMostOccuringCharacter = findThirdMostOccuringCharacter(inputString);

        // Print the third most occurring character.
        System.out.println("The third most occurring character in the string is: " + thirdMostOccuringCharacter);
    }

    public static char findThirdMostOccuringCharacter(String inputString) {
        // Create an array to store the count of each character in the string.
        int[] characterCounts = new int[256];

        // Iterate over the string and count the occurrence of each character.
        for (char character : inputString.toCharArray()) {
            characterCounts[character]++;
        }

        // Find the third most occurring character.
        char thirdMostOccuringCharacter = '\0';
        int thirdMostOccuringCount = 0;
        for (int i = 0; i < characterCounts.length; i++) {
            if (characterCounts[i] > thirdMostOccuringCount) {
                thirdMostOccuringCount = characterCounts[i];
                thirdMostOccuringCharacter = (char) i;
            }
        }

        // Return the third most occurring character.
        return thirdMostOccuringCharacter;
    }
}
