import java.util.List;
import java.util.Arrays;

public class PrintMaterials {

    public static void main(String[] args) {
        List<String> materials = Arrays.asList("wood", "metal", "glass", "plastic");
        printMaterials(materials);
    }

    public static void printMaterials(List<String> materials) {
        for (String material : materials) {
            System.out.println(material);
        }
    }
}
