import java.util.ArrayList;
import java.util.List;

public class SophisticatedListSearch {

    public static void main(String[] args) {
        // Create a sample sophisticated list (using ArrayList for demonstration)
        List<SophisticatedObject> sophisticatedList = new ArrayList<>();

        sophisticatedList.add(new SophisticatedObject("Apple", 1));
        sophisticatedList.add(new SophisticatedObject("Banana", 2));
        sophisticatedList.add(new SophisticatedObject("Orange", 3));
        sophisticatedList.add(new SophisticatedObject("Grape", 4));


        // Search for an element by a specific property (e.g., name)
        String searchName = "Orange";
        SophisticatedObject foundObject = searchByName(sophisticatedList, searchName);

        if (foundObject != null) {
            System.out.println("Found object: " + foundObject);
        } else {
            System.out.println("Object with name '" + searchName + "' not found.");
        }


        // Search for an element by another property (e.g., id)
        int searchId = 2;
        foundObject = searchById(sophisticatedList, searchId);


        if (foundObject != null) {
            System.out.println("Found object: " + foundObject);
        } else {
            System.out.println("Object with ID '" + searchId + "' not found.");
        }

    }


    // Helper method to search by name
    private static SophisticatedObject searchByName(List<SophisticatedObject> list, String name) {
        for (SophisticatedObject obj : list) {
            if (obj.getName().equals(name)) {
                return obj;
            }
        }
        return null; // Object not found
    }

    // Helper method to search by ID
    private static SophisticatedObject searchById(List<SophisticatedObject> list, int id) {
        for (SophisticatedObject obj : list) {
            if (obj.getId() == id) {
                return obj;
            }
        }
        return null; // Object not found
    }


}



// Example of a "sophisticated" object (replace with your actual object type)
class SophisticatedObject {
    private String name;
    private int id;

    public SophisticatedObject(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", ID: " + id;
    }
}




