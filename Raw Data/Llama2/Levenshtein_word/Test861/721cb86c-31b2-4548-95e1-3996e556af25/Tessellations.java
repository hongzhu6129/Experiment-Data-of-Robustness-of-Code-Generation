public class Tessellations {

    public static void main(String[] args) {
        int tessellations = 7;
        int flutes = 10;
        
        // Check corner cases
        if (tessellations <= 0 || flutes <= 0) {
            System.out.println("Invalid input");
        }
        else {
            // Calculate the number of flutes per tessellation
            double flutesPerTessellation = (double) flutes / tessellations;
            
            // Round the result to the nearest integer
            int roundedFlutesPerTessellation = Math.round(flutesPerTessellation);
            
            // Print the result
            System.out.println("Each tessellation can have up to " + roundedFlutesPerTessellation + " flutes.");
        }
    }
}
