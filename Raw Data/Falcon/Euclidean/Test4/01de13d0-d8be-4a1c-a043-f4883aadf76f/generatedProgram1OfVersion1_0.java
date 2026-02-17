import java.util.*;

public class FindProductsWithOneWord {

    public static void main(String[] args) {
        // Create a list of products
        List<String> products = new ArrayList<>();
        products.add("Apple");
        products.add("Banana");
        products.add("Orange");
        products.add("Strawberry");
        products.add("Grape");
        products.add("Pineapple");
        products.add("Watermelon");
        products.add("Mango");
        products.add("Peach");
        products.add("Pear");

        // Find the products that contain only one word
        List<String> productsWithOneWord = findProductsWithOneWord(products);

        // Print the products
        for (String product : productsWithOneWord) {
            System.out.println(product);
        }
    }

    public static List<String> findProductsWithOneWord(List<String> products) {
        List<String> productsWithOneWord = new ArrayList<>();

        for (String product : products) {
            if (product.split(" ").length == 1) {
                productsWithOneWord.add(product);
            }
        }

        return productsWithOneWord;
    }
}
