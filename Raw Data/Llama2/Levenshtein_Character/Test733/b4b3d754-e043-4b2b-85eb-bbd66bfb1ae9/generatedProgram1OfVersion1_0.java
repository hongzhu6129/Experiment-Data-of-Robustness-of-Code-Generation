import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class DivideAndPrintOnImage {

    public static void main(String[] args) {
        int numerator = 50;
        int denominator = 3;
        int result = numerator / denominator;

        // Create a blank image
        int width = 200;
        int height = 100;
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics g = image.getGraphics();

        // Set background color
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, width, height);

        // Set text color and font
        g.setColor(Color.BLACK);
        g.setFont(new Font("Arial", Font.BOLD, 20));

        // Draw the division expression and result
        String text = numerator + "/" + denominator + ": " + result;
        int x = (width - g.getFontMetrics().stringWidth(text)) / 2; // Center the text
        int y = height / 2 + g.getFontMetrics().getAscent() / 2; // Center vertically


        g.drawString(text, x, y);

        // Save the image to a file
        try {
            File output = new File("division_result.png");
            ImageIO.write(image, "png", output);
            System.out.println("Image saved to: " + output.getAbsolutePath());
        } catch (IOException e) {
            System.err.println("Error saving image: " + e.getMessage());
        }


        g.dispose(); // Release resources
    }
}
