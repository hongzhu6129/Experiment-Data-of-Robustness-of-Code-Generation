public class BreadSubstring {

    public String pickMiddleOfBread(String str) {
        int firstOccurrence = str.indexOf("toast");
        int lastOccurrence = str.lastIndexOf("toast");

        if (firstOccurrence == -1 || firstOccurrence == lastOccurrence) {
            return ""; // "toast" doesn't exist or appears only once
        }

        // Extract the substring between the occurrences
        return str.substring(firstOccurrence + "toast".length(), lastOccurrence); 
    }

    public static void main(String[] args) {
        BreadSubstring bread = new BreadSubstring();

        System.out.println(bread.pickMiddleOfBread("toastjamtoast")); // Output: jam
        System.out.println(bread.pickMiddleOfBread("toastbutterjamtoast")); // Output: butterjam
        System.out.println(bread.pickMiddleOfBread("toasttoast")); // Output: ""
        System.out.println(bread.pickMiddleOfBread("jamtoast")); // Output: ""
        System.out.println(bread.pickMiddleOfBread("toastjam")); // Output: ""
        System.out.println(bread.pickMiddleOfBread("plainbread")); // Output: ""


    }
}
