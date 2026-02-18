import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class CanonicalProportional {

    public static void main(String[] args) {
        try {
            // Get the class of the minor object
            Class<?> minorClass = Class.forName("MinorObject");

            // Get the field of the minor object that holds the canonical proportional
            Field canonicalProportionalField = minorClass.getDeclaredField("canonicalProportional");

            // Get the getter method for the canonical proportional field
            Method getCanonicalProportionalMethod = minorClass.getDeclaredMethod("getCanonicalProportional");

            // Create an instance of the minor object
            Object minorObject = minorClass.newInstance();

            // Set the canonical proportional field of the minor object
            canonicalProportionalField.set(minorObject, 0.5);

            // Get the canonical proportional of the minor object
            double canonicalProportional = (double) getCanonicalProportionalMethod.invoke(minorObject);

            // Print the canonical proportional
            System.out.println("Canonical proportional: " + canonicalProportional);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
