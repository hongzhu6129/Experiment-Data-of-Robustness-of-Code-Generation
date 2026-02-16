public class FocusString {

    public static void main(String[] args) {
        // Sample string (represented as a character array)
        char[] charArray = {'h', 'e', 'l', 'l', 'o', ' ', 'w', 'o', 'r', 'l', 'd'};

        // Focus the string by removing leading/trailing spaces and reducing multiple
        // internal spaces to single spaces.

        // 1. Calculate start and end indices of the non-space characters
        int startIndex = 0;
        while (startIndex < charArray.length && charArray[startIndex] == ' ') {
            startIndex++;
        }

        int endIndex = charArray.length - 1;
        while (endIndex >= 0 && charArray[endIndex] == ' ') {
            endIndex--;
        }


        if (startIndex > endIndex) {
            // The array contains only spaces, so return an empty string
            System.out.println(""); 
            return;
        }


        // 2. Create a new char array to hold the focused string
        StringBuilder focusedString = new StringBuilder();

        // 3. Copy characters from the original array to the new array, handling spaces
        for (int i = startIndex; i <= endIndex; i++) {
            if (charArray[i] != ' ') {
                focusedString.append(charArray[i]);
            } else {
                // Only append a space if the previous character was not a space
                if (focusedString.length() > 0 && focusedString.charAt(focusedString.length() - 1) != ' ') {
                    focusedString.append(' ');
                }
            }
        }


        System.out.println(focusedString.toString());
    }
}
