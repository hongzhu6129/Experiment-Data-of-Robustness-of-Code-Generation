import java.util.Scanner;

public class FindFourthMostFrequentCharacter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the input string
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();

        // Create a character count map
        int[] charCountMap = new int[256];
        for (char c : inputString.toCharArray()) {
            charCountMap[c]++;
        }

        // Find the fourth most frequent character
        char fourthMostFrequentChar = findFourthMostFrequentCharacter(charCountMap);

        // Print the result
        System.out.println("The fourth most frequent character is: " + fourthMostFrequentChar);
    }

    public static char findFourthMostFrequentCharacter(int[] charCountMap) {
        // Find the four most frequent characters
        int[] mostFrequentChars = findMostFrequentCharacters(charCountMap, 4);

        // Return the fourth most frequent character
        return (char) mostFrequentChars[3];
    }

    public static int[] findMostFrequentCharacters(int[] charCountMap, int k) {
        // Create a min heap to store the k most frequent characters
        MinHeap minHeap = new MinHeap(k);

        // Add the characters to the min heap
        for (int i = 0; i < charCountMap.length; i++) {
            if (charCountMap[i] > 0) {
                minHeap.add(i, charCountMap[i]);
            }
        }

        // Remove the least frequent characters from the min heap
        while (minHeap.getSize() > k) {
            minHeap.remove();
        }

        // Return the k most frequent characters
        int[] mostFrequentChars = new int[k];
        for (int i = 0; i < k; i++) {
            mostFrequentChars[i] = minHeap.remove().getKey();
        }
        return mostFrequentChars;
    }
}
