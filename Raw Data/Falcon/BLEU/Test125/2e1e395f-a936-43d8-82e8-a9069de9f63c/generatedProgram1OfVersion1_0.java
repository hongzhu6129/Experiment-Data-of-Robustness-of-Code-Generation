public class ExtractFirstHalf {

    public static void main(String[] args) {
        String str = "pythonpyt"; // Tested data

        if (str.length() % 2 == 0) { // Check if string length is even
            int halfLength = str.length() / 2;
            String firstHalf = str.substring(0, halfLength);
            System.out.println(firstHalf); 
        } else {
            System.out.println("String length is not even.");
        }
    }
}
