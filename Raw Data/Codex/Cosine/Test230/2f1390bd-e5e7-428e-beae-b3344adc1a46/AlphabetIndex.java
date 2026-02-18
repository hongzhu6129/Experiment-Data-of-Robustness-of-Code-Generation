public class AlphabetIndex {

    public static void main(String[] args) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < alphabet.length(); i++) {
            char currentChar = alphabet.charAt(i);
            int index = i; // Index starts from 0

            System.out.println("Character: " + currentChar + ", Index: " + index);

        }


        // Alternatively, using character's ASCII value:
        System.out.println("\nUsing ASCII values:");
        for (char c = 'a'; c <= 'z'; c++) {
            int index = c - 'a'; // Calculate index based on ASCII difference
            System.out.println("Character: " + c + ", Index: " + index);
        }

    }
}
