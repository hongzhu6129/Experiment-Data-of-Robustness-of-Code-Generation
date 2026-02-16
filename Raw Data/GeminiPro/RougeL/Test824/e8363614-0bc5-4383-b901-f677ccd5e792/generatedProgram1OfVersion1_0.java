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

        // Create a BufferedImage object
        int width = 200;
        int height = 100;
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

        // Get the Graphics2D object to draw on the image
        Graphics2D g2d = image.createGraphics();

        // Set background color
        g2d.setColor(Color.WHITE);
        g2d.fillRect(0, 0, width, height);

        // Set text color and font
        g2d.setColor(Color.BLACK);
        g2d.setFont(new Font("Arial", Font.PLAIN, 20));

        // Draw the division expression and result
        String text = num1 + " / " + num2 + " = " + result;
        FontMetrics fm = g2d.getFontMetrics();
        int x = (width - fm.stringWidth(text)) / 2;
        int y = (height - fm.getHeight()) / 2 + fm.getAscent();
        g2d.drawString(text, x, y);


        g2d.dispose();

        // Save the image to a file
        try {
            File outputfile = new File("division_result.png");
            ImageIO.write(image, "png", outputfile);
            System.out.println("Image saved to division_result.png");
        } catch (IOException e) {
            System.out.println("Error saving image: " + e.getMessage());
        }
    }
}


