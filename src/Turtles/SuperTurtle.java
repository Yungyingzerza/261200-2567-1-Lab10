package Turtles;

import java.awt.*;
import java.awt.image.BufferedImage;

public class SuperTurtle implements Runnable {

    private final Color[][] img;
    private final BufferedImage image;
    private final Turtle turtle;
    private final int offsetX;
    private final int offsetY;
    private final int startPointXAxis;
    private final int startPointYAxis;
    private final int endX;
    private final int endY;

    public SuperTurtle(Color[][] imgArray, BufferedImage image, int startPointXAxis, int startPointYAxis, int endX, int endY, int offsetX, int offsetY, Color turtleColor) {
        this.img = imgArray;
        this.image = image;
        turtle = new Turtle();
        turtle.fillColor(turtleColor);
        turtle.speed(0.005);
        this.startPointXAxis = startPointXAxis;
        this.startPointYAxis = startPointYAxis;
        this.offsetX = offsetX;
        this.offsetY = offsetY;
        this.endX = endX;
        this.endY = endY;
    }

    @Override
    public void run() {
        for (int x = startPointXAxis; x < endX; x++) {
            for (int y = startPointYAxis; y < endY; y++) {
                turtle.up();
                turtle.setPosition(x-offsetX,offsetY-y);
                turtle.down();
                draw(x, y);
            }
        }
    }

    private void draw(int x, int y) {
        // Get the RGB value of the pixel (x, y)
        int rgb = image.getRGB(x, y);
        // Convert RGB to Color
        Color color = new Color(rgb);
        img[x][y] = color;

        Color colorAtZeroZero = img[x][y];
        turtle.penColor(colorAtZeroZero);
        turtle.forward(1);
    }
}
