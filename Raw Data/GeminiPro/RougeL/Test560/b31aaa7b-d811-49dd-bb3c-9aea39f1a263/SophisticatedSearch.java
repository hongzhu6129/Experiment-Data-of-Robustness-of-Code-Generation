import java.util.ArrayList;
import java.util.List;

public class SophisticatedSearch {

    public static void main(String[] args) {
        // Create a sophisticated list (e.g., an ArrayList of custom objects)
        List<Item> items = new ArrayList<>();
        items.add(new Item("Apple", 1));
        items.add(new Item("Banana", 2));
        items.add(new Item("Orange", 3));
        items.add(new Item("Grape", 4));

        // Element to search for
        String searchName = "Orange";

        // Search for the element by name
        Item foundItem = searchByName(items, searchName);

        // Display the search results
        if (foundItem != null) {
            System.out.println("Found item: " + foundItem.getName() + " (ID: " + foundItem.getId() + ")");
        } else {
            System.out.println("Item not found: " + searchName);
        }

        // Example searching by ID:
        int searchId = 2;
        Item foundItemById = searchById(items,searchId);
        if (foundItemById != null) {
            System.out.println("Found item by ID: " + foundItemById.getName() + " (ID: " + foundItemById.getId() + ")");
        } else {
            System.out.println("Item with ID " + searchId + " not found.");
        }



    }

    // Helper method to search by name (you can adapt this to your specific object type)
    private static Item searchByName(List<Item> items, String name) {
        for (Item item : items) {
            if (item.getName().equals(name)) {
                return item; // Return the item if found
            }
        }
        return null; // Return null if not found
    }


    // Helper method to search by ID
    private static Item searchById(List<Item> items, int id) {
        for (Item item : items) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }



    // Example custom object class (replace with your actual object)
    private static class Item {
        private String name;
        private int id;

        public Item(String name, int id) {
            this.name = name;
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public int getId() {
            return id;
        }
    }
}
