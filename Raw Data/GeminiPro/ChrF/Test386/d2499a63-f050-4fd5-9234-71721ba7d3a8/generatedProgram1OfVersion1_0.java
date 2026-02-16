public class BreadSubstring {

    public String pickMiddleOfBread(String bread) {
        int firstToast = bread.indexOf("toast");
        int lastToast = bread.lastIndexOf("toast");

        if (firstToast == -1 || lastToast == -1 || firstToast == lastToast) {
            return ""; // "toast" doesn't exist or appears only once
        }

        return bread.substring(firstToast + "toast".length(), lastToast);
    }

    public static void main(String[] args) {
        BreadSubstring slicer = new BreadSubstring();

        System.out.println(slicer.pickMiddleOfBread("toastjamtoast")); // Output: jam
        System.out.println(slicer.pickMiddleOfBread("toastpeanutbuttertoast")); // Output: peanutbutter
        System.out.println(slicer.pickMiddleOfBread("toasttoast")); // Output: 
        System.out.println(slicer.pickMiddleOfBread("jamtoast")); // Output:
        System.out.println(slicer.pickMiddleOfBread("toast")); // Output:
        System.out.println(slicer.pickMiddleOfBread("bread")); // Output:
        System.out.println(slicer.pickMiddleOfBread("toastbutterjamtoastavocado")); // Output: butterjam
    }
}
