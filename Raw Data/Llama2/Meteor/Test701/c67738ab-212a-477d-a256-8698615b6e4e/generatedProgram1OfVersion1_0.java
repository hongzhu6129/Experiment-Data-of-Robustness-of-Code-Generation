import java.awt.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class DivideAndPrint {

    public static void main(String[] args) {
        int num1 = 50;
        int num2 = 3;
        int result = num1 / num2;

        // Create a buffered image
        int width = 200;
        int height = 100;
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = image.createGraphics();

        // Set background color
        g2d.setColor(Color.WHITE);
        g2d.fillRect(0, 0, width, height);

        // Set text color and font
        g2d.setColor(Color.BLACK);
        g2d.setFont(new Font("Arial", Font.PLAIN, 24));

        // Draw the division equation and result
        String equation = num1 + " / " + num2 + " = " + result;
        FontMetrics fm = g2d.getFontMetrics();
        int x = (width - fm.stringWidth(equation)) / 2;
        int y = (height - fm.getHeight()) / 2 + fm.getAscent();
        g2d.drawString(equation, x, y);

        // Dispose of graphics context
        g2d.dispose();

        // Save the image to a file
        try {
            ImageIO.write(image, "png", new File("division_result.png"));
            System.out.println("Image saved to division_result.png");
        } catch (IOException e) {
            System.err.println("Error saving image: " + e.getMessage());
        }
    }
}
