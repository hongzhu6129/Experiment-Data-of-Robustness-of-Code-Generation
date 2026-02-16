import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import com.github.sarxos.webcam.Webcam;

public class WebcamHello {

    public static void main(String[] args) throws IOException {

        // Get default webcam
        Webcam webcam = Webcam.getDefault();

        if (webcam == null) {
            System.err.println("No webcam detected.");
            return;
        }

        // Open webcam
        webcam.open();

        // Get image from webcam
        BufferedImage image = webcam.getImage();

        // Create graphics object to draw on image
        Graphics2D g2d = image.createGraphics();
        g2d.setColor(Color.RED); // Set text color
        g2d.setFont(new Font("Arial", Font.BOLD, 20)); // Set font

        // Draw "hello"
        String helloText = "hello";
        FontMetrics fm = g2d.getFontMetrics();
        int textWidth = fm.stringWidth(helloText);
        int textHeight = fm.getHeight();
        int x = (image.getWidth() - textWidth) / 2;
        int y = (image.getHeight() - textHeight) / 2;
        g2d.drawString(helloText, x, y);


        // Draw your name (replace with your actual name)
        String name = "Your Name";  // <--- Change this to your name
        textWidth = fm.stringWidth(name);
        x = (image.getWidth() - textWidth) / 2;
        y += textHeight + 10; // Position below "hello"
        g2d.drawString(name, x, y);


        g2d.dispose();

        // Save image to file (optional) You can view this saved image
        ImageIO.write(image, "PNG", new File("hello-webcam.png"));


        // Display the image on the screen (using a simple window - you might need to adapt this part for your specific needs)
        SimpleImageDisplayer displayer = new SimpleImageDisplayer(image);


        // Close webcam
        webcam.close();
    }



     //  Inner class for simple image display (not robust, just for demonstration)
    static class SimpleImageDisplayer extends Frame {
        public SimpleImageDisplayer(Image image) {
            setTitle("Webcam Image");
            add(new Canvas() {
                public void paint(Graphics g) {
                    g.drawImage(image, 0, 0, null);
                }
            });
            pack();
            setVisible(true);


            // Add window listener to close the program when the window is closed
            addWindowListener(new java.awt.event.WindowAdapter() {
                public void windowClosing(java.awt.event.WindowEvent windowEvent) {
                    System.exit(0);
                }
            });
        }


    }

}
