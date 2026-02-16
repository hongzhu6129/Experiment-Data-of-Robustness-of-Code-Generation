public class BreadSubstring {

    public String pickMiddleOfBread(String str) {
        int firstIndex = str.indexOf("toast");
        int lastIndex = str.lastIndexOf("toast");

        if (firstIndex == -1 || firstIndex == lastIndex) {
            return ""; // "toast" doesn't exist or appears only once
        }

        return str.substring(firstIndex + "toast".length(), lastIndex);
    }

    public static void main(String[] args) {
        BreadSubstring bread = new BreadSubstring();

        System.out.println(bread.pickMiddleOfBread("toastjamtoast")); // Output: jam
        System.out.println(bread.pickMiddleOfBread("toastpeanutbuttertoast")); // Output: peanutbutter
        System.out.println(bread.pickMiddleOfBread("toasttoast")); // Output: 
        System.out.println(bread.pickMiddleOfBread("jamtoast")); // Output: 
        System.out.println(bread.pickMiddleOfBread("toastjam")); // Output: 
        System.out.println(bread.pickMiddleOfBread("justjam")); // Output: 
    }
}
