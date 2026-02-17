public class InsertWordInMiddle {

    public static String insertWordInMiddle(String originalString, String wordToInsert) {
        int middleIndex = originalString.length() / 2;
        return originalString.substring(0, middleIndex) + wordToInsert + originalString.substring(middleIndex);
    }

    public static void main(String[] args) {
        String originalString = "Python";
        String wordToInsert = " Tutorial "; // Include spaces if desired

        String result = insertWordInMiddle(originalString, wordToInsert);
        System.out.println(result); // Output: Pyt Tutorial hon 
    }
}
