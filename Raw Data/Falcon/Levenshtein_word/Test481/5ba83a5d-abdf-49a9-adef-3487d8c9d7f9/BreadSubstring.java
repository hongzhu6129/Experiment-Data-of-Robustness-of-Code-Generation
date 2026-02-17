public class BreadSubstring {

    public String pickMiddleOfBread(String bread) {
        int firstToast = bread.indexOf("toast");
        int secondToast = bread.indexOf("toast", firstToast + 1);

        if (firstToast == -1) {
            return ""; // "toast" not found
        }

        if (secondToast == -1) {
            return ""; // Only one "toast" found
        }

        return bread.substring(firstToast + "toast".length(), secondToast);
    }

    public static void main(String[] args) {
        BreadSubstring bread = new BreadSubstring();

        System.out.println(bread.pickMiddleOfBread("toastjamtoast")); // Output: jam
        System.out.println(bread.pickMiddleOfBread("toastpeanut buttertoast")); // Output: peanut butter
        System.out.println(bread.pickMiddleOfBread("toasttoast")); // Output: ""
        System.out.println(bread.pickMiddleOfBread("jam")); // Output: ""
        System.out.println(bread.pickMiddleOfBread("toastjam")); // Output: ""
        System.out.println(bread.pickMiddleOfBread("jamtoast")); // Output:""
        System.out.println(bread.pickMiddleOfBread("toast")); // Output: ""


    }
}
