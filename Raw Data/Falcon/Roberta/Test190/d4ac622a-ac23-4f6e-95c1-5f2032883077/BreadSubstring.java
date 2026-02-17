public class BreadSubstring {

    public String pickMiddleOfBread(String str) {
        int firstToast = str.indexOf("toast");
        int lastToast = str.lastIndexOf("toast");

        if (firstToast == -1 || lastToast == -1 || firstToast == lastToast) {
            return ""; // "toast" doesn't exist or appears only once
        }

        // Extract the substring between the first and last "toast"
        return str.substring(firstToast + "toast".length(), lastToast);
    }

    public static void main(String[] args) {
        BreadSubstring bread = new BreadSubstring();

        System.out.println(bread.pickMiddleOfBread("toastjamtoast")); // Output: jam
        System.out.println(bread.pickMiddleOfBread("toastbutterjamtoast")); // Output: butterjam
        System.out.println(bread.pickMiddleOfBread("toast")); // Output: 
        System.out.println(bread.pickMiddleOfBread("jam")); // Output: 
        System.out.println(bread.pickMiddleOfBread("toastjam")); // Output:
        System.out.println(bread.pickMiddleOfBread("jamtoast")); // Output:

    }
}
