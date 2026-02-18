public class ExtractFirstHalf {

    public static void main(String[] args) {
        String text = "pythonpyt"; // Test data

        if (text.length() % 2 == 0) {
            String firstHalf = text.substring(0, text.length() / 2);
            System.out.println(firstHalf);
        } else {
            System.out.println("String length is not even."); 
        }
    }
}
