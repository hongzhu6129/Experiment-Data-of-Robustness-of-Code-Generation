public class ColorPicker {

    public String pickColor(String inputString) {
        if (inputString == null || inputString.isEmpty()) {
            return "";
        }

        if (inputString.startsWith("red")) {
            return "red";
        } else if (inputString.startsWith("black")) {
            return "black";
        } else {
            return "";
        }
    }

    public static void main(String[] args) {
        ColorPicker cp = new ColorPicker();

        System.out.println(cp.pickColor("redcar")); // Output: red
        System.out.println(cp.pickColor("blackboard")); // Output: black
        System.out.println(cp.pickColor("green")); // Output: 
        System.out.println(cp.pickColor(null)); // Output: 
        System.out.println(cp.pickColor("")); // Output: 
        System.out.println(cp.pickColor("red")); // Output: red
         System.out.println(cp.pickColor("black")); // Output: black

    }
}
