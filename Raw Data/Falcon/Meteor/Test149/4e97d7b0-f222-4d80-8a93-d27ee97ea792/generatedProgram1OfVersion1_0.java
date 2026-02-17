import java.util.HashSet;

public class HashSetSize {

    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> forms = new HashSet<>();

        // Add some forms to the HashSet
        forms.add("Form A");
        forms.add("Form B");
        forms.add("Form C");
        forms.add("Form D");
        forms.add("Form A"); // Adding a duplicate, which will be ignored

        // Get the number of forms (size of the HashSet)
        int numberOfForms = forms.size();

        // Print the number of forms
        System.out.println("The number of forms in the HashSet is: " + numberOfForms); 
    }
}
