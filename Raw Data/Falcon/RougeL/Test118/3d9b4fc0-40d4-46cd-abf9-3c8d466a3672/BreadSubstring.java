public class BreadSubstring {

    public String pickMiddleOfBread(String bread) {
        int firstToastIndex = bread.indexOf("toast");
        int lastToastIndex = bread.lastIndexOf("toast");

        if (firstToastIndex == -1 || firstToastIndex == lastToastIndex) {
            return ""; // "toast" doesn't exist or appears only once
        }

        return bread.substring(firstToastIndex + "toast".length(), lastToastIndex);
    }

    public static void main(String[] args) {
        BreadSubstring slicer = new BreadSubstring();

        System.out.println(slicer.pickMiddleOfBread("toastjamtoast")); // Output: jam
        System.out.println(slicer.pickMiddleOfBread("toastpeanutbuttertoast")); // Output: peanutbutter
        System.out.println(slicer.pickMiddleOfBread("toasttoast")); // Output: 
        System.out.println(slicer.pickMiddleOfBread("toast")); // Output: 
        System.out.println(slicer.pickMiddleOfBread("jam")); // Output: 
        System.out.println(slicer.pickMiddleOfBread("toastjam")); // Output:


    }
}
