public class Main {
    public static void main(String[] args) {
        String str = "pythonpyt";

        if (str.length() % 2 == 0) {
            int halfLength = str.length() / 2;
            String firstHalf = str.substring(0, halfLength);
            System.out.println(firstHalf); // Output: python
        } else {
            System.out.println("String length is not even.");
        }


    }
}
