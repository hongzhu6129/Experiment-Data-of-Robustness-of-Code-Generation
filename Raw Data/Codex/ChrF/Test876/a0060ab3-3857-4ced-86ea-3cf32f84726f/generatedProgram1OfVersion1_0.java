import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class DivideAndPrintImage {

    public static void main(String[] args) {
        int numerator = 50;
        int denominator = 3;
        int result = numerator / denominator;

        // Create a blank image
        int width = 200;
        int height = 100;
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2d = image.createGraphics();

        // Set background color
        g2d.setColor(Color.WHITE);
        g2d.fillRect(0, 0, width, height);

        // Set text color and font
        g2d.setColor(Color.BLACK);
        g2d.setFont(new Font("Arial", Font.PLAIN, 24));

        // Draw the division and result on the image
        String text = numerator + "/" + denominator + ": " + result;
        FontMetrics fm = g2d.getFontMetrics();
        int x = (width - fm.stringWidth(text)) / 2;
        int y = (height - fm.getHeight()) / 2 + fm.getAscent();
        g2d.drawString(text, x, y);

        // Dispose of the graphics context
        g2d.dispose();

        // Save the image to a file
        try {
            File outputfile = new File("division_result.png");
            ImageIO.write(image, "png", outputfile);
            System.out.println("Image saved to division_result.png");
        } catch (IOException e) {
            System.err.println("Error saving image: " + e.getMessage());
        }


    }
}
