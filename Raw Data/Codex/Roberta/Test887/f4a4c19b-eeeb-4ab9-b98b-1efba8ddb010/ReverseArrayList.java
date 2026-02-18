import java.util.ArrayList;
import java.util.Collections;

public class ReverseArrayList {

    public static void main(String[] args) {
        // Create an ArrayList of strings
        ArrayList<String> forms = new ArrayList<>();
        forms.add("Form A");
        forms.add("Form B");
        forms.add("Form C");
        forms.add("Form D");

        System.out.println("Original ArrayList: " + forms);

        // Reverse the ArrayList using Collections.reverse()
        Collections.reverse(forms);

        System.out.println("Reversed ArrayList: " + forms);


        //Alternative method using a loop (less efficient but demonstrates the logic):
        ArrayList<String> forms2 = new ArrayList<>();
        forms2.add("Form 1");
        forms2.add("Form 2");
        forms2.add("Form 3");
        forms2.add("Form 4");

        System.out.println("Original ArrayList 2: " + forms2);


        ArrayList<String> reversedForms2 = new ArrayList<>();
        for (int i = forms2.size() - 1; i >= 0; i--) {
            reversedForms2.add(forms2.get(i));
        }

        System.out.println("Reversed ArrayList 2 (loop method): " + reversedForms2);
    }
}
