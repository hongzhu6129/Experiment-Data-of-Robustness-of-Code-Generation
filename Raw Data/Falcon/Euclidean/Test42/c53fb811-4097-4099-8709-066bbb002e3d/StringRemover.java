public class StringRemover {

    public String removeString(String mainString, String preventString) {
        if (mainString == null || preventString == null) {
            return mainString; // Or handle null inputs as needed
        }

        return mainString.replace(preventString, ""); 
    }

    public static void main(String[] args) {
        StringRemover remover = new StringRemover();

        String mainString1 = "programmingisfunprogramming";
        String preventString1 = "programming";
        String result1 = remover.removeString(mainString1, preventString1);
        System.out.println("Result 1: " + result1); // Output: isfun

        String mainString2 = "hello world hello";
        String preventString2 = "hello";
        String result2 = remover.removeString(mainString2, preventString2);
        System.out.println("Result 2: " + result2); // Output:  world 

        String mainString3 = "abababa";
        String preventString3 = "ab";
        String result3 = remover.removeString(mainString3, preventString3);
        System.out.println("Result 3: " + result3); // Output: a

        String mainString4 = null;  // Test null input
        String preventString4 = "test";
        String result4 = remover.removeString(mainString4, preventString4);
        System.out.println("Result 4: " + result4); // Output: null


    }
}
